import java.util.HashMap;
import java.util.Map;

/*
 * Crie uma classe Pizza
 *  que possua o método adicionaIngrediente() 
 *  que recebe uma String com o ingrediente a ser adicionado.  ok
 *  
 *   Essa classe também deve possuir o método getPreco() 
 *  que calcula da seguinte forma: 
 *  2 ingredientes ou menos custam 15 reais,
 *  3 a 5 ingredientes custam 20 reais 
 *  mais de 5 ingredientes custa 23 reais.
 *  É preciso contabilizar os ingredientes gastos por todas as pizzas!
 *  
 *  Utilize uma variável estática na classe Pizza para guardar esse tipo
 *  de informação 
 *  (dica: utilize a classe HashMap para guardar o
 *  ingrediente como chave e um Integer como valor).
 *  
 * Crie o método estático contabilizaIngrediente()
 * para ser chamado dentro de adicionaIngrediente() 
 * e fazer esse registro.
*/


public class Pizza {
	
	
	 //É preciso contabilizar os ingredientes gastos por todas as pizzas! 
	 //Utilize uma variável estática na classe Pizza para guardar esse tipo
	 //de informação 
	  static HashMap<String, Integer> ingredientesTotais = new HashMap<String, Integer>();
	  
	  HashMap<String, Integer> ingredientesDaPizza = new HashMap<String, Integer>();

	   
	  void adicionaIngrediente(String ingrediente) {
		  //armazena cada ingrediente
	     int ingredientesDaPizza = this.ingredientesDaPizza.getOrDefault(ingrediente, 0);
	     
	     //adiciona ao mapa o novo ingrediente e incrementa o contador 
	     this.ingredientesDaPizza.put(ingrediente, ++ingredientesDaPizza);
	     contabilizaIngrediente(ingrediente);
	    }

	    static void contabilizaIngrediente(String ingrediente) {
	        
	    	//armazena o TOTAL dos ingredientes
	    	int ingredientesTotais = Pizza.ingredientesTotais.getOrDefault(ingrediente, 0);   
	    Pizza.ingredientesTotais.put(ingrediente, ++ingredientesTotais);
	    }

	    static void zerarIngredientes() {
	        Pizza.ingredientesTotais.clear();
	    }

	    int totalIgredientesDaPizza() {
	        int total = 0;
	        for (Map.Entry<String, Integer> entry : ingredientesDaPizza.entrySet()) {
	            total += entry.getValue();
	        }
	        return total;

	    }

	    int getPreco() {
	        int total = totalIgredientesDaPizza();

	        if (total <= 2) {
	            return 15;
	        } else if (total >= 3 && total <= 5) {
	            return 20;
	        }
	        return 22;
	    }
	  
	  

}
