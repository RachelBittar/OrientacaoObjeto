import java.util.HashMap;
import java.util.Map;

public class Corrida {

	int pista;
	
	Map<CarroDeCorrida, Integer> carros = new HashMap<>();
	public Corrida(int tamanho) {
	 	pista = tamanho;	
	}
	
	public void adicionarCarro(CarroDeCorrida carro) {
		carros.put(carro, 0);		
	}
	
	private boolean terminou() {
		
		for(Integer valor: carros.values()) {
			if(valor >= pista) 
				return true;
			}
		return false; 
	}
	
	public void umDoisTreseJa() {
	 
		
		while(!terminou()) {
			
		for(CarroDeCorrida carro : carros.keySet() ) {
			carro.acelerar();
			
			int distancia = carros.get(carro);
			distancia += carro.getVelocidade();
			carros.put(carro, distancia);
				
			}	
		}
			
		for(CarroDeCorrida carro : carros.keySet() ) {
			System.out.println("Carro: " + carro.getNome() +
					 carros.get(carro));
		}
	
	}
	
	
	
}



