package richardson.joshua.discount.tests;

import org.junit.Test;

public class TestCs extends Testing{

    @Test
    public void calculateTotalPriceC() {
        input = "C";
        expDelivery = 7.00;
        expPrice = 4.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }


    @Test
    public void calculateTotalPrice2Cs() {
        input = "CC";
        expDelivery = 7.00;
        expPrice = 8.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice3Cs() {
        input = "CCC";
        expDelivery = 7.00;
        expPrice = 10.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice4Cs() {
        input = "CCCC";
        expDelivery = 7.00;
        expPrice = 14.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}