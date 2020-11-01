package my.lang.action;

import com.googlecode.aviator.AviatorEvaluator;
import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static my.lang.MyLanguage.LANG_FILE_SUFFIX;

/**
 * 插件父类
 *
 * @author yanchangyou
 * @date 2020-09-11 22:48:45
 */
public abstract class RunCodeAction extends AnAction {

    /**
     * 获取id
     *
     * @return
     */
    public abstract String getLanguageName();

    /**
     * 添加logo字符串
     *
     * @return
     */
    public abstract String getLogoString();

    /**
     * 获取 project到consoleView的映射
     *
     * @return
     */
    public abstract Map<Project, ConsoleView> getProjectConsoleViewMap();

    private final BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 10, 10, TimeUnit.MINUTES, workQueue);

    @Override
    public void actionPerformed(AnActionEvent e) {

        final Project project = e.getProject();

        initConsoleViewIfNeed(project, getLanguageName(), getLogoString(), getProjectConsoleViewMap());

        //检查文件后缀名是否满足 .script, .j2s
        if (!isScriptCode(e)) {
            print("This file can't execute!\n", project, getProjectConsoleViewMap());
            return;
        }

        final Editor editor = e.getData(CommonDataKeys.EDITOR);
        if (editor == null) {
            return;
        }
        final Document document = editor.getDocument();

        final String code = document.getText();

        threadPoolExecutor.submit(
                () -> {
                    String result;

                    PrintStream oldOut = System.out;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(byteArrayOutputStream));
                    try {
                        Object resultObject = AviatorEvaluator.execute(code);
                        if (resultObject == null) {
                            result = byteArrayOutputStream.toString();
                        } else {
                            result = resultObject.toString();
                        }

                    } catch (Exception exception) {
                        exception.printStackTrace();
                        result = "exception:" + exception.getMessage();
                        print(result + "\n", project, getProjectConsoleViewMap());
                        throw exception;
                    } finally {
                        System.setOut(oldOut);
                    }

                    System.out.println("execute " + getLanguageName() + " code result:");
                    System.out.println(result);

                    print(result, project, getProjectConsoleViewMap());

                });
    }

    public static synchronized void initConsoleViewIfNeed(Project project, String languageName, String logoString,
            Map<Project, ConsoleView> projectConsoleViewMap) {
        if (isInitiated(project, languageName, projectConsoleViewMap)) {
            return;
        }

        System.out.println(logoString);

        ToolWindow toolWindow = ToolWindowManager.getInstance(project)
                .getToolWindow(languageName + " Console");
        ConsoleView consoleView = TextConsoleBuilderFactory.getInstance().createBuilder(project)
                .getConsole();

        projectConsoleViewMap.put(project, consoleView);

        consoleView.allowHeavyFilters();
        Content content = toolWindow.getContentManager().getFactory()
                .createContent(consoleView.getComponent(), languageName, false);
        toolWindow.getContentManager().addContent(content);
        consoleView.print(logoString + "\n", ConsoleViewContentType.NORMAL_OUTPUT);
    }

    static boolean isInitiated(Project project, String languageName, Map<Project, ConsoleView> projectConsoleViewMap) {
        return projectConsoleViewMap.get(project) != null;
    }

    void print(String result, Project project, Map<Project, ConsoleView> projectConsoleViewMap) {
        projectConsoleViewMap.get(project).print(result, ConsoleViewContentType.NORMAL_OUTPUT);

        //低版本idea不支持此方法，兼容处理
        scrollToEnd(projectConsoleViewMap.get(project));
    }

    private void scrollToEnd(ConsoleView consoleView) {
        try {
            Method method = ConsoleView.class.getMethod("requestScrollingToEnd", new Class[0]);
            method.invoke(consoleView, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean isScriptCode(AnActionEvent event) {

        VirtualFile virtualFile = event.getData(CommonDataKeys.VIRTUAL_FILE);
        if (virtualFile == null) {
            return false;
        }
        String filePath = virtualFile.getPath();
        return filePath.endsWith(LANG_FILE_SUFFIX);
    }
}
