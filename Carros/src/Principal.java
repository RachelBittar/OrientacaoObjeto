
public class Principal {

	public static void main(String[] args) {
		

	Corrida corridadaamizade = new Corrida(100);
	corridadaamizade.adicionarCarro(new CarroSoma("Carro A ",100,110));
	corridadaamizade.adicionarCarro(new CarroSoma("Carro B ",8,140));
	corridadaamizade.adicionarCarro(new CarroMullt("Carro C ",1.7,110));
	corridadaamizade.adicionarCarro(new CarroMullt("Carro D ",1.4,110));
		
	corridadaamizade.umDoisTreseJa();

	}
	
}
