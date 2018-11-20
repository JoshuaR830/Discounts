package richardson.joshua.discount.tests;

import org.junit.Test;

/**
 * This class groups together tests on item B
 * @author Joshua Richardson
 */

public class TestBs extends Testing{

    /**
     * This tests a single letter B which should calculate no discount
     */
    @Test
    public void calculateTotalPriceB() {
        input = "B";
        expDelivery = 7.00;
        expPrice = 12.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests two letter Bs which should calculate that it is £20.00
     */
    @Test
    public void calculateTotalPrice2Bs() {
        input = "BB";
        expDelivery = 7.00;
        expPrice = 20.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests three letter Bs which should calculate that it is £20.00 + one at full price
     */
    @Test
    public void calculateTotalPrice3Bs() {
        input = "BBB";
        expDelivery = 7.00;
        expPrice = 32.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    /**
     * This tests four letter Bs which should calculate that it is £20.00 + £20.00
     */
    @Test
    public void calculateTotalPrice4Bs() {
        input = "BBBB";
        expDelivery = 7.00;
        expPrice = 40.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}