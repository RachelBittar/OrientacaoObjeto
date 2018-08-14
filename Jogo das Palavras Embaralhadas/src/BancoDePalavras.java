import java.util.Collections;
import java.util.Vector;

public class BancoDePalavras {

	private Vector embaralhadas;
	
	public BancoDePalavras(Vector palavras) {
		this.embaralhadas = palavras;
	}
	
	public Vector embaralharPalavras(Vector palavras) {
	
		Collections.shuffle(palavras);
		System.out.println("Palavra embarlhada: " + palavras );
		return palavras 	;	
	
	}
	

}
