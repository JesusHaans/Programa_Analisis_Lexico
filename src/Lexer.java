package src;
import java.io.File;





/**
 * Lexer
 */
public class Lexer {

    File In;
    File Out;
    String _yytext;
    boolean acc[] = {};
    char c;
    int table[][];

    char getChar() {
        return 'a';
    }

    void openFile(String filename) {    
        System.out.println("opening the file named: " + filename);
    }

    int getToken(int q) {
        return 0;
    }

    int yylex() throws ErrorLexer {
        int q = 0;
        _yytext = "";
        while (true) {
            if (table[q][c] != -1) {
                q = table[q][c];
                _yytext += c;
                c = getChar();
            }else{
                if(acc[q]){
                    return getToken(q);
                }else{
                    throw new ErrorLexer("Error");
                }
            }
        }
    }



}