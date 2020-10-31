// license.txt
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageIfStatement extends PsiElement {

  @NotNull
  List<MyLanguageCodes> getCodesList();

  @NotNull
  List<MyLanguageExpress> getExpressList();

}
