package practise.abstraction;

public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return width*height;
    }
}
