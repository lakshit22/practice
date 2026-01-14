package practise.lowleveldesign.structural.decorator.pattern;

public class ExtraHoursDecorator extends PriceDecorator{

    public ExtraHoursDecorator(OrderPrice inner) {
        super(inner);
    }

    @Override
    public void calculate() {
        System.out.println("Price of Extra Hours is added: 1000");
        inner.calculate();
    }
}
