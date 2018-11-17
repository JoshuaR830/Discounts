package richardson.joshua.discount.code;

public class Rules {

    // You can change the rules
    // numForDiscount represents the number of items you have to buy to get a discount
    // price is the price that the items cost when not discounted
    // discount is the combined price you pay for the number of items defined

    static final double DELIVERY_THRESHOLD = 50.00;
    static final double DELIVERY_COST = 7.00;

    private double numForDiscountA = 1;
    private double priceA = 8.00;
    private double discountA = priceA;

    private double numForDiscountB = 2;
    private double priceB = 12.00;
    private double discountB = 20.00;

    private double numForDiscountC = 3;
    private double priceC = 4.00;
    private double discountC = 10.00;

    private double numForDiscountD = 2;
    private double priceD = 7.00;
    private double discountD = priceD;

    private double numForDiscountE = 3;
    private double priceE = 5.00;
    private double discountE = 2*priceE;



    private double pricingRules[][] = {
            {numForDiscountA, priceA, discountA},
            {numForDiscountB, priceB, discountB},
            {numForDiscountC, priceC, discountC},
            {numForDiscountD, priceD, discountD},
            {numForDiscountE, priceE, discountE},
    };


    public double[][] getPricingRules() {
        return pricingRules;
    }

    public static double getDeliveryThreshold() {
        return DELIVERY_THRESHOLD;
    }

    public static double getDeliveryCost() {
        return DELIVERY_COST;
    }
}
