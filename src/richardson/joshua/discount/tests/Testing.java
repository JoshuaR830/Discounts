package richardson.joshua.discount.tests;

import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import java.io.ByteArrayInputStream;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class Testing {

    String input;
    double expDelivery;
    double expPrice;
    double expTotal;



    UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge();



    public void calculate(String input, double delivery, double price, double total){


        // Store key value pairs

        discount.basket = new HashMap<Character, Integer>();

        char items[] = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < items.length; i++) {
            discount.basket.put(items[i], 0);
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        discount.addToBasket();
        discount.calculateTotalPrice(input);

        assertEquals(total,discount.getTotal(), 0);
        assertEquals(delivery, discount.getDelivery(), 0);
        assertEquals(price, discount.getPrice(), 0);
    }
}
