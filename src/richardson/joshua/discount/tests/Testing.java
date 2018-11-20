package richardson.joshua.discount.tests;

import richardson.joshua.discount.code.EasyInitialisation;
import richardson.joshua.discount.code.Rules;
import richardson.joshua.discount.code.UnidaysDiscountChallenge;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.assertEquals;

/**
 * I made this class to easily allow each of the test files to extend it in order to reduce the duplication of code
 * This makes it much easier to maintain
 * @author Joshua Richardson
 */
public class Testing extends EasyInitialisation {

    String input;
    double expDelivery;
    double expPrice;
    double expTotal;

    Rules rules = new Rules();
    UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge(rules);

    /**
     * This sets up the program to be able to create its own inputs without relying on the user to enter values
     * the items are added to the basket using methods in the EasyInitialisation class
     * an assertion is performed to see if the expectation matches the actual value calculated
     * @param input is the contents of basket items
     * @param expDelivery is the delivery that I would expect for the original rules
     * @param expPrice is the price that I would expect for the original rules
     * @param expTotal is the delivery + price that I would expect for the original rules
     */
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
