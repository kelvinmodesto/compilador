package portugol.main;

import java.io.PushbackReader;

import portugol.lexer.Lexer;
import portugol.lexer.LexerException;
import portugol.node.EOF;
import portugol.node.InvalidToken;
import portugol.node.TComentarioAninhado;
import portugol.node.TFComentarioAninhado;

public class Lexico extends Lexer {

	private TComentarioAninhado ultimoComent;

	public Lexico(PushbackReader in) {
		super(in);
	}

	protected void filter() throws LexerException {
		if (state == State.COMENTARIO) {
			// State.COMENTARIO vai reconhecer comentarios entre /* */
			if (token instanceof TComentarioAninhado) {
				// TComentarioAninhado = /* qualquer símbolo que não seja a sequência '*/' e não termine com '*'
				ultimoComent = (TComentarioAninhado) token;
				// obtém a referência do objeto com as informações do início do comentário
				token = null;
			} else if (token instanceof TFComentarioAninhado) {
				// TFComentarioAninhado = um ou mais '*' seguido por um '/'
				ultimoComent.setText(ultimoComent.getText() + token.getText());
				// adiciona o texto final ao comentário.
				token = ultimoComent;
				state = State.NORMAL;
			} else if (token instanceof EOF)
				// O comentário foi aberto e não foi fechado. Lança um erro léxico.
				throw new LexerException(new InvalidToken(
						ultimoComent.getText(), ultimoComent.getLine(),
						ultimoComent.getPos()),
						"Token de comentário desconhecido.");
		}
	}
}
