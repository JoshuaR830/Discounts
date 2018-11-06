package richardson.joshua.discount.tests;

import org.junit.Test;

public class TestBs extends Testing{

    @Test
    public void calculateTotalPriceB() {
        input = "B";
        expDelivery = 7.00;
        expPrice = 12.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice2Bs() {
        input = "BB";
        expDelivery = 7.00;
        expPrice = 20.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice3Bs() {
        input = "BBB";
        expDelivery = 7.00;
        expPrice = 32.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice4Bs() {
        input = "BBBB";
        expDelivery = 7.00;
        expPrice = 40.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}