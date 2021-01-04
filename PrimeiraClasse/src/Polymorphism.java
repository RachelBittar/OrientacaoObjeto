import java.util.ArrayList;
import java.util.List;

abstract class Pet {

    public abstract void getName();

    public abstract void makeSound();

    public abstract void makeMovement();

    public abstract void override();
}

class Cat extends Pet {
    @Override
    public void getName() {
        System.out.println("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void makeMovement() {
        System.out.println("Walk");
    }

    @Override
    public void override() {
        System.out.println("Dynamic or Run time polymorphism is also known as method overriding in which call to an " +
                "overridden function is resolved during run time, not at the compile time.");
    }
}


class Fish extends Pet {

    @Override
    public void getName() {
        System.out.println("Fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Glub  Glub");
    }

    @Override
    public void makeMovement() {
        System.out.println("Swiming");
    }

    @Override
    public void override() {
        System.out.println("Dynamic or Run time polymorphism is also known as method overriding in which call to an " +
                "overridden function is resolved during run time, not at the compile time.");
    }

}


class Main {

    public static void main(String args[]) {

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Cat());
        pets.add(new Fish());


        for (Pet pet : pets) {
            pet.getName();
            pet.makeSound();
            pet.makeMovement();
            pet.override();

            System.out.println();
        }

    }
}


class Overload {
    void demo(int a) {
        System.out.println("a: " + a);
    }

    void demo(int a, int b) {
        System.out.println("a and b: " + a + "," + b);
    }

    double demo(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class MethodOverloading {
    public static void main(String args[]) {
        Overload Obj = new Overload();
        double result;
        Obj.demo(10);
        Obj.demo(10, 20);
        result = Obj.demo(5.5);
        System.out.println("O/P : " + result);
    }
}
