//package my.lang.format;
//
//import my.lang.MyLanguage;
//import com.intellij.formatting.*;
//import com.intellij.lang.ASTNode;
//import com.intellij.openapi.util.TextRange;
//import com.intellij.psi.PsiElement;
//import com.intellij.psi.PsiFile;
//import com.intellij.psi.codeStyle.CodeStyleSettings;
//import lang.psi.MyLanguageTypes;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
///**
// * @author yanchangyou
// */
//public class MyLanguageFormattingModelBuilder implements FormattingModelBuilder {
//
//    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
//        return new SpacingBuilder(settings, MyLanguage.INSTANCE)
////                .around(MyLanguageTypes.MY_STATEMENT)
////                .spacing(1, 1, 1, true, 1)
//                .around(MyLanguageTypes.MY_LINE_COMMENT)
//                .spacing(1, 1, 1, true, 1)
//                ;
//    }
//
//    @Nullable
//    @Override
//    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
//        return null;
//    }
//
//}