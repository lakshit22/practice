package practise.abstraction;

abstract class Shape {
    protected String color;

    Shape(String color){
        this.color = color;
    }

    void display(){
        System.out.println("Color is : " + color);
    }

    abstract double area();
}
