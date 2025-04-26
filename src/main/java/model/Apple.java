package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;


    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public int getDiscount() {
        if (Colour.RED_APPLE.equals(colour)) { //Этого мы еще не проходили, пришлось просить помощи у нейросети и разбираться
            return Discount.RED_APPLE_DISCOUNT;
        } else {
            return 0;
        }
    }

    public String getColour() {
        return colour;
    }
    }






