package richardson.joshua.discount.tests;


import org.junit.Test;

public class TestEs extends Testing{

    @Test
    public void calculateTotalPriceE() {
        input = "E";
        expDelivery = 7.00;
        expPrice = 5.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice2Es() {
        input = "EE";
        expDelivery = 7.00;
        expPrice = 10.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice3Es() {
        input = "EEE";
        expDelivery = 7.00;
        expPrice = 10.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPrice4Es() {
        input = "EEEE";
        expDelivery = 7.00;
        expPrice = 15.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }
}