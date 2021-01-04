public class Constructor {

    private String constructor;

    public Constructor(String constructor) {
        this.constructor = constructor;
    }

    public static void main(String[] args) {

        Constructor constructobject = new Constructor("A constructor is a method used to initialize the state of an object, and it gets invoked at the time of object creation. Rules for constructor are:\n" +
                "•\tConstructor Name should be the same as a class name.\n" +
                "•\tA constructor must have no return type.\n");

        System.out.println(constructobject.toString());

    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    @Override
    public String toString() {
        return "Constructor means: " + constructor;
    }
}