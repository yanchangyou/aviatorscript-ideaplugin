

package my.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author yanchangyou
 */
public class MyLanguageCodeElementImpl extends ASTWrapperPsiElement {

    public MyLanguageCodeElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
