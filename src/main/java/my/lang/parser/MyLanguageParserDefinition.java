package my.lang.parser;

import my.lang.lexer.MyLanguageLexerAdapter;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import my.lang.MyLanguage;
import my.lang.psi.MyLanguageFile;
import lang.psi.MyLanguageTypes;

/**
 * @author yanchangyou
 */
public class MyLanguageParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(MyLanguage.INSTANCE);

    /**
     * 词法分析器
     *
     * @param project
     * @return
     */
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new MyLanguageLexerAdapter();
    }

    /**
     * 语法分析器
     *
     * @param project
     * @return
     */
    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new MyLanguageParser();
    }

    /**
     * 注释
     *
     * @return
     */
    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new MyLanguageFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return MyLanguageTypes.Factory.createElement(node);
    }
}
