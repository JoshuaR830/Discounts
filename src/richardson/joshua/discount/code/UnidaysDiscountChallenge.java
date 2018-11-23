package richardson.joshua.discount.code;


/**
 * UnidaysDiscountProgram takes a string of letters as an input and then calculates how much it would cost
 * to purchase the items given the discounts that are to be applied.
 * It takes into account the total price of the items in the basket and then works out the delivery price
 * The total price is calculated
 *
 * @author Joshua Richardson*/
public class UnidaysDiscountChallenge extends EasyInitialisation implements CalculateDiscounts{

    public double deliveryPrice;
    public double deliveryNum;


    // Constructor
    public UnidaysDiscountChallenge(Rules rules){
        this.rules = rules.getPricingRules();
        this.deliveryPrice = rules.getDeliveryCost();
        this.deliveryNum = rules.getDeliveryThreshold();
    }


    /**
     * This is the main method in the program, it is used to call addToBasket() and calculateTotalPrice()
     * to calculate the total price that the user will have to pay for their basket of items
     * It uses some other methods too to initialise the program more efficiently and minimise repeated code
     * @param args not used
     */
    public static void main(String[] args){
        Rules rules = new Rules();
        UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge(rules);

        discount.initialiseHashMap(discount);

        char[] userInput = discount.getInput();

        for (char anUserInput : userInput) {
            discount.addToBasket(Character.toUpperCase(anUserInput));
        }

        // Function to actually add to basket
        double totalPrice = discount.calculateTotalPrice();

        System.out.println("Total price: " + totalPrice);
    }


    // Adds the items to the basket if they are eligible
    public void addToBasket( char val){
        try {
            int num = basket.get(val);
            basket.replace(val, num + 1);
        }catch(Exception e){
            System.out.println("You entered" + val + " but that item is unknown");
        }
    }


    // Works out the total item price, delivery and total overall price
    public double calculateTotalPrice(){

        // Get the price for the items and for delivery
        double price = calculatePrice();
        double delivery = calculateDelivery(price);

        // Return the total
        return price + delivery;
    }


    /**
     * The purpose of this method is to work out whether the user needs to pay a delivery fee or not
     * @param price is the total price of the items
     * @return double is the value of the delivery cost based on whether the user has spent more than the £50 required
     * to be eligible for free delivery
     * */
    private double calculateDelivery(double price){

        if(price >= this.deliveryNum || price == 0){
            return 0.00;
        }else{
            return this.deliveryPrice;
        }
    }


    /**
     * The purpose of this method is to calculate the total value of the items in the basket including the discounts
     * @return price which represents the total price of all of the items
     * */
    private double calculatePrice(){
        double price = 0;
        for(int i = 0; i < items.length; i++){
            price += calculateForGivenLetter(basket.get(items[i]), (int) rules[i][0], rules[i][1], rules[i][2]);
        }

        return price;
    }


    /**
     * The purpose of this method is to calculate the price paid for all of a specific item, it takes the rules that
     * should be applied to the pricing to ensure that the right price is applied@param numItem is the number of the item that the user has requested to buy
     * @param numForDiscount is the number of the items that are needed for the discount to be applied
     * @param price is the amount that the user will pay for 1 item with no discount applied
     * @param discount is the value applied if a discount is applicable
     *
     * @return subTotal is returned, this is the total for the item
     * */
    private double calculateForGivenLetter(int numItem, int numForDiscount, double price, double discount){

        double subTotal;
        subTotal = discount * Math.floor((double)numItem/(double)numForDiscount);
        int mod = numItem % numForDiscount;
        subTotal += price*mod;

        return subTotal;
    }
}