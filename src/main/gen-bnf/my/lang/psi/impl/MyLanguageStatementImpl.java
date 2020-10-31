// license.txt
package my.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.psi.MyLanguageTypes.*;
import my.lang.psi.*;
import com.intellij.navigation.ItemPresentation;

public class MyLanguageStatementImpl extends MyLanguageCodeElementImpl implements MyLanguageStatement {

  public MyLanguageStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull MyLanguageVisitor<R> visitor) {
    return visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MyLanguageVisitor) accept((MyLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MyLanguageBreakStatement getBreakStatement() {
    return findChildByClass(MyLanguageBreakStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageContinueStatement getContinueStatement() {
    return findChildByClass(MyLanguageContinueStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageFnDefineStatement getFnDefineStatement() {
    return findChildByClass(MyLanguageFnDefineStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageFnInvokeStatement getFnInvokeStatement() {
    return findChildByClass(MyLanguageFnInvokeStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageForStatement getForStatement() {
    return findChildByClass(MyLanguageForStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageIfStatement getIfStatement() {
    return findChildByClass(MyLanguageIfStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageLetStatement getLetStatement() {
    return findChildByClass(MyLanguageLetStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageNewStatement getNewStatement() {
    return findChildByClass(MyLanguageNewStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageReturnStatement getReturnStatement() {
    return findChildByClass(MyLanguageReturnStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageThreeStatement getThreeStatement() {
    return findChildByClass(MyLanguageThreeStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageThrowStatement getThrowStatement() {
    return findChildByClass(MyLanguageThrowStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageTryStatement getTryStatement() {
    return findChildByClass(MyLanguageTryStatement.class);
  }

  @Override
  @Nullable
  public MyLanguageWhileStatement getWhileStatement() {
    return findChildByClass(MyLanguageWhileStatement.class);
  }

  @Override
  @Nullable
  public PsiElement getLineComment() {
    return findChildByType(MY_LINE_COMMENT);
  }

  @Override
  public String getName() {
    return MyLanguagePsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return MyLanguagePsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return MyLanguagePsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return MyLanguagePsiImplUtil.getPresentation(this);
  }

}
