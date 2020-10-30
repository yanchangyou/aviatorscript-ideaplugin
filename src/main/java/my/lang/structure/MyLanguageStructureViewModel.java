package my.lang.structure;

import my.lang.psi.MyLanguageFile;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * @author yanchangyou
 */
public class MyLanguageStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {

    public MyLanguageStructureViewModel(PsiFile psiFile) {
        super(psiFile, new MyLanuageStructureViewElement(psiFile));
    }

    @Override
    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[] { Sorter.ALPHA_SORTER };
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof MyLanguageFile;
    }

}
