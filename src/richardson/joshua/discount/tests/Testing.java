package richardson.joshua.discount.tests;

import richardson.joshua.discount.code.Rules;
import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Testing {

    String input;
    double expDelivery;
    double expPrice;
    double expTotal;

    Rules rules = new Rules();
    UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge(rules);


    public void calculate(String input, double expDelivery, double expPrice, double expTotal){


        // Store key value pairs

        discount.basket = new HashMap<Character, Integer>();

        char items[] = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < items.length; i++) {
            discount.basket.put(items[i], 0);
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Scanner itemInput = new Scanner(System.in);
        char[] userInput = itemInput.next().toCharArray();

        for(int i = 0; i<userInput.length; i++){
            discount.addToBasket(userInput[i]);
        }

        double actualTotal = discount.calculateTotalPrice();

        assertEquals(expTotal,actualTotal, 0);
//        assertEquals(expDelivery, discount.getDelivery(), 0);
//        assertEquals(expPrice, discount.getPrice(), 0);
    }
}
