package richardson.joshua.discount.tests;

import org.junit.Test;
import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import static org.junit.Assert.*;


public class UnidaysDiscountChallengeSimpleTest {

    String input;
    double expDelivery;
    double expPrice;
    double expTotal;

    UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge();

//    @Test
//    public void addToBasket() {
//
//    }
    public void calculate(String input, double total, double delivery, double price){
        discount.calculateTotalPrice(input);
        assertEquals(expDelivery,discount.getTotal(), 0);
        assertEquals(expDelivery, discount.getDelivery(), 0);
        assertEquals(expPrice, discount.getPrice(), 0);
    }



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