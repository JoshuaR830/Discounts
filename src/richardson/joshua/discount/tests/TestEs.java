package richardson.joshua.discount.tests;


import org.junit.Test;

/**
 * This class groups together tests on item E
 * @author Joshua Richardson
 */

public class TestEs extends Testing{

    /**
     * This checks that the user is charged full price when they buy one of item E
     */
    @Test
    public void calculateTotalPriceE() {
        input = "E";
        expDelivery = 7.00;
        expPrice = 5.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This checks that the user is charged full price for each item when they buy two of item E
     */
    @Test
    public void calculateTotalPrice2Es() {
        input = "EE";
        expDelivery = 7.00;
        expPrice = 10.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This checks that the correct discount is applied when buying three of item E so that it costs the price of two
     */
    @Test
    public void calculateTotalPrice3Es() {
        input = "EEE";
        expDelivery = 7.00;
        expPrice = 10.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This checks that the user is charged for three items when they buy four of item C
     */
    @Test
    public void calculateTotalPrice4Es() {
        input = "EEEE";
        expDelivery = 7.00;
        expPrice = 15.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}