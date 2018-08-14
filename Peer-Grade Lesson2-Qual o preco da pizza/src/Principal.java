import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("tomate");
     //   p1.adicionaIngrediente("requeijao");
     //  p1.adicionaIngrediente("mussarela");
     //   p1.adicionaIngrediente("chocolalate");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("abacaxi");
        p2.adicionaIngrediente("chocolate");
    //    p2.adicionaIngrediente("avela");
    //    p2.adicionaIngrediente("abobora");
        
        Pizza p3 = new Pizza();
    //    p3.adicionaIngrediente("tomate");
        p3.adicionaIngrediente("catupiry");
        p3.adicionaIngrediente("chocolate");
        p3.adicionaIngrediente("abobora");
        
        Pizza p4 = new Pizza();
        p4.adicionaIngrediente("tomate");
        p4.adicionaIngrediente("catupiry");
        p4.adicionaIngrediente("chocolate");
        p4.adicionaIngrediente("abobora");


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarPizza(p1);
        carrinho.adicionarPizza(p2);
        carrinho.adicionarPizza(p3);
        carrinho.adicionarPizza(p4);

        System.out.println("$ da pizza 1: " + p1.getPreco());
        System.out.println("$ da pizza 2: " + p2.getPreco());
        System.out.println("$ da pizza 3: " + p3.getPreco());

        System.out.println("Total de : "+ carrinho.totalDoCarrinho());

        System.out.println("Igredientes utilizados e Quantidades:");

        for (Map.Entry<String, Integer> igrediente : Pizza.ingredientesTotais.entrySet()) {
            System.out.println("Igrediente: "+ igrediente.getKey() + ": " + igrediente.getValue());
        }
    }
}