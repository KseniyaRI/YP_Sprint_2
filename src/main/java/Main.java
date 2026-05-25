import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main (String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, RED);
        Apple greenApples = new Apple (8, 60, GREEN);

        Food[] foods = {meat, redApples, greenApples};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println(shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getTotalVegetarianPriceWithoutDiscount());
    }
}
