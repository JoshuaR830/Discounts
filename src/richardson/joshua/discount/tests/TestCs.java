package richardson.joshua.discount.tests;

import org.junit.Test;

/**
 * This class groups together tests on item C
 * @author Joshua Richardson
 */

public class TestCs extends Testing{

    /**
     * This tests a single item C in the basket to check that no discount is applied
     */
    @Test
    public void calculateTotalPriceC() {
        input = "C";
        expDelivery = 7.00;
        expPrice = 4.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests two item Cs in the basket to check that no discount is applied
     */
    @Test
    public void calculateTotalPrice2Cs() {
        input = "CC";
        expDelivery = 7.00;
        expPrice = 8.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests three item Cs in the basket to check that the user is charged £10.00 for them (excluding postage)
     */
    @Test
    public void calculateTotalPrice3Cs() {
        input = "CCC";
        expDelivery = 7.00;
        expPrice = 10.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests four item Cs in the basket to check that the user is charged £10.00 for three and one at full price
     */
    @Test
    public void calculateTotalPrice4Cs() {
        input = "CCCC";
        expDelivery = 7.00;
        expPrice = 14.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}