// license description
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageThreeExpress extends PsiElement {

  @NotNull
  List<MyLanguageExpress> getExpressList();

}
