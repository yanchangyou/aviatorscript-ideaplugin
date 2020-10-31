/*
 * Copyright 2020-2020 yanchangyou
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.

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
  // fnInvokeExpress {op allExpress}* | express | threeExpress | lambdaExpress
  public static boolean allExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "allExpress")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_ALL_EXPRESS, "<all express>");
    result = allExpress_0(builder, level + 1);
    if (!result) result = express(builder, level + 1);
    if (!result) result = threeExpress(builder, level + 1);
    if (!result) result = lambdaExpress(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // fnInvokeExpress {op allExpress}*
  private static boolean allExpress_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "allExpress_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = fnInvokeExpress(builder, level + 1);
    result = result && allExpress_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {op allExpress}*
  private static boolean allExpress_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "allExpress_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!allExpress_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "allExpress_0_1", pos)) break;
    }
    return true;
  }

  // op allExpress
  private static boolean allExpress_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "allExpress_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = op(builder, level + 1);
    result = result && allExpress(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
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
  // opExpress | PAREN_LEFT opExpress PAREN_RIGHT
  public static boolean express(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "express")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_EXPRESS, "<express>");
    result = opExpress(builder, level + 1);
    if (!result) result = express_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // PAREN_LEFT opExpress PAREN_RIGHT
  private static boolean express_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "express_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_PAREN_LEFT);
    result = result && opExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // fn identifier PAREN_LEFT identifier {COMMA identifier}* PAREN_RIGHT BRACE_LEFT codes BRACE_RIGHT
  public static boolean fnDefineStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnDefineStatement")) return false;
    if (!nextTokenIs(builder, MY_FN)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_FN, MY_IDENTIFIER, MY_PAREN_LEFT, MY_IDENTIFIER);
    result = result && fnDefineStatement_4(builder, level + 1);
    result = result && consumeTokens(builder, 0, MY_PAREN_RIGHT, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_FN_DEFINE_STATEMENT, result);
    return result;
  }

  // {COMMA identifier}*
  private static boolean fnDefineStatement_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnDefineStatement_4")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!fnDefineStatement_4_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "fnDefineStatement_4", pos)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean fnDefineStatement_4_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnDefineStatement_4_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_COMMA, MY_IDENTIFIER);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // refExpress {PAREN_LEFT [int COMMA] [allExpress {COMMA allExpress}*] PAREN_RIGHT}+
  public static boolean fnInvokeExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress")) return false;
    if (!nextTokenIs(builder, "<fn invoke express>", MY_DOLLAR, MY_IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_FN_INVOKE_EXPRESS, "<fn invoke express>");
    result = refExpress(builder, level + 1);
    result = result && fnInvokeExpress_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // {PAREN_LEFT [int COMMA] [allExpress {COMMA allExpress}*] PAREN_RIGHT}+
  private static boolean fnInvokeExpress_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = fnInvokeExpress_1_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!fnInvokeExpress_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "fnInvokeExpress_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  // PAREN_LEFT [int COMMA] [allExpress {COMMA allExpress}*] PAREN_RIGHT
  private static boolean fnInvokeExpress_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_PAREN_LEFT);
    result = result && fnInvokeExpress_1_0_1(builder, level + 1);
    result = result && fnInvokeExpress_1_0_2(builder, level + 1);
    result = result && consumeToken(builder, MY_PAREN_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // [int COMMA]
  private static boolean fnInvokeExpress_1_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1_0_1")) return false;
    parseTokens(builder, 0, MY_INT, MY_COMMA);
    return true;
  }

  // [allExpress {COMMA allExpress}*]
  private static boolean fnInvokeExpress_1_0_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1_0_2")) return false;
    fnInvokeExpress_1_0_2_0(builder, level + 1);
    return true;
  }

  // allExpress {COMMA allExpress}*
  private static boolean fnInvokeExpress_1_0_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1_0_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = allExpress(builder, level + 1);
    result = result && fnInvokeExpress_1_0_2_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {COMMA allExpress}*
  private static boolean fnInvokeExpress_1_0_2_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1_0_2_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!fnInvokeExpress_1_0_2_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "fnInvokeExpress_1_0_2_0_1", pos)) break;
    }
    return true;
  }

  // COMMA allExpress
  private static boolean fnInvokeExpress_1_0_2_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeExpress_1_0_2_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_COMMA);
    result = result && allExpress(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // fnInvokeExpress [SEMICOLON]
  public static boolean fnInvokeStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fnInvokeStatement")) return false;
    if (!nextTokenIs(builder, "<fn invoke statement>", MY_DOLLAR, MY_IDENTIFIER)) return false;
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
  // for identifier in allExpress [PAREN_LEFT allExpress {COMMA allExpress}*] BRACE_LEFT codes BRACE_RIGHT
  public static boolean forStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement")) return false;
    if (!nextTokenIs(builder, MY_FOR)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_FOR, MY_IDENTIFIER, MY_IN);
    result = result && allExpress(builder, level + 1);
    result = result && forStatement_4(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_FOR_STATEMENT, result);
    return result;
  }

  // [PAREN_LEFT allExpress {COMMA allExpress}*]
  private static boolean forStatement_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4")) return false;
    forStatement_4_0(builder, level + 1);
    return true;
  }

  // PAREN_LEFT allExpress {COMMA allExpress}*
  private static boolean forStatement_4_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_PAREN_LEFT);
    result = result && allExpress(builder, level + 1);
    result = result && forStatement_4_0_2(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {COMMA allExpress}*
  private static boolean forStatement_4_0_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4_0_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!forStatement_4_0_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "forStatement_4_0_2", pos)) break;
    }
    return true;
  }

  // COMMA allExpress
  private static boolean forStatement_4_0_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "forStatement_4_0_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_COMMA);
    result = result && allExpress(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // if allExpress BRACE_LEFT codes BRACE_RIGHT {elseif allExpress BRACE_LEFT codes BRACE_RIGHT }* {else allExpress BRACE_LEFT codes BRACE_RIGHT}*
  public static boolean ifStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement")) return false;
    if (!nextTokenIs(builder, MY_IF)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_IF);
    result = result && allExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    result = result && ifStatement_5(builder, level + 1);
    result = result && ifStatement_6(builder, level + 1);
    exit_section_(builder, marker, MY_IF_STATEMENT, result);
    return result;
  }

  // {elseif allExpress BRACE_LEFT codes BRACE_RIGHT }*
  private static boolean ifStatement_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_5")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!ifStatement_5_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "ifStatement_5", pos)) break;
    }
    return true;
  }

  // elseif allExpress BRACE_LEFT codes BRACE_RIGHT
  private static boolean ifStatement_5_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_5_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_ELSEIF);
    result = result && allExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {else allExpress BRACE_LEFT codes BRACE_RIGHT}*
  private static boolean ifStatement_6(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_6")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!ifStatement_6_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "ifStatement_6", pos)) break;
    }
    return true;
  }

  // else allExpress BRACE_LEFT codes BRACE_RIGHT
  private static boolean ifStatement_6_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ifStatement_6_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_ELSE);
    result = result && allExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // lambda PAREN_LEFT {identifier {COMMA identifier}*}* PAREN_RIGHT LAMBDA_TARGET codes end
  public static boolean lambdaExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "lambdaExpress")) return false;
    if (!nextTokenIs(builder, MY_LAMBDA)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_LAMBDA, MY_PAREN_LEFT);
    result = result && lambdaExpress_2(builder, level + 1);
    result = result && consumeTokens(builder, 0, MY_PAREN_RIGHT, MY_LAMBDA_TARGET);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_END);
    exit_section_(builder, marker, MY_LAMBDA_EXPRESS, result);
    return result;
  }

  // {identifier {COMMA identifier}*}*
  private static boolean lambdaExpress_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "lambdaExpress_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!lambdaExpress_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "lambdaExpress_2", pos)) break;
    }
    return true;
  }

  // identifier {COMMA identifier}*
  private static boolean lambdaExpress_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "lambdaExpress_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_IDENTIFIER);
    result = result && lambdaExpress_2_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {COMMA identifier}*
  private static boolean lambdaExpress_2_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "lambdaExpress_2_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!lambdaExpress_2_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "lambdaExpress_2_0_1", pos)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean lambdaExpress_2_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "lambdaExpress_2_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_COMMA, MY_IDENTIFIER);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // [let] refExpress [BRACK_LEFT number BRACK_RIGHT] ASSIGN allExpress [SEMICOLON]
  public static boolean letStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "letStatement")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_LET_STATEMENT, "<let statement>");
    result = letStatement_0(builder, level + 1);
    result = result && refExpress(builder, level + 1);
    result = result && letStatement_2(builder, level + 1);
    result = result && consumeToken(builder, MY_ASSIGN);
    result = result && allExpress(builder, level + 1);
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
  // new fnInvokeExpress [SEMICOLON]
  public static boolean newStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "newStatement")) return false;
    if (!nextTokenIs(builder, MY_NEW)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_NEW);
    result = result && fnInvokeExpress(builder, level + 1);
    result = result && newStatement_2(builder, level + 1);
    exit_section_(builder, marker, MY_NEW_STATEMENT, result);
    return result;
  }

  // [SEMICOLON]
  private static boolean newStatement_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "newStatement_2")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // PLUS                 // +
  //     | MINUS                // -
  //     | MUL                  // *
  //     | QUOTIENT             // /
  //     | REMAINDER            // %
  //     | LESS                 // <
  //     | LESS_OR_EQUAL        // <=
  //     | GREATER              // >
  //     | GREATER_OR_EQUAL     // >=
  //     | EQ                   // ==
  //     | NOT_EQ               // !=
  //     | BIT_AND              // &
  //     | BIT_OR               // |
  //     | BIT_XOR              // ^
  //     | NOT                  // !
  //     | COND_OR              // ||
  //     | COND_AND             // &&
  //     | BIT_TILDE
  public static boolean op(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "op")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_OP, "<op>");
    result = consumeToken(builder, MY_PLUS);
    if (!result) result = consumeToken(builder, MY_MINUS);
    if (!result) result = consumeToken(builder, MY_MUL);
    if (!result) result = consumeToken(builder, MY_QUOTIENT);
    if (!result) result = consumeToken(builder, MY_REMAINDER);
    if (!result) result = consumeToken(builder, MY_LESS);
    if (!result) result = consumeToken(builder, MY_LESS_OR_EQUAL);
    if (!result) result = consumeToken(builder, MY_GREATER);
    if (!result) result = consumeToken(builder, MY_GREATER_OR_EQUAL);
    if (!result) result = consumeToken(builder, MY_EQ);
    if (!result) result = consumeToken(builder, MY_NOT_EQ);
    if (!result) result = consumeToken(builder, MY_BIT_AND);
    if (!result) result = consumeToken(builder, MY_BIT_OR);
    if (!result) result = consumeToken(builder, MY_BIT_XOR);
    if (!result) result = consumeToken(builder, MY_NOT);
    if (!result) result = consumeToken(builder, MY_COND_OR);
    if (!result) result = consumeToken(builder, MY_COND_AND);
    if (!result) result = consumeToken(builder, MY_BIT_TILDE);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // not? (fnInvokeExpress|refExpress|value) {op allExpress}*
  public static boolean opExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "opExpress")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_OP_EXPRESS, "<op express>");
    result = opExpress_0(builder, level + 1);
    result = result && opExpress_1(builder, level + 1);
    result = result && opExpress_2(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // not?
  private static boolean opExpress_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "opExpress_0")) return false;
    consumeToken(builder, MY_NOT);
    return true;
  }

  // fnInvokeExpress|refExpress|value
  private static boolean opExpress_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "opExpress_1")) return false;
    boolean result;
    result = fnInvokeExpress(builder, level + 1);
    if (!result) result = refExpress(builder, level + 1);
    if (!result) result = value(builder, level + 1);
    return result;
  }

  // {op allExpress}*
  private static boolean opExpress_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "opExpress_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!opExpress_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "opExpress_2", pos)) break;
    }
    return true;
  }

  // op allExpress
  private static boolean opExpress_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "opExpress_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = op(builder, level + 1);
    result = result && allExpress(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // identifier {DOT identifier}* | DOLLAR number
  public static boolean refExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress")) return false;
    if (!nextTokenIs(builder, "<ref express>", MY_DOLLAR, MY_IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_REF_EXPRESS, "<ref express>");
    result = refExpress_0(builder, level + 1);
    if (!result) result = parseTokens(builder, 0, MY_DOLLAR, MY_NUMBER);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // identifier {DOT identifier}*
  private static boolean refExpress_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_IDENTIFIER);
    result = result && refExpress_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // {DOT identifier}*
  private static boolean refExpress_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!refExpress_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "refExpress_0_1", pos)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean refExpress_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refExpress_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_DOT, MY_IDENTIFIER);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // return allExpress* [SEMICOLON]
  public static boolean returnStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "returnStatement")) return false;
    if (!nextTokenIs(builder, MY_RETURN)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_RETURN);
    result = result && returnStatement_1(builder, level + 1);
    result = result && returnStatement_2(builder, level + 1);
    exit_section_(builder, marker, MY_RETURN_STATEMENT, result);
    return result;
  }

  // allExpress*
  private static boolean returnStatement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "returnStatement_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!allExpress(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "returnStatement_1", pos)) break;
    }
    return true;
  }

  // [SEMICOLON]
  private static boolean returnStatement_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "returnStatement_2")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // line_comment
  //     | letStatement
  //     | forStatement
  //     | whileStatement
  //     | breakStatement
  //     | continueStatement
  //     | ifStatement
  //     | threeStatement
  //     | fnDefineStatement
  //     | fnInvokeStatement
  //     | newStatement
  //     | tryStatement
  //     | throwStatement
  //     | returnStatement
  //     | BRACE_LEFT statement* BRACE_RIGHT
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
    if (!result) result = statement_14(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // BRACE_LEFT statement* BRACE_RIGHT
  private static boolean statement_14(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "statement_14")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_BRACE_LEFT);
    result = result && statement_14_1(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // statement*
  private static boolean statement_14_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "statement_14_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!statement(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "statement_14_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (fnInvokeExpress | express) QUESTION allExpress COLON allExpress
  public static boolean threeExpress(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "threeExpress")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MY_THREE_EXPRESS, "<three express>");
    result = threeExpress_0(builder, level + 1);
    result = result && consumeToken(builder, MY_QUESTION);
    result = result && allExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_COLON);
    result = result && allExpress(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // fnInvokeExpress | express
  private static boolean threeExpress_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "threeExpress_0")) return false;
    boolean result;
    result = fnInvokeExpress(builder, level + 1);
    if (!result) result = express(builder, level + 1);
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
  // throw (new fnInvokeExpress|allExpress) [SEMICOLON]
  public static boolean throwStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "throwStatement")) return false;
    if (!nextTokenIs(builder, MY_THROW)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_THROW);
    result = result && throwStatement_1(builder, level + 1);
    result = result && throwStatement_2(builder, level + 1);
    exit_section_(builder, marker, MY_THROW_STATEMENT, result);
    return result;
  }

  // new fnInvokeExpress|allExpress
  private static boolean throwStatement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "throwStatement_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = throwStatement_1_0(builder, level + 1);
    if (!result) result = allExpress(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // new fnInvokeExpress
  private static boolean throwStatement_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "throwStatement_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_NEW);
    result = result && fnInvokeExpress(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // [SEMICOLON]
  private static boolean throwStatement_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "throwStatement_2")) return false;
    consumeToken(builder, MY_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // try BRACE_LEFT codes BRACE_RIGHT catch PAREN_LEFT identifier identifier? PAREN_RIGHT BRACE_LEFT codes BRACE_RIGHT finally BRACE_LEFT codes BRACE_RIGHT
  public static boolean tryStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "tryStatement")) return false;
    if (!nextTokenIs(builder, MY_TRY)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, MY_TRY, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeTokens(builder, 0, MY_BRACE_RIGHT, MY_CATCH, MY_PAREN_LEFT, MY_IDENTIFIER);
    result = result && tryStatement_7(builder, level + 1);
    result = result && consumeTokens(builder, 0, MY_PAREN_RIGHT, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeTokens(builder, 0, MY_BRACE_RIGHT, MY_FINALLY, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_TRY_STATEMENT, result);
    return result;
  }

  // identifier?
  private static boolean tryStatement_7(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "tryStatement_7")) return false;
    consumeToken(builder, MY_IDENTIFIER);
    return true;
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
  // while allExpress BRACE_LEFT codes BRACE_RIGHT
  public static boolean whileStatement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "whileStatement")) return false;
    if (!nextTokenIs(builder, MY_WHILE)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, MY_WHILE);
    result = result && allExpress(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_LEFT);
    result = result && codes(builder, level + 1);
    result = result && consumeToken(builder, MY_BRACE_RIGHT);
    exit_section_(builder, marker, MY_WHILE_STATEMENT, result);
    return result;
  }

}
