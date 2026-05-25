package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.DEFAULT_DISCOUNT;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (RED.equals(colour)) {
            return RED_APPLE_DISCOUNT;
        }
        return DEFAULT_DISCOUNT;
    }
}
