package richardson.joshua.discount.tests;

import richardson.joshua.discount.code.Program;
import richardson.joshua.discount.code.Rules;
import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class Testing extends Program {

    String input;
    double expDelivery;
    double expPrice;
    double expTotal;

    Rules rules = new Rules();
    UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge(rules);


    public void calculate(String input, double expDelivery, double expPrice, double expTotal){

        discount.initialiseHashMap(discount);

        // I need to be able to allow the program to simulate inputs for testing
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        char[] userInput = discount.getInput();

        for(int i = 0; i<userInput.length; i++){
            discount.addToBasket(userInput[i]);
        }

        assertEquals(expTotal,discount.calculateTotalPrice(), 0);
    }
}
