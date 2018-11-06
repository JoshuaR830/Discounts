package richardson.joshua.discount.tests;

import org.junit.Test;
import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import static org.junit.Assert.*;

public class UnidaysDiscountChallengeComplexTest extends Testing{
    String input;
    double expDelivery;
    double expPrice;
    double expTotal;


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
        expDelivery = 5.00;
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

    @Test
    public void calculateTotalPrice4B3Cs() {
        input = "BBBBCCCC";
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