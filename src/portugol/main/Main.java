package portugol.main;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import portugol.main.Lexico;

import portugol.lexer.Lexer;
import portugol.lexer.LexerException;
import portugol.node.EOF;
import portugol.node.TBranco;
import portugol.node.Token;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("Tentando abrir para ler o arquivo: " + args[0]);
			try {
				Lexico lexer = new Lexico(new PushbackReader(
						new FileReader(args[0]), 1024));
				AnaliseLexica(args[0], lexer);
			} catch (LexerException e) {
				System.err
						.println("\nSequência de símbolos não reconhecida: \""
								+ e.getToken().getText() + "\", linha "
								+ e.getToken().getLine() + ", coluna "
								+ e.getToken().getPos());
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.err.println("Arquivo de entrada não informado.");
			System.exit(1);
		}
	}

	public static String getTokensEsperados(String messagemErro) {
		String[] tokens;
		messagemErro = messagemErro.substring(messagemErro
				.indexOf("expecting:") + 11);
		tokens = messagemErro.split("'(,[. - '])?");
		String texto = "";

		for (String token : tokens) {

			if (token.length() > 0) {
				if (token.startsWith("id"))
					texto = texto + "\"" + "variável" + "\" ou ";
				else if (token.startsWith("EOF"))
					texto = texto + "\"" + "fim de arquivo" + "\" ou ";
				else if (token.startsWith("num"))
					texto = texto + "\"" + "número" + "\" ou ";
				else
					texto = texto + "\"" + token + "\" ou ";
			}
		}

		return texto.substring(0, texto.length() - 4);
	}

	public static void AnaliseLexica(String arquivo, Lexer lexer)
			throws LexerException, IOException {
		System.out
				.println("Análise Léxica do arquivo: " + arquivo);

		Token token = null;
		int linha = 0;
		while (!((token = lexer.next()) instanceof EOF)) {
			if (!(token instanceof TBranco)) { // Omitindo espaço em branco
				if (linha == 0) {
					linha = token.getLine();
					System.out.print(linha + "-\t");
				}
				if (linha != token.getLine()) {
					linha = token.getLine();
					System.out.print("\n" + linha + "-\t");
				}
				System.out.print(token.getClass().getSimpleName() + "(\'"
						+ token.getText() + "\') ");
			}
		}
	}
}
