package my.lang.action;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import org.jetbrains.annotations.NotNull;

import static my.lang.MyLanguage.LANG_NAME;
import static my.lang.MyLanguage.LANG_STRING_LOGO;
import static my.lang.action.ScriptRunCodeAction.projectConsoleViewMap;

/**
 * @author yanchangyou
 */
public class ScriptConsoleWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        RunCodeAction.initConsoleViewIfNeed(project, LANG_NAME, LANG_STRING_LOGO, projectConsoleViewMap);
    }
}
