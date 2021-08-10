package my.lang.action;

import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.project.Project;
import my.lang.MyLanguage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static my.lang.MyLanguage.LANG_NAME;
import static my.lang.MyLanguage.LANG_STRING_LOGO;

/**
 * @author yanchangyou
 */
public class ScriptRunCodeAction extends RunCodeAction {

    static final Map<Project, ConsoleView> projectConsoleViewMap = new ConcurrentHashMap<>();

    @Override
    public String getLanguageName() {
        return LANG_NAME;
    }

    @Override
    public String getLogoString() {
        return LANG_STRING_LOGO;
    }

    @Override
    public Map<Project, ConsoleView> getProjectConsoleViewMap() {
        return projectConsoleViewMap;
    }


    public static void main(String[] args) {
        String code = "1+1";
        System.out.println(code);
//        Object result = AviatorEvaluator.execute(code);
//        System.out.println(result);

    }
}