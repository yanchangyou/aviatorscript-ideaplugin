package my.lang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static lang.psi.MyLanguageTypes.*;

%%

%{
  public _MyLanguageLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MyLanguageLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_0-9]+
LINE_COMMENT=##.*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER=-?(0[xX][0-9a-fA-F]+|[0-9]|[1-9][0-9]*N?M?|[0-9]+(\.[0-9]+)?([Ee][+-]?[0-9]+)?M?)
PARAMREF=\$[0-9]+
REGSTATEMENT=[ \t]*let[ \t]*[a-zA-Z_0-9]+[ \t]*=[ \t]*"/"[^/]+"/"[ \t]*;[ \t]*

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "{"                 { return MY_BRACE_LEFT; }
  "}"                 { return MY_BRACE_RIGHT; }
  "["                 { return MY_BRACK_LEFT; }
  "]"                 { return MY_BRACK_RIGHT; }
  "("                 { return MY_PAREN_LEFT; }
  ")"                 { return MY_PAREN_RIGHT; }
  ":"                 { return MY_COLON; }
  ";"                 { return MY_SEMICOLON; }
  ","                 { return MY_COMMA; }
  "=="                { return MY_EQ; }
  "="                 { return MY_ASSIGN; }
  "!="                { return MY_NOT_EQ; }
  "!"                 { return MY_NOT; }
  "++"                { return MY_PLUS_PLUS; }
  "+="                { return MY_PLUS_ASSIGN; }
  "+"                 { return MY_PLUS; }
  "--"                { return MY_MINUS_MINUS; }
  "-="                { return MY_MINUS_ASSIGN; }
  "-"                 { return MY_MINUS; }
  "||"                { return MY_COND_OR; }
  "|="                { return MY_BIT_OR_ASSIGN; }
  "&^="               { return MY_BIT_CLEAR_ASSIGN; }
  "&^"                { return MY_BIT_CLEAR; }
  "&~"                { return MY_BIT_TILDE; }
  "&&"                { return MY_COND_AND; }
  "&="                { return MY_BIT_AND_ASSIGN; }
  "&"                 { return MY_BIT_AND; }
  "=~"                { return MY_EQ_TILDE; }
  "|"                 { return MY_BIT_OR; }
  "<<="               { return MY_SHIFT_LEFT_ASSIGN; }
  "<<"                { return MY_SHIFT_LEFT; }
  "<-"                { return MY_SEND_CHANNEL; }
  "<="                { return MY_LESS_OR_EQUAL; }
  "<"                 { return MY_LESS; }
  "^="                { return MY_BIT_XOR_ASSIGN; }
  "^"                 { return MY_BIT_XOR; }
  "*="                { return MY_MUL_ASSIGN; }
  "*"                 { return MY_MUL; }
  "/="                { return MY_QUOTIENT_ASSIGN; }
  "/"                 { return MY_QUOTIENT; }
  "%="                { return MY_REMAINDER_ASSIGN; }
  "%"                 { return MY_REMAINDER; }
  ">>="               { return MY_SHIFT_RIGHT_ASSIGN; }
  ">>"                { return MY_SHIFT_RIGHT; }
  ">="                { return MY_GREATER_OR_EQUAL; }
  ">"                 { return MY_GREATER; }
  ":="                { return MY_VAR_ASSIGN; }
  "..."               { return MY_TRIPLE_DOT; }
  "."                 { return MY_DOT; }
  "?"                 { return MY_QUESTION; }
  "->"                { return MY_LAMBDA_TARGET; }
  "<NL>"              { return MY_SEMICOLON_SYNTHETIC; }
  "raw_string"        { return MY_RAW_STRING; }
  "nil"               { return MY_NULL; }
  "TRUE"              { return MY_TRUE; }
  "FALSE"             { return MY_FALSE; }
  "while"             { return MY_WHILE; }
  "try"               { return MY_TRY; }
  "throw"             { return MY_THROW; }
  "finally"           { return MY_FINALLY; }
  "return"            { return MY_RETURN; }
  "new"               { return MY_NEW; }
  "use"               { return MY_USE; }
  "let"               { return MY_LET; }
  "int"               { return MY_INT; }
  "in"                { return MY_IN; }
  "if"                { return MY_IF; }
  "for"               { return MY_FOR; }
  "fn"                { return MY_FN; }
  "break"             { return MY_BREAK; }
  "continue"          { return MY_CONTINUE; }
  "lambda"            { return MY_LAMBDA; }
  "end"               { return MY_END; }
  "elsif"             { return MY_ELSIF; }
  "else"              { return MY_ELSE; }
  "catch"             { return MY_CATCH; }

  {IDENTIFIER}        { return MY_IDENTIFIER; }
  {LINE_COMMENT}      { return MY_LINE_COMMENT; }
  {STRING}            { return MY_STRING; }
  {NUMBER}            { return MY_NUMBER; }
  {PARAMREF}          { return MY_PARAMREF; }
  {REGSTATEMENT}      { return MY_REGSTATEMENT; }

}

[^] { return BAD_CHARACTER; }
