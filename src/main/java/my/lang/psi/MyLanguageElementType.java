package my.lang.psi;

import my.lang.MyLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author yanchangyou
 */
public class MyLanguageElementType extends IElementType {

    public MyLanguageElementType(@NotNull @NonNls String debugName) {
        super(debugName, MyLanguage.INSTANCE);
    }

}
