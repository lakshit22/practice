package practise.lowleveldesign.structural.decorator.pattern;

import practise.lowleveldesign.structural.decorator.pattern.OrderPrice;

// abstract class with is-a and has-a relation
abstract class PriceDecorator implements OrderPrice {
    protected final OrderPrice inner;

    public PriceDecorator(OrderPrice inner) {
        this.inner = inner;
    }
}
