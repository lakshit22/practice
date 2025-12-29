package practise.abstraction;

public class RectangleInterface implements ShapeInterface, Printable, Colorable, Cloneable{
    private double width;
    private double height;
    private String color;

    RectangleInterface(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Rectangle with Area " + area() + " and color " + color);
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
