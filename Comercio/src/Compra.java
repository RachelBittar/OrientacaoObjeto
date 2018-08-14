
public class Compra {
	

	int valorTotal;
	int numeroParcelas;
	
	//a vista
	public Compra (int valor) {	
		valorTotal = valor;
		numeroParcelas = 1;	
	}
	

	//Parcelado
	public Compra(int qtdParcelas, int valorParcelas) {
		numeroParcelas = qtdParcelas;	
		valorTotal = numeroParcelas*valorParcelas;
	}
	
	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getValorTotal() {
		return valorTotal;
	}
	
	public int getValorParcela() {
		return valorTotal/numeroParcelas;
		
	}
	

}
