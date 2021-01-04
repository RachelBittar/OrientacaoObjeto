public class Object {

    public String objectIs = "An object is an instance of a class. It has its own state, behavior, and identity.";

    public static void main(String[] args) {

        Object object = new Object();
        System.out.println("What is OOPS? \n" + "\t" + object.getObjectIs());
    }

    public String getObjectIs() {
        return objectIs;
    }


}
