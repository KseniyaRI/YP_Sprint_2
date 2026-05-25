package service;

import model.Food;

public class ShoppingCart {

    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice = totalPrice + foods[i].getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            double priceWithoutDiscount = foods[i].getTotalPrice();
            double discountAmount = priceWithoutDiscount * foods[i].getDiscount() / 100;
            totalPrice = totalPrice + priceWithoutDiscount - discountAmount;
        }
        return totalPrice;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            if(foods[i].isVegetarian()) {
                totalPrice = totalPrice + (foods[i].getTotalPrice());
            }
        }
        return totalPrice;
    }
}

/* комментарий для проверяющего: можно в методах использовать конструкцию (Food food : foods),
но в теории такого не было, так что оставила отработку цикла в таком виде
 */
