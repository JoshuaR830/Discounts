package richardson.joshua.discount.tests;

import org.junit.Test;
import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import static org.junit.Assert.*;


public class UnidaysDiscountChallengeSimpleTest {

    int total = 0;
    String input;

    UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge();

//    @Test
//    public void addToBasket() {
//
//    }

    @Test
    public void calculateTotalPriceA() {
        input = "A";
        assertEquals(8.00, discount.calculateTotalPrice(input), 0);
    }

    @Test
    public void calculateTotalPriceB() {
        input = "B";
        assertEquals(12.00, discount.calculateTotalPrice(input), 0);
    }

    @Test
    public void calculateTotalPriceC() {
        input = "C";
        assertEquals(4.00, discount.calculateTotalPrice(input), 0);
    }

    @Test
    public void calculateTotalPriceD() {
        input = "D";
        assertEquals(7.00, discount.calculateTotalPrice(input), 0);
    }

    @Test
    public void calculateTotalPriceE() {
        input = "E";
        assertEquals(5.00, discount.calculateTotalPrice(input), 0);
    }


}