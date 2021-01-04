public class Encapsulation {


    private String objectIsencapsulated = "Encapsulation is an attribute of an object, and it contains all data which is hidden. " +
            "That hidden data can be restricted to the members of that class.";

    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();
        System.out.println("What is Encapsulation? \n" + "\t" + encapsulation.getObjectIsencapsulated());
    }

    private String getObjectIsencapsulated() {
        return objectIsencapsulated;
    }

    private void setObjectIsencapsulated(String objectIsencapsulated) {
        this.objectIsencapsulated = objectIsencapsulated;
    }

}
