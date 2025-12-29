package practise.abstraction;

public class TestAbstract {
    public static void main(String[] args){
        Rectangle rect = new Rectangle("Blue",10,10);
        System.out.println(rect.area());
        rect.display();
    }
}
