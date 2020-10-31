// license.txt
package my.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static lang.psi.MyLanguageTypes.*;
import static my.lang.parser.MyLanguageParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MyLanguageParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
    parseLight(type, builder);
    return builder.getTreeBuilt();
  }

  public void parseLight(IElementType type, PsiBuilder builder) {
    boolean result;
    builder = adapt_builder_(type, builder, this, null);
    Marker marker = enter_section_(builder, 0, _COLLAPSE_, null);
    result = parse_root_(type, builder);
    exit_section_(builder, 0, marker, type, result, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType type, PsiBuilder builder) {
    return parse_root_(type, builder, 0);
  }

  static boolean parse_root_(IElementType type, PsiBuilder builder, int level) {
    return myFile(builder, level + 1);
  }

  /* ********************************************************** */
  // true|false
  public static boolean boolean_$(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "boolean_$")) return false;
    if (!nextTokenIs(builder, "<boolean $>", MY_FALSE, MY_TRUE)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_BOOLEAN, "<boolean $>");
    result = consumeToken(builder, MY_TRUE);
    if (!result) result = consumeToken(builder, MY_FALSE);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // break [SEMICOLON]
  public static boolean breakStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "breakStatement")) return false;
    if (!nextTokenIs(builder, MY_BREAK)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_BREAK);
    result = result && breakStatement_1(builder, level + 1);
    exit_section_(builder, marker, MY_BREAK_STATEMENT, result);
    return result;
  }

  // [SEMICOLON]
  private static boolean breakStatement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "breakStatement_1")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // statement*
  public static boolean codes(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "codes")) return false;
    Marker marker = enter_section_(builder, level, _NONE_, MY_CODES, "<codes>");
    while (true) {
      int pos = current_position_(builder);
      if (!statement(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "codes", pos)) break;
    }
    exit_section_(builder, level, marker, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // continue [SEMICOLON]
  public static boolean continueStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "continueStatement")) return false;
    if (!nextTokenIs(builder, MY_CONTINUE)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_CONTINUE);
    result = result && continueStatement_1(builder, level + 1);
    exit_section_(builder, marker, MY_CONTINUE_STATEMENT, result);
    return result;
  }

  // [SEMICOLON]
  private static boolean continueStatement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "continueStatement_1")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // relationExpress | PAREN_LEFT express PAREN_RIGHT
  public static boolean express(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "express")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_EXPRESS, "<express>");
    result = relationExpress(builder, level + 1);
    if (!result) result = express_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // PAREN_LEFT express PAREN_RIGHT
  private static boolean express_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "express_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_PAREN_LEFT);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // fn id PAREN_LEFT id {COMMA id}* PAREN_RIGHT BRACE_LEFT codes BRACE_RIGHT
  public static boolean fnDefineStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnDefineStatement")) return false;
    if (!nextTokenIs(builder, MY_FN)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_FN, MY_ID, MY_PAREN_LEFT, MY_ID);
    result = result && fnDefineStatement_4(builder, level + 1);
    result = result && consumeTokens(builder, 0, MY_PAREN_RIGHT, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_FN_DEFINE_STATEMENT, result);
    return result;
  }

  // {COMMA id}*
  private static boolean fnDefineStatement_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnDefineStatement_4")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!fnDefineStatement_4_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "fnDefineStatement_4", pos)) break;
    }
    return true;
  }

  // COMMA id
  private static boolean fnDefineStatement_4_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnDefineStatement_4_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_COMMA, MY_ID);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // refExpress [PAREN_LEFT relationExpress PAREN_RIGHT]
  public static boolean fnInvokeExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress")) return false;
    if (!nextTokenIs(builder, "<fn invoke express>", MY_DOLLAR, MY_ID)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_FN_INVOKE_EXPRESS, "<fn invoke express>");
    result = refExpress(builder, level + 1);
    result = result && fnInvokeExpress_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // [PAREN_LEFT relationExpress PAREN_RIGHT]
  private static boolean fnInvokeExpress_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1")) return false;
    fnInvokeExpress_1_0(builder, level + 1);
    return true;
  }

  // PAREN_LEFT relationExpress PAREN_RIGHT
  private static boolean fnInvokeExpress_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_PAREN_LEFT);
    result = result && relationExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // fnInvokeExpress [SEMICOLON]
  public static boolean fnInvokeStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeStatement")) return false;
    if (!nextTokenIs(builder, "<fn invoke statement>", MY_DOLLAR, MY_ID)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_FN_INVOKE_STATEMENT, "<fn invoke statement>");
    result = fnInvokeExpress(builder, level + 1);
    result = result && fnInvokeStatement_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // [SEMICOLON]
  private static boolean fnInvokeStatement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeStatement_1")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // for id in id [PAREN_LEFT express {COMMA express}*] BRACE_LEFT codes BRACE_RIGHT
  public static boolean forStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement")) return false;
    if (!nextTokenIs(builder, MY_FOR)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_FOR, MY_ID, MY_IN, MY_ID);
    result = result && forStatement_4(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_FOR_STATEMENT, result);
    return result;
  }

  // [PAREN_LEFT express {COMMA express}*]
  private static boolean forStatement_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4")) return false;
    forStatement_4_0(builder, level + 1);
    return true;
  }

  // PAREN_LEFT express {COMMA express}*
  private static boolean forStatement_4_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_PAREN_LEFT);
    result = result && express(builder, level + 1);
    result = result && forStatement_4_0_2(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {COMMA express}*
  private static boolean forStatement_4_0_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4_0_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!forStatement_4_0_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "forStatement_4_0_2", pos)) break;
    }
    return true;
  }

  // COMMA express
  private static boolean forStatement_4_0_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4_0_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_COMMA);
    result = result && express(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // if express BRACE_LEFT codes BRACE_RIGHT {elseif express BRACE_LEFT codes BRACE_RIGHT }* {else express BRACE_LEFT codes BRACE_RIGHT}*
  public static boolean ifStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement")) return false;
    if (!nextTokenIs(builder, MY_IF)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_IF);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    result = result && ifStatement_5(builder, level + 1);
    result = result && ifStatement_6(builder, level + 1);
    exit_section_(builder, marker, MY_IF_STATEMENT, result);
    return result;
  }

  // {elseif express BRACE_LEFT codes BRACE_RIGHT }*
  private static boolean ifStatement_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_5")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!ifStatement_5_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "ifStatement_5", pos)) break;
    }
    return true;
  }

  // elseif express BRACE_LEFT codes BRACE_RIGHT
  private static boolean ifStatement_5_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_5_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_ELSEIF);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {else express BRACE_LEFT codes BRACE_RIGHT}*
  private static boolean ifStatement_6(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_6")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!ifStatement_6_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "ifStatement_6", pos)) break;
    }
    return true;
  }

  // else express BRACE_LEFT codes BRACE_RIGHT
  private static boolean ifStatement_6_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_6_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_ELSE);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // [let] id [BRACK_LEFT number BRACK_RIGHT] EQ (express | fnInvokeExpress) [SEMICOLON]
  public static boolean letStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "letStatement")) return false;
    if (!nextTokenIs(builder, "<let statement>", MY_ID, MY_LET)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_LET_STATEMENT, "<let statement>");
    result = letStatement_0(builder, level + 1);
    result = result && consumeToken(builder, MY_ID);
    result = result && letStatement_2(builder, level + 1);
    result = result && consumeToken(builder, MY_EQ);
    result = result && letStatement_4(builder, level + 1);
    result = result && letStatement_5(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // [let]
  private static boolean letStatement_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "letStatement_0")) return false;
    consumeToken(builder, MY_LET);
    return true;
  }

  // [BRACK_LEFT number BRACK_RIGHT]
  private static boolean letStatement_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "letStatement_2")) return false;
    parseTokens(builder, 0, MY_BRACK_LEFT, MY_NUMBER, MY_BRACK_RIGHT);
    return true;
  }

  // express | fnInvokeExpress
  private static boolean letStatement_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "letStatement_4")) return false;
    boolean result;
    result = express(builder, level + 1);
    if (!result) result = fnInvokeExpress(builder, level + 1);
    return result;
  }

  // [SEMICOLON]
  private static boolean letStatement_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "letStatement_5")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // codes
  static boolean myFile(PsiBuilder builder, int level) {
    return codes(builder, level + 1);
  }

  /* ********************************************************** */
  // new refExpress PAREN_LEFT express PAREN_RIGHT [SEMICOLON]
  public static boolean newStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "newStatement")) return false;
    if (!nextTokenIs(builder, MY_NEW)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_NEW);
    result = result && refExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_LEFT);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_RIGHT);
    result = result && newStatement_5(builder, level + 1);
    exit_section_(builder, marker, MY_NEW_STATEMENT, result);
    return result;
  }

  // [SEMICOLON]
  private static boolean newStatement_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "newStatement_5")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // id {DOT id}* | DOLLAR number
  public static boolean refExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress")) return false;
    if (!nextTokenIs(builder, "<ref express>", MY_DOLLAR, MY_ID)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_REF_EXPRESS, "<ref express>");
    result = refExpress_0(builder, level + 1);
    if (!result) result = parseTokens(builder, 0, MY_DOLLAR, MY_NUMBER);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // id {DOT id}*
  private static boolean refExpress_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_ID);
    result = result && refExpress_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {DOT id}*
  private static boolean refExpress_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!refExpress_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "refExpress_0_1", pos)) break;
    }
    return true;
  }

  // DOT id
  private static boolean refExpress_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_DOT, MY_ID);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // (refExpress|value)   {(DASH | PLUS | MUL | PERCENT | FSLASH |bar |ANGLE_LEFT |ANGLE_LEFT EQ|ANGLE_RIGHT |ANGLE_RIGHT EQ|EQ EQ|AMP AMP|AMP TILDE) (refExpress|value)}* |(refExpress|value)  PAREN_LEFT express PAREN_RIGHT
  public static boolean relationExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_RELATION_EXPRESS, "<relation express>");
    result = relationExpress_0(builder, level + 1);
    if (!result) result = relationExpress_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // (refExpress|value)   {(DASH | PLUS | MUL | PERCENT | FSLASH |bar |ANGLE_LEFT |ANGLE_LEFT EQ|ANGLE_RIGHT |ANGLE_RIGHT EQ|EQ EQ|AMP AMP|AMP TILDE) (refExpress|value)}*
  private static boolean relationExpress_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = relationExpress_0_0(builder, level + 1);
    result = result && relationExpress_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // refExpress|value
  private static boolean relationExpress_0_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_0_0")) return false;
    boolean result;
    result = refExpress(builder, level + 1);
    if (!result) result = value(builder, level + 1);
    return result;
  }

  // {(DASH | PLUS | MUL | PERCENT | FSLASH |bar |ANGLE_LEFT |ANGLE_LEFT EQ|ANGLE_RIGHT |ANGLE_RIGHT EQ|EQ EQ|AMP AMP|AMP TILDE) (refExpress|value)}*
  private static boolean relationExpress_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!relationExpress_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "relationExpress_0_1", pos)) break;
    }
    return true;
  }

  // (DASH | PLUS | MUL | PERCENT | FSLASH |bar |ANGLE_LEFT |ANGLE_LEFT EQ|ANGLE_RIGHT |ANGLE_RIGHT EQ|EQ EQ|AMP AMP|AMP TILDE) (refExpress|value)
  private static boolean relationExpress_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = relationExpress_0_1_0_0(builder, level + 1);
    result = result && relationExpress_0_1_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // DASH | PLUS | MUL | PERCENT | FSLASH |bar |ANGLE_LEFT |ANGLE_LEFT EQ|ANGLE_RIGHT |ANGLE_RIGHT EQ|EQ EQ|AMP AMP|AMP TILDE
  private static boolean relationExpress_0_1_0_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_0_1_0_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_DASH);
    if (!result) result = consumeToken(builder, MY_PLUS);
    if (!result) result = consumeToken(builder, MY_MUL);
    if (!result) result = consumeToken(builder, MY_PERCENT);
    if (!result) result = consumeToken(builder, MY_FSLASH);
    if (!result) result = consumeToken(builder, MY_BAR);
    if (!result) result = consumeToken(builder, MY_ANGLE_LEFT);
    if (!result) result = parseTokens(builder, 0, MY_ANGLE_LEFT, MY_EQ);
    if (!result) result = consumeToken(builder, MY_ANGLE_RIGHT);
    if (!result) result = parseTokens(builder, 0, MY_ANGLE_RIGHT, MY_EQ);
    if (!result) result = parseTokens(builder, 0, MY_EQ, MY_EQ);
    if (!result) result = parseTokens(builder, 0, MY_AMP, MY_AMP);
    if (!result) result = parseTokens(builder, 0, MY_AMP, MY_TILDE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // refExpress|value
  private static boolean relationExpress_0_1_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_0_1_0_1")) return false;
    boolean result;
    result = refExpress(builder, level + 1);
    if (!result) result = value(builder, level + 1);
    return result;
  }

  // (refExpress|value)  PAREN_LEFT express PAREN_RIGHT
  private static boolean relationExpress_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = relationExpress_1_0(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_LEFT);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // refExpress|value
  private static boolean relationExpress_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "relationExpress_1_0")) return false;
    boolean result;
    result = refExpress(builder, level + 1);
    if (!result) result = value(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // return express [SEMICOLON]
  public static boolean returnStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "returnStatement")) return false;
    if (!nextTokenIs(builder, MY_RETURN)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_RETURN);
    result = result && express(builder, level + 1);
    result = result && returnStatement_2(builder, level + 1);
    exit_section_(builder, marker, MY_RETURN_STATEMENT, result);
    return result;
  }

  // [SEMICOLON]
  private static boolean returnStatement_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "returnStatement_2")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // line_comment | letStatement | forStatement |whileStatement |breakStatement|continueStatement | ifStatement|threeStatement | fnDefineStatement | fnInvokeStatement | newStatement |tryStatement|throwStatement |returnStatement
  public static boolean statement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "statement")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_STATEMENT, "<statement>");
    result = consumeToken(builder, MY_LINE_COMMENT);
    if (!result) result = letStatement(builder, level + 1);
    if (!result) result = forStatement(builder, level + 1);
    if (!result) result = whileStatement(builder, level + 1);
    if (!result) result = breakStatement(builder, level + 1);
    if (!result) result = continueStatement(builder, level + 1);
    if (!result) result = ifStatement(builder, level + 1);
    if (!result) result = threeStatement(builder, level + 1);
    if (!result) result = fnDefineStatement(builder, level + 1);
    if (!result) result = fnInvokeStatement(builder, level + 1);
    if (!result) result = newStatement(builder, level + 1);
    if (!result) result = tryStatement(builder, level + 1);
    if (!result) result = throwStatement(builder, level + 1);
    if (!result) result = returnStatement(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // express QUESTION express COLON express
  public static boolean threeExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "threeExpress")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_THREE_EXPRESS, "<three express>");
    result = express(builder, level + 1);
    result = result && consumeToken(builder, MY_QUESTION);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_COLON);
    result = result && express(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // threeExpress [SEMICOLON]
  public static boolean threeStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "threeStatement")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_THREE_STATEMENT, "<three statement>");
    result = threeExpress(builder, level + 1);
    result = result && threeStatement_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // [SEMICOLON]
  private static boolean threeStatement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "threeStatement_1")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // throw new express [SEMICOLON]
  public static boolean throwStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "throwStatement")) return false;
    if (!nextTokenIs(builder, MY_THROW)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_THROW, MY_NEW);
    result = result && express(builder, level + 1);
    result = result && throwStatement_3(builder, level + 1);
    exit_section_(builder, marker, MY_THROW_STATEMENT, result);
    return result;
  }

  // [SEMICOLON]
  private static boolean throwStatement_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "throwStatement_3")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // try BRACE_LEFT codes BRACE_RIGHT catch express BRACE_LEFT codes BRACE_RIGHT
  public static boolean tryStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "tryStatement")) return false;
    if (!nextTokenIs(builder, MY_TRY)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_TRY, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeTokens(builder, 0, MY_BRACE_RIGHT, MY_CATCH);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_TRY_STATEMENT, result);
    return result;
  }

  /* ********************************************************** */
  // string|number|boolean|null
  public static boolean value(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_VALUE, "<value>");
    result = consumeToken(builder, MY_STRING);
    if (!result) result = consumeToken(builder, MY_NUMBER);
    if (!result) result = boolean_$(builder, level + 1);
    if (!result) result = consumeToken(builder, MY_NULL);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // while express  BRACE_LEFT codes BRACE_RIGHT
  public static boolean whileStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "whileStatement")) return false;
    if (!nextTokenIs(builder, MY_WHILE)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_WHILE);
    result = result && express(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_WHILE_STATEMENT, result);
    return result;
  }

}
