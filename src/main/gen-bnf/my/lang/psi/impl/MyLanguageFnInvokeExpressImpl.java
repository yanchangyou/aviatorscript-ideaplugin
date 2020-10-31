// license.txt
package my.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.psi.MyLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import my.lang.psi.*;

public class MyLanguageFnInvokeExpressImpl extends ASTWrapperPsiElement implements MyLanguageFnInvokeExpress {

  public MyLanguageFnInvokeExpressImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull MyLanguageVisitor<R> visitor) {
    return visitor.visitFnInvokeExpress(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MyLanguageVisitor) accept((MyLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MyLanguageRefExpress getRefExpress() {
    return findNotNullChildByClass(MyLanguageRefExpress.class);
  }

  @Override
  @NotNull
  public MyLanguageRelationExpress getRelationExpress() {
    return findNotNullChildByClass(MyLanguageRelationExpress.class);
  }

}
