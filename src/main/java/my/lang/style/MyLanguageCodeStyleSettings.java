package my.lang.style;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

/**
 * @author yanchangyou
 */
public class MyLanguageCodeStyleSettings extends CustomCodeStyleSettings {

    public MyLanguageCodeStyleSettings(CodeStyleSettings settings) {
        super("MyLanguageCodeStyleSettings", settings);
    }

}