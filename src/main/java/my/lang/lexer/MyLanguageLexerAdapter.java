package my.lang.lexer;

import com.intellij.lexer.FlexAdapter;
import my.lang.parser._MyLanguageLexer;

/**
 * @author yanchangyou
 */
public class MyLanguageLexerAdapter extends FlexAdapter {

    public MyLanguageLexerAdapter() {
        super(new _MyLanguageLexer(null));
    }

}
