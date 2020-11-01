package my.lang;

import com.intellij.lang.Language;

/**
 * @author yanchangyou
 */
public class MyLanguage extends Language {

    public static final String LANG_STRING_LOGO = "\n    _        _       _             ____            _       _   \n"
            + "   / \\__   _(_) __ _| |_ ___  _ __/ ___|  ___ _ __(_)_ __ | |_ \n"
            + "  / _ \\ \\ / / |/ _` | __/ _ \\| '__\\___ \\ / __| '__| | '_ \\| __|\n"
            + " / ___ \\ V /| | (_| | || (_) | |   ___) | (__| |  | | |_) | |_ \n"
            + "/_/   \\_\\_/ |_|\\__,_|\\__\\___/|_|  |____/ \\___|_|  |_| .__/ \\__|\n"
            + "                                                    |_|        \n";
    public static final String LANG_NAME = "AviatorScript";
    public static final String LANG_FILE_SUFFIX= "av";

    public static final MyLanguage INSTANCE = new MyLanguage();

    private MyLanguage() {
        super(LANG_FILE_SUFFIX);
    }
}
