package my.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import my.lang.icon.MyLanguageIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static my.lang.MyLanguage.LANG_FILE_SUFFIX;

/**
 * @author yanchangyou
 */
public class MyLanguageFileType extends LanguageFileType {

    public static final MyLanguageFileType INSTANCE = new MyLanguageFileType();

    private MyLanguageFileType() {
        super(MyLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return LANG_FILE_SUFFIX;
    }

    @NotNull
    @Override
    public String getDescription() {
        return LANG_FILE_SUFFIX + " language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return LANG_FILE_SUFFIX;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MyLanguageIcons.FILE;
    }

}
