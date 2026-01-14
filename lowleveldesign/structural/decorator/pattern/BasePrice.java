package practise.lowleveldesign.structural.decorator.pattern;

import practise.lowleveldesign.structural.decorator.pattern.OrderPrice;

public class BasePrice implements OrderPrice {
    private final int basePrice;

    public BasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public void calculate() {
        System.out.println("Base Price is " + basePrice);
    }
}
