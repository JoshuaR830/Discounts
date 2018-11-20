package richardson.joshua.discount.tests;

import org.junit.Test;

/**
 * This class groups together tests on item A
 * @author Joshua Richardson
 */

public class TestAs extends Testing{

    /**
     * This tests a single letter A which should calculate just the price of 1 item with no discounts
     */
    @Test
    public void calculateTotalPriceA() {
        input = "A";
        expDelivery = 7.00;
        expPrice = 8.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests two letter As which should calculate just the price of 2 items with no discounts
     */
    @Test
    public void calculateTotalPrice2As() {
        input = "AA";
        expDelivery = 7.00;
        expPrice = 16.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests three letter As which should calculate just the price of 3 items with no discounts
     */
    @Test
    public void calculateTotalPrice3As() {
        input = "AAA";
        expDelivery = 7.00;
        expPrice = 24.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests four letter As which should calculate just the price of 4 items with no discounts
     */
    @Test
    public void calculateTotalPrice4As() {
        input = "AAAA";
        expDelivery = 7.00;
        expPrice = 32.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }




}