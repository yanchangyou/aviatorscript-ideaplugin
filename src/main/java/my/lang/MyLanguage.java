package my.lang;

import com.intellij.lang.Language;

/**
 * @author yanchangyou
 */
public class MyLanguage extends Language {

    public static final MyLanguage INSTANCE = new MyLanguage();

    private MyLanguage() {
        super("my");
    }

}
