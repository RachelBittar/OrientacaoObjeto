public class Heir extends Inheritance {

    String newHeirAtribute = "Heir new atribute";

    public static void main(String[] args) {
        Heir heir = new Heir();
        String newHeir = heir.getInheritance() + "This heir";
        System.out.println("What is Encapsulation? \n" + "\t" + heir.getInheritance() + "\t" + heir.getNewHeirAtribute());
    }

    public String getNewHeirAtribute() {
        return newHeirAtribute;
    }

}

