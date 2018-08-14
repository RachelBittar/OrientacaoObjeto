import java.text.DecimalFormat;

/*
Implemente no Eclipse uma classe chamada Paciente
que possui um construtor que recebe:
o seu peso em quilos e 
sua altura em metros,
ambos utilizando o tipo double.

Crie um método chamado calcularIMC() que calcula o índice de Massa Corporal de acordo
 com a fórmula IMC = peso (quilos) / (altura * altura (metros)).
 
 Crie também um método chamado diagnostico() 
 que utiliza o método calcularIMC() 
 e retorna uma String de acordo com as seguintes faixas de valor:

Baixo peso muito grave = IMC abaixo de 16 kg/m²
Baixo peso grave = IMC entre 16 e 16,99 kg/m²
Baixo peso = IMC entre 17 e 18,49 kg/m²
Peso normal = IMC entre 18,50 e 24,99 kg/m²
Sobrepeso = IMC entre 25 e 29,99 kg/m²
Obesidade grau I = IMC entre 30 e 34,99 kg/m²
Obesidade grau II = IMC entre 35 e 39,99 kg/m²
Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
Implemente no Eclipse uma classe chamada 
Principal em que se criam 3 instâncias da classe Paciente com valores 
diferentes e se imprime no console o resultado dos dois métodos criados.


Cumprimento dos itens pedidos no enunciado
Organização do código implementado

*/


public class Pacientes {
	
	private double quilo, metro;
	
	public double Peso(double peso) {
		this.quilo = peso;
		return quilo;
	}


	public double Altura(double altura) {
		this.metro = altura;
		return metro;
	}


	double calculaIMC() {	
		 double imc;
		 imc = Peso(quilo)/(Altura(metro)*Altura(metro));
	//	 System.out.println("IMC: "+ imc);
		 return imc;
		 
	}
	
	void diagnostico() {
		
		double imc= calculaIMC();

		DecimalFormat formato = new DecimalFormat("#.##");      
		imc = Double.valueOf(formato.format(imc));
		
		
	  if(imc<16) {
		  System.out.println(" Baixo peso muito grave = IMC abaixo de 16 kg/m²" + imc);
		  
	  }else if(imc>16 && imc<16.99) {
		  System.out.println(" Baixo peso grave = IMC entre 16 e 16,99 kg/m²" + imc);
	  }
	  else if(imc>17 && imc<18.49) {
		  System.out.println(" Baixo peso = IMC entre 17 e 18,49 kg/m²" + imc);
	  }
	  else if(imc>18.50 && imc<24.99) {
		  System.out.println(" IMC entre 18,50 e 24,99 kg/m²" + imc);
	  }
		 			  
//				  
//				  Peso normal = 
//				  Sobrepeso = IMC entre 25 e 29,99 kg/m²
//				  Obesidade grau I = IMC entre 30 e 34,99 kg/m²
//				  Obesidade grau II = IMC entre 35 e 39,99 kg/m²
//				  Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
//				  Implemente no Eclipse uma classe chamada 
//				  Principal em que se criam 3 instâncias da classe Paciente com valores 
//				  diferentes e se imprime no console o resultado dos dois métodos criados.
//		  
//		  
		  
	  }
}
