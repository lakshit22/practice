package practise.lowleveldesign.structural.decorator.naive;

// combination of two classes
public class ExtraDishWithExtraHoursPrice implements OrderPrice{
    @Override
    public void calculate() {
        System.out.println("Price of Extra Dish with Extra Hours are added");
    }
}
