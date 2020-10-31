// license.txt
package my.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MyLanguageRelationExpress extends PsiElement {

  @Nullable
  MyLanguageExpress getExpress();

  @NotNull
  List<MyLanguageRefExpress> getRefExpressList();

  @NotNull
  List<MyLanguageValue> getValueList();

}
