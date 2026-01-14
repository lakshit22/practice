package practise.lowleveldesign.structural.decorator.pattern;

public class OrderPriceMain {
    public static void main(String[] args) {
        OrderPrice price = new BasePrice(1500);
        price.calculate();

        OrderPrice extraDishPrice = new ExtraDishDecorator(price);
        extraDishPrice.calculate();

        OrderPrice extraHourPrice = new ExtraHoursDecorator(price);
        extraHourPrice.calculate();

        OrderPrice extraHourWithDish = new ExtraHoursDecorator(new ExtraDishDecorator(price));
        extraHourWithDish.calculate();
    }
}