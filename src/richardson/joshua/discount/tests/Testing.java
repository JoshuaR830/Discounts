package richardson.joshua.discount.tests;

import richardson.joshua.discount.code.UnidaysDiscountChallenge;

import static org.junit.Assert.assertEquals;

public class Testing {

    UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge();

    public void calculate(String input, double total, double delivery, double price){
        discount.calculateTotalPrice(input);
        assertEquals(total,discount.getTotal(), 0);
        assertEquals(delivery, discount.getDelivery(), 0);
        assertEquals(price, discount.getPrice(), 0);
    }
}
