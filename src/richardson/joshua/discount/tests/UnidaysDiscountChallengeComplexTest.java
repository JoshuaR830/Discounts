package richardson.joshua.discount.tests;

import org.junit.Test;

public class UnidaysDiscountChallengeComplexTest extends Testing{

    @Test
    public void calculateTotalPrice4B3Cs() {
        input = "BBBBCCC";
        expDelivery = 0.00;
        expPrice = 50.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPriceA2B3C2D2E() {
        input = "ABBCCCDDEE";
        expDelivery = 0.00;
        expPrice = 55.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }



    @Test
    public void calculateTotalPriceOutOfOrder() {
        input = "EDCBAEDCBC";
        expDelivery = 0.00;
        expPrice = 55.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

}