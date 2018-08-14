
public class CarroMullt extends CarroDeCorrida {

	double potencia;

	public CarroMullt(String nome, double potencia, int velocidademaxima)   {
		super( nome, velocidademaxima);

		if (potencia > 1 && potencia < 2) {
			this.potencia = potencia;
		} else {
			this.potencia = 1.5;
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		if (velocidade == 0) {
			velocidade = 10;
		} else {
			velocidade *= velocidade;
		}
		if (velocidade > velocidademaxima) {
			velocidade = velocidademaxima;
		}

	}

}
