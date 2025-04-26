import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_APPLE;
import static model.constants.Colour.RED_APPLE;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, RED_APPLE);
        Apple greenApple = new Apple(8, 60, GREEN_APPLE);

        ShoppingCart shoppingCart = new ShoppingCart(new Food[]{meat,redApple,greenApple});

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: "+ shoppingCart.getTotalWithDiscount());
        System.out.println("Общая сумма всех вегетарианских товаров: " + shoppingCart.getTotalVegetarianWithoutDiscount());
    }
}
