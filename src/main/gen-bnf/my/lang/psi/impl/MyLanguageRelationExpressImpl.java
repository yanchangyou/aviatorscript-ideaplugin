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

public class MyLanguageRelationExpressImpl extends ASTWrapperPsiElement implements MyLanguageRelationExpress {

  public MyLanguageRelationExpressImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull MyLanguageVisitor<R> visitor) {
    return visitor.visitRelationExpress(this);
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
  @NotNull
  public List<MyLanguageRefExpress> getRefExpressList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MyLanguageRefExpress.class);
  }

  @Override
  @NotNull
  public List<MyLanguageValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MyLanguageValue.class);
  }

}
