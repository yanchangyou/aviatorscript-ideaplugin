// This is a generated file. Not intended for manual editing.
package my.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static lang.psi.MyLanguageTypes.*;
import static my.lang.parser.MyLanguageParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MyLanguageParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return myFile(b, l + 1);
  }

  /* ********************************************************** */
  // string|number|boolean
  public static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MY_CONTENT, "<content>");
    r = consumeToken(b, MY_STRING);
    if (!r) r = consumeToken(b, MY_NUMBER);
    if (!r) r = consumeToken(b, MY_BOOLEAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement*
  static boolean myFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "myFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "myFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // line_comment | block_comment | (action content)
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MY_STATEMENT, "<statement>");
    r = consumeToken(b, MY_LINE_COMMENT);
    if (!r) r = consumeToken(b, MY_BLOCK_COMMENT);
    if (!r) r = statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // action content
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MY_ACTION);
    r = r && content(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
