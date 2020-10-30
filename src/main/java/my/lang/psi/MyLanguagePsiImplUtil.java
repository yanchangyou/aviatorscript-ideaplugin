package my.lang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import lang.psi.MyLanguageTypes;
import org.jetbrains.annotations.Nullable;
import my.lang.icon.MyLanguageIcons;

import javax.swing.*;

/**
 * @author yanchangyou
 */
public class MyLanguagePsiImplUtil {

    public static String getAction(MyLanguageStatement element) {
        return element.getText();
    }

    public static String getName(MyLanguageStatement element) {
        return getAction(element);
    }

    public static PsiElement setName(MyLanguageStatement element, String newName) {
        element.setName(newName);
        return element;
    }

    public static PsiElement getNameIdentifier(MyLanguageStatement element) {
        ASTNode keyNode = element.getNode().findChildByType(MyLanguageTypes.MY_STATEMENT);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final MyLanguageStatement element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return MyLanguageIcons.STATEMENT;
            }
        };
    }
}