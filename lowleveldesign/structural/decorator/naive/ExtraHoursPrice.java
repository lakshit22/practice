package practise.lowleveldesign.structural.decorator.naive;

public class ExtraHoursPrice implements OrderPrice{
    @Override
    public void calculate() {
        System.out.println("Tax is added");
    }
}
