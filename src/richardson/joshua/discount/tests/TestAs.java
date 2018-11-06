package richardson.joshua.discount.tests;

import org.junit.Test;

public class TestAs extends Testing{
    @Test
    public void calculateTotalPriceA() {
        input = "A";
        expDelivery = 7.00;
        expPrice = 8.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice2As() {
        input = "AA";
        expDelivery = 7.00;
        expPrice = 16.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice3As() {
        input = "AAA";
        expDelivery = 7.00;
        expPrice = 24.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice4As() {
        input = "AAAA";
        expDelivery = 7.00;
        expPrice = 32.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }




}