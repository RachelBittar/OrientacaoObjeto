
public abstract class CarroDeCorrida {	
	
	protected int velocidade;
	protected int velocidademaxima;
	protected String nome;

	public CarroDeCorrida( String nome, int velocidademaxima) {	
		this.nome = nome;
		this.velocidademaxima = velocidademaxima;
		this.velocidade = 0;
	}

	public abstract void acelerar();
	

	public String getNome() {
		return nome;
	}

	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}
	

}
