package practise.lowleveldesign.structural.decorator.pattern;

public class ExtraDishDecorator extends PriceDecorator{
    public ExtraDishDecorator(OrderPrice inner) {
        super(inner);
    }

    @Override
    public void calculate() {
        System.out.println("Extra Dish Price is added: 500");
        inner.calculate();
    }
}
