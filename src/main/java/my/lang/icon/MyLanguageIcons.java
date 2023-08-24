package my.lang.icon;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * @author yanchangyou
 */
public class MyLanguageIcons {

    public static final Icon FILE = IconLoader.findIcon("my/lang/icon/av.svg", MyLanguageIcons.class.getClassLoader());

    public static final Icon STATEMENT = IconLoader.findIcon("my/lang/icon/action.svg", MyLanguageIcons.class.getClassLoader());

}
