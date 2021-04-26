import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;

public class cal {
    public static void main (String[] args) throws Exception {
        String inputFile = null;

        if (args.length > 0) {
            inputFile = args [0];
        }

        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        calLexer lex = new calLexer (CharStreams.fromStream (is));
        CommonTokenStream tokes = new CommonTokenStream (lex);
        calParser parse = new calParser (tokes);
        
        parse.removeErrorListeners();
        lex.removeErrorListeners();
        CalErrors errors = new CalErrors();
        parse.addErrorListener(errors);
        lex.addErrorListener(errors);
        parse.prog();
        
        if (errors.getSyntaxErrors()) {
            System.out.println(inputFile + " file has not parsed succesfully");
        } else {
            System.out.println(inputFile + " file has parsed successfully");
        }
    }
}