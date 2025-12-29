package practise.abstraction;

public interface ShapeInterface {
    double area();

    default void displayMessage(){
        System.out.println("This is a Shape");
    }

    static void info(){
        System.out.println("Interface for Shapes");
    }
}
