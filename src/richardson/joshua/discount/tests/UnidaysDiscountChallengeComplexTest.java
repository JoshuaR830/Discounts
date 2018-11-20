package richardson.joshua.discount.tests;

import org.junit.Test;

/**
 * This class groups together tests on a mixture of the items which is more complex than just the single item tests
 * @author Joshua Richardson
 */

public class UnidaysDiscountChallengeComplexTest extends Testing{

    /**
     * This checks that the delivery discount is applied correctly when a combination of items are ordered
     * It is on the boundary so ensures that the condition is correct
     */
    @Test
    public void calculateTotalPrice4B3Cs() {
        input = "BBBBCCC";
        expDelivery = 0.00;
        expPrice = 50.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This checks that the program can handle a combination of items correctly when in order
     */
    @Test
    public void calculateTotalPriceA2B3C2D2E() {
        input = "ABBCCCDDEE";
        expDelivery = 0.00;
        expPrice = 55.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }


    /**
     * This checks that the same items in the basket in a different order will generate discounts correctly
     */
    @Test
    public void calculateTotalPriceOutOfOrder() {
        input = "EDCBAEDCBC";
        expDelivery = 0.00;
        expPrice = 55.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

}