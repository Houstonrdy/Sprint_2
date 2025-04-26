package service;

import model.Food;


public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemPrice = item.getPrice() * (1 - item.getDiscount() / 100.0);
            total += itemPrice * item.getAmount();
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getPrice() * item.getAmount();
            }
        }
        return total;
    }
}



