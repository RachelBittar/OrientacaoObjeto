
public class CarroSoma extends CarroDeCorrida{
	
	private int potencia;

	public CarroSoma(String nome, int potencia, int velocidademaxima) {
		super(nome, velocidademaxima);
		this.potencia = potencia;		
	}

	
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidademaxima) 
			velocidade = velocidademaxima;
	}

}
