package practise.abstraction;

public class TestInterface {
    public static void main(String[] args){
        RectangleInterface rect = new RectangleInterface(10,10);
        rect.setColor("Blue");
        rect.print();
        ShapeInterface.info();
        rect.displayMessage();

        RectangleInterface rectCloned = (RectangleInterface) rect.clone();
        rectCloned.setColor("Silver");
        rect.print();
        rectCloned.print();
        boolean b = "Lakshit".equals("Lakshit");
    }
}
