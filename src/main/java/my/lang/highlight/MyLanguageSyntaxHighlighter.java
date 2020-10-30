package my.lang.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import lang.psi.MyLanguageTypes;
import org.jetbrains.annotations.NotNull;
import my.lang.lexer.MyLanguageLexerAdapter;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * @author yanchangyou
 */
public class MyLanguageSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("lineComment", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("blockComment", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    public static final TextAttributesKey ACTION =
            createTextAttributesKey("action", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("number", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey STRING =
            createTextAttributesKey("string", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey BOOLEAN =
            createTextAttributesKey("boolean", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[] { BAD_CHARACTER };
    private static final TextAttributesKey[] COMMENTS_KEYS = new TextAttributesKey[] { LINE_COMMENT, BLOCK_COMMENT };
    private static final TextAttributesKey[] ACTION_KEYS = new TextAttributesKey[] { ACTION };
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[] { STRING };
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[] { NUMBER };
    private static final TextAttributesKey[] BOOLEAN_KEYS = new TextAttributesKey[] { BOOLEAN };
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MyLanguageLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MyLanguageTypes.MY_BLOCK_COMMENT) || tokenType
                .equals(MyLanguageTypes.MY_LINE_COMMENT)) {
            return COMMENTS_KEYS;
        } else if (tokenType.equals(MyLanguageTypes.MY_ACTION)) {
            return ACTION_KEYS;
        } else if (tokenType.equals(MyLanguageTypes.MY_NUMBER)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(MyLanguageTypes.MY_BOOLEAN)) {
            return BOOLEAN_KEYS;
        } else if (tokenType.equals(MyLanguageTypes.MY_STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}