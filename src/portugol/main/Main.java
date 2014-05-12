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
import portugol.parser.Parser;
import portugol.parser.ParserException;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0) {
			try {
				Lexico lexer = new Lexico(new PushbackReader(new FileReader(
						args[0]), 1024));
				Parser parser = new Parser(lexer);
				/* Start start = */parser.parse();
				// start.apply();
			} catch (LexerException e) {
				System.err
						.println("\nSequência de símbolos não reconhecida: \""
								+ e.getToken().getText() + "\", linha "
								+ e.getToken().getLine() + ", coluna "
								+ e.getToken().getPos());
			} catch (ParserException e) {
				if (e.getToken() instanceof EOF) {
					System.err
							.println("\nSintáxe não aceita: espera-se que a última declaração seja a função \"void main(void){...}\"");
				} else {
					System.err.println("\nSintáxe não aceita: \""
							+ e.getToken().getText()
							+ "\" declarado quando se espera "
							+ getTokensEsperados(e.getMessage()) + ", linha "
							+ e.getToken().getLine() + ", coluna "
							+ e.getToken().getPos());
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.err.println("Arquivo de entrada não informado.");
			System.exit(1);
		}
		System.out.println("O programa foi aceito Léxicamente!");
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

	//
	// O codigo abaixo é utilizado apar a analise lexica
	//
	public void testeLexico(String[] args) {
		if (args.length > 0) {
			System.out.println("Abrindo o arquivo arquivo: " + args[0]);
			try {
				Lexico lexer = new Lexico(new PushbackReader(new FileReader(
						args[0]), 1024));
				AnaliseLexica(args[0], lexer);
			} catch (LexerException e) {
				System.err.println("\nErro na linha " + e.getToken().getLine()
						+ " e coluna " + e.getToken().getPos() + ".");
				System.err.println("Cadeia nao aceita \""
						+ e.getToken().getText() + "\".");
				// Essa linha abaixo imprime o codigo unicode do caractere nao
				// aceito
				// System.out.println( "\\u" +
				// Integer.toHexString(e.getToken().getText().charAt(0) |
				// 0x10000).substring(1) );
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.err
					.println("Deve ser passado um parametro contendo o caminho do arquivo de entrada.");
			System.exit(1);
		}
	}

	public static void AnaliseLexica(String arquivo, Lexer lexer)
			throws LexerException, IOException {
		System.out.println("Análise Léxica do arquivo: " + arquivo);

		Token token = null;
		int linha = 0;
		while (!((token = lexer.next()) instanceof EOF)) {
			// O espaco em branco sera desconsiderado
			if (!(token instanceof TBranco)) {
				if (linha == 0) {
					linha = token.getLine();
					System.out.print(linha + ": ");
				}
				if (linha != token.getLine()) {
					linha = token.getLine();
					System.out.print("\n" + linha + ": ");
				}
				System.out.print(token.getClass().getSimpleName() + "(\'"
						+ token.getText() + "\') ");

			}
		}
	}
}
