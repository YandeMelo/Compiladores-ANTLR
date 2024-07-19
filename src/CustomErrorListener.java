import org.antlr.v4.runtime.*;

public class CustomErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        // Customiza a mensagem de erro
        String errorMessage = String.format("Linha %d:%d - %s", line, charPositionInLine, msg);
        throw new RuntimeException(errorMessage);
    }
}
