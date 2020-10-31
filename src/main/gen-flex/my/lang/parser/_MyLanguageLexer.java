/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package my.lang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static lang.psi.MyLanguageTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_MyLanguageLexer.flex</tt>
 */
public class _MyLanguageLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 14208 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\2\11\1\14\1\36\3\11\1\37\10\11\1\40\1\41\5\14\1\42\1\43"+
    "\11\11\1\44\2\11\1\45\5\11\1\46\4\11\1\47\1\50\4\11\51\14\1\51\3\14\1\52\1"+
    "\53\4\14\1\54\12\11\1\55\u0381\11");

  /* The ZZ_CMAP_Y table has 2944 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\10\1\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\24\12\13\1\25"+
    "\1\13\1\26\1\25\1\13\1\27\4\1\1\13\1\30\1\31\2\1\2\13\1\30\1\1\1\32\1\25\5"+
    "\13\1\33\1\34\1\35\1\1\1\36\1\13\1\1\1\37\5\13\1\40\1\41\1\42\1\13\1\30\1"+
    "\43\1\13\1\44\1\45\1\1\1\13\1\46\4\1\1\13\1\47\4\1\1\50\2\13\1\51\1\1\1\52"+
    "\1\16\1\25\1\53\1\54\1\55\1\56\1\57\1\60\2\16\1\61\1\54\1\55\1\62\1\1\1\63"+
    "\1\1\1\64\1\65\1\22\1\55\1\66\1\1\1\67\1\16\1\70\1\71\1\54\1\55\1\66\1\1\1"+
    "\60\1\16\1\41\1\72\1\73\1\74\1\75\1\1\1\67\2\1\1\76\1\36\1\55\1\51\1\1\1\77"+
    "\1\16\1\1\1\100\1\36\1\55\1\101\1\1\1\57\1\16\1\102\1\76\1\36\1\13\1\103\1"+
    "\57\1\104\1\16\1\42\1\105\1\106\1\13\1\107\1\110\3\1\1\25\2\13\1\111\1\110"+
    "\3\1\1\112\1\113\1\114\1\115\1\116\1\117\2\1\1\67\3\1\1\120\1\13\1\121\1\1"+
    "\1\122\7\1\2\13\1\30\1\123\1\1\1\124\1\125\1\126\1\127\1\1\2\13\1\130\2\13"+
    "\1\131\24\13\1\132\1\133\2\13\1\132\2\13\1\134\1\135\1\14\3\13\1\135\3\13"+
    "\1\30\2\1\1\13\1\1\5\13\1\136\1\25\45\13\1\137\1\13\1\140\1\30\4\13\1\30\1"+
    "\141\1\142\1\16\1\13\1\16\1\13\1\16\1\142\1\67\3\13\1\143\1\1\1\144\4\1\5"+
    "\13\1\27\1\145\1\13\1\146\4\13\1\40\1\13\1\147\3\1\1\13\1\150\1\151\2\13\1"+
    "\152\1\13\1\75\3\1\1\13\1\110\3\13\1\151\4\1\1\153\5\1\1\105\2\13\1\143\1"+
    "\154\3\1\1\155\1\13\1\156\1\42\2\13\1\40\1\1\2\13\1\143\1\1\1\37\1\42\1\13"+
    "\1\150\1\46\5\1\1\157\1\160\14\13\4\1\21\13\1\136\2\13\1\136\1\161\1\13\1"+
    "\150\3\13\1\162\1\163\1\164\1\121\1\163\1\165\1\1\1\166\2\1\1\167\1\1\1\170"+
    "\1\1\1\121\6\1\1\171\1\172\1\173\1\174\1\175\3\1\1\176\147\1\2\13\1\147\2"+
    "\13\1\147\10\13\1\177\1\200\2\13\1\130\3\13\1\201\1\1\1\13\1\110\4\202\4\1"+
    "\1\123\35\1\1\203\2\1\1\204\1\25\4\13\1\205\1\25\4\13\1\131\1\105\1\13\1\150"+
    "\1\25\4\13\1\147\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\40\4\1\135\13\1\40\2"+
    "\1\10\13\1\121\4\1\2\13\1\150\20\13\1\121\1\13\1\206\1\1\2\13\1\147\1\123"+
    "\1\13\1\150\4\13\1\40\2\1\1\207\1\210\5\13\1\211\1\13\1\147\1\27\3\1\1\207"+
    "\1\212\1\13\1\31\1\1\3\13\1\143\1\210\2\13\1\143\3\1\1\213\1\42\1\13\1\40"+
    "\1\13\1\110\1\1\1\13\1\121\1\50\2\13\1\31\1\123\1\1\1\214\1\215\2\13\1\46"+
    "\1\1\1\216\1\1\1\13\1\217\3\13\1\220\1\221\1\222\1\30\1\64\1\223\1\224\1\202"+
    "\2\13\1\131\1\40\7\13\1\31\1\1\72\13\1\143\1\13\1\225\2\13\1\152\20\1\26\13"+
    "\1\150\6\13\1\75\2\1\1\110\1\226\1\55\1\227\1\230\6\13\1\16\1\1\1\155\25\13"+
    "\1\150\1\1\4\13\1\210\2\13\1\27\2\1\1\152\7\1\1\214\7\13\1\121\2\1\1\25\1"+
    "\30\1\25\1\30\1\231\4\13\1\147\1\232\1\233\2\1\1\234\1\13\1\14\1\235\2\150"+
    "\2\1\7\13\1\30\30\1\1\13\1\121\3\13\1\67\2\1\2\13\1\1\1\13\1\236\2\13\1\40"+
    "\1\13\1\150\2\13\1\237\3\1\11\13\1\150\1\1\2\13\1\237\1\13\1\152\2\13\1\27"+
    "\3\13\1\143\11\1\23\13\1\110\1\13\1\40\1\27\11\1\1\240\2\13\1\241\1\13\1\40"+
    "\1\13\1\110\1\13\1\147\4\1\1\13\1\242\1\13\1\40\1\13\1\75\4\1\3\13\1\243\4"+
    "\1\1\67\1\244\1\13\1\143\2\1\1\13\1\121\1\13\1\121\2\1\1\120\1\13\1\151\1"+
    "\1\3\13\1\40\1\13\1\40\1\13\1\31\1\13\1\16\6\1\4\13\1\46\3\1\3\13\1\31\3\13"+
    "\1\31\60\1\1\155\2\13\1\27\4\1\1\155\2\13\2\1\1\13\1\46\1\1\1\155\1\13\1\110"+
    "\2\1\2\13\1\245\1\155\2\13\1\31\1\246\1\247\2\1\1\13\1\22\1\152\5\1\1\250"+
    "\1\251\1\46\2\13\1\147\2\1\1\71\1\54\1\55\1\66\1\1\1\252\1\16\11\1\3\13\1"+
    "\151\1\253\3\1\3\13\1\1\1\254\13\1\2\13\1\147\2\1\1\255\2\1\3\13\1\1\1\256"+
    "\3\1\2\13\1\30\5\1\1\13\1\75\30\1\4\13\1\1\1\123\34\1\3\13\1\46\20\1\1\55"+
    "\1\13\1\147\1\1\1\67\2\1\1\210\1\13\67\1\71\13\1\75\16\1\14\13\1\143\53\1"+
    "\2\13\1\147\75\1\44\13\1\110\33\1\43\13\1\46\1\13\1\147\7\1\1\13\1\150\1\1"+
    "\3\13\1\1\1\143\1\1\1\155\1\257\1\13\67\1\4\13\1\151\1\67\3\1\1\155\4\1\1"+
    "\67\1\1\76\13\1\121\1\1\57\13\1\31\20\1\1\16\77\1\6\13\1\30\1\121\1\46\1\75"+
    "\66\1\5\13\1\214\3\13\1\142\1\260\1\261\1\262\3\13\1\263\1\264\1\13\1\265"+
    "\1\266\1\36\24\13\1\267\1\13\1\36\1\131\1\13\1\131\1\13\1\214\1\13\1\214\1"+
    "\147\1\13\1\147\1\13\1\55\1\13\1\55\1\13\1\216\3\1\14\13\1\151\3\1\4\13\1"+
    "\143\113\1\1\262\1\13\1\270\1\271\1\272\1\273\1\274\1\275\1\276\1\152\1\277"+
    "\1\152\24\1\55\13\1\110\2\1\103\13\1\151\15\13\1\150\150\13\1\16\25\1\41\13"+
    "\1\150\36\1");

  /* The ZZ_CMAP_A table has 3072 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\4\1\22\0\1\2\1\46\1\11\1\6\1\44\1\33\1\36\1\7\1\22\1\23\1\32\1\12"+
    "\1\41\1\31\1\20\1\34\1\13\11\5\1\47\1\35\1\42\1\45\1\43\1\30\1\0\1\60\3\15"+
    "\1\56\1\57\5\3\1\61\1\17\1\16\3\3\1\54\1\62\1\53\1\55\2\3\1\14\2\3\1\24\1"+
    "\10\1\25\1\0\1\3\1\0\1\74\1\73\1\77\1\15\1\21\1\72\1\3\1\64\1\51\1\3\1\75"+
    "\1\52\1\3\1\50\1\70\2\3\1\66\1\76\1\65\1\71\1\3\1\63\1\14\1\67\1\3\1\26\1"+
    "\37\1\27\1\40\6\0\1\1\12\0\1\2\11\0\1\4\12\0\1\4\4\0\1\4\5\0\27\4\1\0\12\4"+
    "\4\0\14\4\16\0\5\4\7\0\1\4\1\0\1\4\1\0\5\4\1\0\2\4\2\0\4\4\1\0\1\4\6\0\1\4"+
    "\1\0\3\4\1\0\1\4\1\0\4\4\1\0\23\4\1\0\13\4\10\0\6\4\1\0\26\4\2\0\1\4\6\0\10"+
    "\4\10\0\13\4\5\0\3\4\33\0\6\4\1\0\1\4\17\0\2\4\7\0\2\4\12\0\3\4\2\0\2\4\1"+
    "\0\16\4\15\0\11\4\13\0\1\4\30\0\6\4\4\0\2\4\4\0\1\4\5\0\6\4\4\0\1\4\11\0\1"+
    "\4\3\0\1\4\7\0\11\4\7\0\5\4\1\0\10\4\6\0\26\4\3\0\1\4\2\0\1\4\7\0\11\4\4\0"+
    "\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0\1\4\3\0\4\4\3\0\1\4\20\0\1\4\15\0\2\4\1"+
    "\0\1\4\5\0\6\4\4\0\2\4\1\0\2\4\1\0\2\4\1\0\2\4\17\0\4\4\1\0\1\4\3\0\3\4\20"+
    "\0\11\4\1\0\2\4\1\0\2\4\1\0\5\4\3\0\1\4\2\0\1\4\30\0\1\4\13\0\10\4\2\0\1\4"+
    "\3\0\1\4\1\0\6\4\3\0\3\4\1\0\4\4\3\0\2\4\1\0\1\4\1\0\2\4\3\0\2\4\3\0\3\4\3"+
    "\0\14\4\13\0\10\4\1\0\2\4\10\0\3\4\5\0\1\4\4\0\10\4\1\0\6\4\1\0\5\4\3\0\1"+
    "\4\3\0\2\4\15\0\13\4\2\0\1\4\6\0\3\4\10\0\1\4\5\0\22\4\3\0\10\4\1\0\11\4\1"+
    "\0\1\4\2\0\7\4\11\0\1\4\1\0\2\4\15\0\2\4\1\0\1\4\2\0\2\4\1\0\1\4\2\0\1\4\6"+
    "\0\4\4\1\0\7\4\1\0\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0\4\4\1\0\2\4\11\0\1\4\2"+
    "\0\5\4\1\0\1\4\25\0\14\4\1\0\24\4\13\0\5\4\22\0\7\4\4\0\4\4\3\0\1\4\3\0\2"+
    "\4\7\0\3\4\4\0\15\4\14\0\1\4\1\0\6\4\1\0\1\4\5\0\1\4\2\0\13\4\1\0\15\4\1\0"+
    "\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\1\4\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\16"+
    "\4\2\0\6\4\2\0\15\4\2\0\1\4\1\2\17\4\1\0\10\4\7\0\15\4\1\0\6\4\23\0\1\4\4"+
    "\0\1\4\3\0\5\4\2\0\22\4\1\0\1\4\5\0\17\4\1\0\16\4\2\0\5\4\13\0\14\4\13\0\1"+
    "\4\15\0\7\4\7\0\16\4\15\0\2\4\11\0\4\4\1\0\4\4\3\0\2\4\11\0\10\4\1\0\1\4\1"+
    "\0\1\4\1\0\1\4\1\0\6\4\1\0\7\4\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0\6\4\4\0"+
    "\13\2\15\0\2\1\5\0\1\2\17\0\1\2\1\0\1\4\15\0\1\4\2\0\1\4\4\0\1\4\2\0\12\4"+
    "\1\0\1\4\3\0\5\4\6\0\1\4\1\0\1\4\1\0\1\4\1\0\4\4\1\0\13\4\2\0\4\4\5\0\5\4"+
    "\4\0\1\4\4\0\2\4\13\0\5\4\6\0\4\4\3\0\2\4\14\0\10\4\7\0\10\4\1\0\7\4\1\0\1"+
    "\2\4\0\2\4\12\0\5\4\5\0\2\4\3\0\7\4\6\0\3\4\12\0\2\4\13\0\11\4\2\0\27\4\2"+
    "\0\7\4\1\0\3\4\1\0\4\4\1\0\4\4\2\0\6\4\3\0\1\4\1\0\1\4\2\0\5\4\1\0\12\4\12"+
    "\0\5\4\1\0\3\4\1\0\10\4\4\0\7\4\3\0\1\4\3\0\2\4\1\0\1\4\3\0\2\4\2\0\5\4\2"+
    "\0\1\4\1\0\1\4\30\0\3\4\3\0\6\4\2\0\6\4\2\0\6\4\11\0\7\4\4\0\5\4\3\0\5\4\5"+
    "\0\1\4\1\0\10\4\1\0\5\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0\12\4\6\0\12\4\2\0\6\4"+
    "\2\0\6\4\2\0\6\4\2\0\3\4\3\0\14\4\1\0\16\4\1\0\2\4\1\0\2\4\1\0\10\4\6\0\4"+
    "\4\4\0\16\4\2\0\1\4\1\0\14\4\1\0\2\4\3\0\1\4\2\0\4\4\1\0\2\4\12\0\10\4\6\0"+
    "\6\4\1\0\3\4\1\0\12\4\3\0\1\4\12\0\4\4\25\0\1\4\1\0\1\4\3\0\7\4\1\0\1\4\1"+
    "\0\4\4\1\0\17\4\1\0\2\4\14\0\3\4\7\0\4\4\11\0\2\4\1\0\1\4\20\0\4\4\10\0\1"+
    "\4\13\0\10\4\5\0\3\4\2\0\1\4\2\0\2\4\2\0\4\4\1\0\14\4\1\0\1\4\1\0\7\4\1\0"+
    "\21\4\1\0\4\4\2\0\10\4\1\0\7\4\1\0\14\4\1\0\4\4\1\0\5\4\1\0\1\4\3\0\14\4\2"+
    "\0\10\4\1\0\2\4\1\0\1\4\2\0\1\4\1\0\12\4\1\0\4\4\1\0\1\4\1\0\1\4\6\0\1\4\4"+
    "\0\1\4\1\0\1\4\1\0\1\4\1\0\3\4\1\0\2\4\1\0\1\4\2\0\1\4\1\0\1\4\1\0\1\4\1\0"+
    "\1\4\1\0\1\4\1\0\2\4\1\0\1\4\2\0\4\4\1\0\7\4\1\0\4\4\1\0\4\4\1\0\1\4\1\0\12"+
    "\4\1\0\5\4\1\0\3\4\1\0\5\4\1\0\5\4");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\3\1\1\5\1\4"+
    "\1\6\1\3\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\13\3\2\4\2\0\1\35\1\0\1\36\3\0\1\4"+
    "\1\0\1\3\1\37\2\3\1\40\1\41\7\3\1\42"+
    "\3\3\2\4\1\0\1\36\1\4\1\3\1\43\1\44"+
    "\1\45\1\46\4\3\1\47\1\3\1\50\2\3\1\51"+
    "\1\52\7\3\1\53\1\54\1\55\1\3\1\56\1\57"+
    "\1\60\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\100\0\200\0\300\0\u0100\0\u0140\0\u0180\0\u01c0"+
    "\0\u0200\0\u0240\0\100\0\u0280\0\100\0\100\0\100\0\100"+
    "\0\100\0\100\0\100\0\u0200\0\100\0\100\0\100\0\100"+
    "\0\100\0\u02c0\0\100\0\100\0\100\0\100\0\100\0\100"+
    "\0\100\0\100\0\u0300\0\u0340\0\u0380\0\u03c0\0\u0400\0\u0440"+
    "\0\u0480\0\u04c0\0\u0500\0\u0540\0\u0580\0\u05c0\0\100\0\u0600"+
    "\0\u0640\0\u0680\0\u0180\0\100\0\u06c0\0\u01c0\0\u0700\0\u0740"+
    "\0\u0780\0\u07c0\0\100\0\u0800\0\u0840\0\u0880\0\300\0\u08c0"+
    "\0\u0900\0\u0940\0\u0980\0\u09c0\0\u0a00\0\u0a40\0\300\0\u0a80"+
    "\0\u0ac0\0\u0b00\0\u0b40\0\u0b80\0\u0bc0\0\u01c0\0\u0780\0\u0c00"+
    "\0\300\0\300\0\300\0\300\0\u0c40\0\u0c80\0\u0cc0\0\u0d00"+
    "\0\300\0\u0d40\0\300\0\u0d80\0\u0dc0\0\u0e00\0\300\0\u0e40"+
    "\0\u0e80\0\u0ec0\0\u0f00\0\u0f40\0\u0f80\0\u0fc0\0\300\0\300"+
    "\0\300\0\u1000\0\300\0\300\0\300\0\300";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\2\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\12\4\4\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\3\4"+
    "\1\47\3\4\1\50\1\4\1\51\1\52\3\4\1\53"+
    "\1\54\3\4\1\55\101\0\2\3\100\0\1\4\1\0"+
    "\1\4\5\0\5\4\1\0\1\4\26\0\30\4\5\0"+
    "\1\5\5\0\1\5\2\0\1\56\1\57\1\60\1\61"+
    "\34\0\1\61\27\0\1\62\71\0\7\63\1\64\1\65"+
    "\67\63\10\66\1\67\1\64\66\66\5\0\1\5\5\0"+
    "\1\12\71\0\1\70\5\0\1\70\1\71\2\0\1\57"+
    "\1\60\1\61\34\0\1\61\24\0\1\4\1\0\1\4"+
    "\5\0\5\4\1\0\1\4\26\0\2\4\1\72\25\4"+
    "\37\0\1\73\43\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\74\26\0\1\4\1\75\26\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\1\76"+
    "\21\4\1\77\5\4\3\0\1\4\1\0\1\4\5\0"+
    "\5\4\1\0\1\100\26\0\30\4\3\0\1\4\1\0"+
    "\1\4\5\0\5\4\1\0\1\4\26\0\4\4\1\101"+
    "\23\4\3\0\1\4\1\0\1\4\5\0\5\4\1\0"+
    "\1\4\26\0\10\4\1\102\17\4\3\0\1\4\1\0"+
    "\1\4\5\0\5\4\1\0\1\4\26\0\14\4\1\103"+
    "\13\4\3\0\1\4\1\0\1\4\5\0\5\4\1\0"+
    "\1\4\26\0\14\4\1\104\1\4\1\105\11\4\3\0"+
    "\1\4\1\0\1\4\5\0\5\4\1\0\1\106\26\0"+
    "\30\4\3\0\1\4\1\0\1\4\5\0\5\4\1\0"+
    "\1\4\26\0\1\107\17\4\1\110\7\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\16\4"+
    "\1\111\11\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\24\4\1\112\3\4\17\0\1\57"+
    "\65\0\1\113\5\0\1\113\71\0\1\114\4\0\1\115"+
    "\1\114\15\0\1\115\46\0\1\62\1\0\76\62\1\63"+
    "\1\0\76\63\10\66\1\67\1\116\66\66\5\0\1\70"+
    "\5\0\1\70\3\0\1\57\1\60\1\61\34\0\1\61"+
    "\26\0\1\117\5\0\1\117\1\0\1\117\3\0\1\117"+
    "\34\0\3\117\11\0\3\117\2\0\1\117\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\26\4"+
    "\1\120\1\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\13\4\1\121\14\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\2\4"+
    "\1\122\25\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\15\4\1\123\12\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\15\4"+
    "\1\124\12\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\5\4\1\125\22\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\11\4"+
    "\1\126\16\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\1\4\1\127\26\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\16\4"+
    "\1\130\11\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\17\4\1\131\10\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\15\4"+
    "\1\132\12\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\16\4\1\133\11\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\134\26\0\30\4"+
    "\3\0\1\4\1\0\1\4\5\0\5\4\1\0\1\4"+
    "\26\0\15\4\1\135\12\4\5\0\1\113\5\0\1\113"+
    "\3\0\1\57\1\0\1\61\34\0\1\61\26\0\1\114"+
    "\5\0\1\114\3\0\1\57\65\0\1\114\5\0\1\114"+
    "\67\0\1\4\1\0\1\4\5\0\5\4\1\0\1\136"+
    "\26\0\30\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\6\4\1\137\21\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\12\4"+
    "\1\140\15\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\2\4\1\141\25\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\20\4"+
    "\1\142\7\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\21\4\1\143\6\4\3\0\1\4"+
    "\1\0\1\4\5\0\5\4\1\0\1\4\26\0\24\4"+
    "\1\144\3\4\3\0\1\4\1\0\1\4\5\0\5\4"+
    "\1\0\1\4\26\0\27\4\1\145\3\0\1\4\1\0"+
    "\1\4\5\0\5\4\1\0\1\4\26\0\1\4\1\146"+
    "\26\4\3\0\1\4\1\0\1\4\5\0\5\4\1\0"+
    "\1\4\26\0\6\4\1\147\21\4\3\0\1\4\1\0"+
    "\1\4\5\0\5\4\1\0\1\150\26\0\30\4\3\0"+
    "\1\4\1\0\1\4\5\0\5\4\1\0\1\4\26\0"+
    "\13\4\1\151\14\4\3\0\1\4\1\0\1\4\5\0"+
    "\5\4\1\0\1\4\26\0\16\4\1\152\11\4\3\0"+
    "\1\4\1\0\1\4\5\0\5\4\1\0\1\4\26\0"+
    "\25\4\1\153\2\4\3\0\1\4\1\0\1\4\5\0"+
    "\5\4\1\0\1\4\26\0\14\4\1\154\13\4\3\0"+
    "\1\4\1\0\1\4\5\0\5\4\1\0\1\4\26\0"+
    "\22\4\1\155\5\4\3\0\1\4\1\0\1\4\5\0"+
    "\5\4\1\0\1\4\26\0\1\156\27\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4160];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\1\11\1\1\7\11\1\1\5\11"+
    "\1\1\10\11\14\1\1\11\2\0\1\1\1\0\1\11"+
    "\3\0\1\1\1\0\1\1\1\11\21\1\1\0\41\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MyLanguageLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MyLanguageLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 50: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 51: break;
          case 3: 
            { return MY_ID;
            } 
            // fall through
          case 52: break;
          case 4: 
            { return MY_NUMBER;
            } 
            // fall through
          case 53: break;
          case 5: 
            { return MY_PLUS;
            } 
            // fall through
          case 54: break;
          case 6: 
            { return MY_DOT;
            } 
            // fall through
          case 55: break;
          case 7: 
            { return MY_PAREN1;
            } 
            // fall through
          case 56: break;
          case 8: 
            { return MY_PAREN2;
            } 
            // fall through
          case 57: break;
          case 9: 
            { return MY_BRACK1;
            } 
            // fall through
          case 58: break;
          case 10: 
            { return MY_BRACK2;
            } 
            // fall through
          case 59: break;
          case 11: 
            { return MY_BRACE1;
            } 
            // fall through
          case 60: break;
          case 12: 
            { return MY_BRACE2;
            } 
            // fall through
          case 61: break;
          case 13: 
            { return MY_QUESTION;
            } 
            // fall through
          case 62: break;
          case 14: 
            { return MY_DASH;
            } 
            // fall through
          case 63: break;
          case 15: 
            { return MY_MUL;
            } 
            // fall through
          case 64: break;
          case 16: 
            { return MY_PERCENT;
            } 
            // fall through
          case 65: break;
          case 17: 
            { return MY_FSLASH;
            } 
            // fall through
          case 66: break;
          case 18: 
            { return MY_SEMICOLON;
            } 
            // fall through
          case 67: break;
          case 19: 
            { return MY_AMP;
            } 
            // fall through
          case 68: break;
          case 20: 
            { return MY_BAR;
            } 
            // fall through
          case 69: break;
          case 21: 
            { return MY_TILDE;
            } 
            // fall through
          case 70: break;
          case 22: 
            { return MY_COMMA;
            } 
            // fall through
          case 71: break;
          case 23: 
            { return MY_ANGLE1;
            } 
            // fall through
          case 72: break;
          case 24: 
            { return MY_ANGLE2;
            } 
            // fall through
          case 73: break;
          case 25: 
            { return MY_DOLLAR;
            } 
            // fall through
          case 74: break;
          case 26: 
            { return MY_EQ;
            } 
            // fall through
          case 75: break;
          case 27: 
            { return MY_BANG;
            } 
            // fall through
          case 76: break;
          case 28: 
            { return MY_COLON;
            } 
            // fall through
          case 77: break;
          case 29: 
            { return MY_LINE_COMMENT;
            } 
            // fall through
          case 78: break;
          case 30: 
            { return MY_STRING;
            } 
            // fall through
          case 79: break;
          case 31: 
            { return MY_BARBAR;
            } 
            // fall through
          case 80: break;
          case 32: 
            { return MY_IN;
            } 
            // fall through
          case 81: break;
          case 33: 
            { return MY_IF;
            } 
            // fall through
          case 82: break;
          case 34: 
            { return MY_FN;
            } 
            // fall through
          case 83: break;
          case 35: 
            { return MY_NEW;
            } 
            // fall through
          case 84: break;
          case 36: 
            { return MY_NULL;
            } 
            // fall through
          case 85: break;
          case 37: 
            { return MY_INT;
            } 
            // fall through
          case 86: break;
          case 38: 
            { return MY_LET;
            } 
            // fall through
          case 87: break;
          case 39: 
            { return MY_TRY;
            } 
            // fall through
          case 88: break;
          case 40: 
            { return MY_FOR;
            } 
            // fall through
          case 89: break;
          case 41: 
            { return MY_ELSE;
            } 
            // fall through
          case 90: break;
          case 42: 
            { return MY_TRUE;
            } 
            // fall through
          case 91: break;
          case 43: 
            { return MY_FALSE;
            } 
            // fall through
          case 92: break;
          case 44: 
            { return MY_WHILE;
            } 
            // fall through
          case 93: break;
          case 45: 
            { return MY_THROW;
            } 
            // fall through
          case 94: break;
          case 46: 
            { return MY_BREAK;
            } 
            // fall through
          case 95: break;
          case 47: 
            { return MY_CATCH;
            } 
            // fall through
          case 96: break;
          case 48: 
            { return MY_ELSEIF;
            } 
            // fall through
          case 97: break;
          case 49: 
            { return MY_RETURN;
            } 
            // fall through
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
