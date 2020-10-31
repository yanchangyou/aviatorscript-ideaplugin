// license.txt
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageForStatement extends PsiElement {

  @NotNull
  MyLanguageCodes getCodes();

  @NotNull
  List<MyLanguageExpress> getExpressList();

}
