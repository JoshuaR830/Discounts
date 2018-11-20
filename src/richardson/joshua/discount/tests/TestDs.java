package richardson.joshua.discount.tests;

import org.junit.Test;

/**
 * This class groups together tests on item D
 * @author Joshua Richardson
 */

public class TestDs extends Testing{

    /**
     * This tests that the user is charged full price for a single item D
     */
    @Test
    public void calculateTotalPriceD() {
        input = "D";
        expDelivery = 7.00;
        expPrice = 7.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests that the user is charged for one when they buy two of item D
     */
    @Test
    public void calculateTotalPrice2Ds() {
        input = "DD";
        expDelivery = 7.00;
        expPrice = 7.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests that the user is charged for two when they buy three of item D
     */
    @Test
    public void calculateTotalPrice3Ds() {
        input = "DDD";
        expDelivery = 7.00;
        expPrice = 14.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests that the user is charged for two when they buy four of item D
     */
    @Test
    public void calculateTotalPrice4Ds() {
        input = "DDDD";
        expDelivery = 7.00;
        expPrice = 14.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests that the user is charged for seven when they buy fourteen of item D
     */
    @Test
    public void calculateTotalPrice14Ds() {
        input = "DDDDDDDDDDDDDD";
        expDelivery = 7.00;
        expPrice = 49.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}