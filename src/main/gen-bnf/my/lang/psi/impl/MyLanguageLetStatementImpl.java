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

public class MyLanguageLetStatementImpl extends ASTWrapperPsiElement implements MyLanguageLetStatement {

  public MyLanguageLetStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull MyLanguageVisitor<R> visitor) {
    return visitor.visitLetStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MyLanguageVisitor) accept((MyLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MyLanguageExpress getExpress() {
    return findChildByClass(MyLanguageExpress.class);
  }

  @Override
  @Nullable
  public MyLanguageFnInvokeExpress getFnInvokeExpress() {
    return findChildByClass(MyLanguageFnInvokeExpress.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(MY_ID);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(MY_NUMBER);
  }

}
