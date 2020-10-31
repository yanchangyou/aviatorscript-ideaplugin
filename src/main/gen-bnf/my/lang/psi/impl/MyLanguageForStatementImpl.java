// license description
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

public class MyLanguageForStatementImpl extends ASTWrapperPsiElement implements MyLanguageForStatement {

  public MyLanguageForStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull MyLanguageVisitor<R> visitor) {
    return visitor.visitForStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MyLanguageVisitor) accept((MyLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MyLanguageCodes getCodes() {
    return findNotNullChildByClass(MyLanguageCodes.class);
  }

  @Override
  @NotNull
  public List<MyLanguageExpress> getExpressList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MyLanguageExpress.class);
  }

}
