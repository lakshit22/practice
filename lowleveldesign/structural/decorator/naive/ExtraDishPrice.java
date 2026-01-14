package practise.lowleveldesign.structural.decorator.naive;

public class ExtraDishPrice implements OrderPrice{
    @Override
    public void calculate() {
        System.out.println("Price of Extra Dish is added");
    }
}
