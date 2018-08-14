import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FabricaEmbaralhadores implements Embaralhador {

	private String pembaralhar;
	
	FabricaEmbaralhadores(String palavra) {		
		this.pembaralhar = palavra;
	}
	
	private String Embaralhar(String palavra) {

		char[] caracteres = palavra.toCharArray();
		List<Character> ocharaters  = new ArrayList<Character>(caracteres.length);
		
		for (char c:  caracteres ){
		  ocharaters.add(c); 
		}
		
		Collections.shuffle(ocharaters);
		for ( int i =0; i < caracteres.length ; i++ ){
		     caracteres[i] = ocharaters.get(i); // unboxing
		}
		
		String strEmbaralhada = new String(caracteres);
	//	System.out.println(strEmbaralhada);
		return strEmbaralhada;		
	
	}

	@Override
	public String fazEmbaralhamento (String palavra) {
	
		String embPalavra;
		embPalavra =  Embaralhar(palavra);
	
		return 	embPalavra;
	}

}
