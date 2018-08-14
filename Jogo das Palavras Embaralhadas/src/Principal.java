import java.util.Iterator;
import java.util.Vector;

public class Principal {

	private final static String FILENAME = "/Users/rachelbittar/Documents/file.txt";

	public static void main(String[] args) {

		Arquivos arquivo = new Arquivos(FILENAME);

		Vector<String> palavras = arquivo.RetornaDados();
		BancoDePalavras bancoDepalavras = new BancoDePalavras(palavras);
		palavras = bancoDepalavras.embaralharPalavras(palavras);
		Iterator<String> iter1 = palavras.iterator();

		String palavra = null, myGuess = null, pemba = null;
		while (iter1.hasNext()) {
			palavra = iter1.next().trim().toUpperCase();
			System.out.println(Embaralhadora(palavra));
			// arquivo.myGuess();
			fazComparacao(Embaralhadora(palavra), arquivo.myGuess());
		}

	}

	private static String Embaralhadora(String palavra) {
		FabricaEmbaralhadores fembaralhadores = new FabricaEmbaralhadores(null);
		return fembaralhadores.fazEmbaralhamento(palavra);
	}

	private static String fazComparacao(String palavra, String myguess) {
		FabricaMecanicaDoJogo fm = new FabricaMecanicaDoJogo(palavra, myguess);
		fm.fazCompare();
		return "ehnois";
	}

}
