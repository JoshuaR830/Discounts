package richardson.joshua.discount.tests;

import org.junit.Test;
import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import static org.junit.Assert.*;


public class UnidaysDiscountChallengeSimpleTest extends Testing {

    String input;
    double expDelivery;
    double expPrice;
    double expTotal;


    @Test
    public void calculateTotalPriceA() {
        input = "A";
        expDelivery = 7.00;
        expPrice = 8.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPriceB() {
        input = "B";
        expDelivery = 7.00;
        expPrice = 12.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPriceC() {
        input = "C";
        expDelivery = 7.00;
        expPrice = 4.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPriceD() {
        input = "D";
        expDelivery = 7.00;
        expPrice = 7.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }

    @Test
    public void calculateTotalPriceE() {
        input = "E";
        expDelivery = 7.00;
        expPrice = 5.00;
        expTotal = expDelivery + expPrice;
        calculate(input, expDelivery, expPrice, expTotal);
    }


}