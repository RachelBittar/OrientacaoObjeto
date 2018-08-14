
public class FabricaMecanicaDoJogo implements MecanicaDoJogo {

	private String palavra;
	private String myguess;
	
	public FabricaMecanicaDoJogo(String palavra, String myguess) {
		this.palavra = palavra;
		this.myguess = myguess;
	}

	@Override
	public boolean fazCompare() {
		
		boolean compare;
		int myattempts=0;
		compare = palavra.equals(myguess);
		
		System.out.println(":" + compare);
			return compare;
		}
		
}
