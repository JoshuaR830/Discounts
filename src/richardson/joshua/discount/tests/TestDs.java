package richardson.joshua.discount.tests;

import org.junit.Test;

public class TestDs extends Testing{

    @Test
    public void calculateTotalPriceD() {
        input = "D";
        expDelivery = 7.00;
        expPrice = 7.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice2Ds() {
        input = "DD";
        expDelivery = 7.00;
        expPrice = 7.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice3Ds() {
        input = "DDD";
        expDelivery = 7.00;
        expPrice = 14.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice4Ds() {
        input = "DDDD";
        expDelivery = 7.00;
        expPrice = 14.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice14Ds() {
        input = "DDDDDDDDDDDDDD";
        expDelivery = 7.00;
        expPrice = 49.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}