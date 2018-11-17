package richardson.joshua.discount.code;

public class UnidaysDiscountChallenge extends Program{

    public double deliveryPrice;
    public double deliveryNum;


    // Constructor
    public UnidaysDiscountChallenge(Rules rules){
        this.rules = rules.pricingRules;
        this.deliveryPrice = rules.DELIVERY_COST;
        this.deliveryNum = rules.DELIVERY_THRESHOLD;
    }



    public static void main(String[] args){
        Rules rules = new Rules();
        UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge(rules);

        discount.initialiseHashMap(discount);

        char[] userInput = discount.getInput();

        for(int i = 0; i<userInput.length; i++){
            discount.addToBasket(userInput[i]);
        }

        // Function to actually add to basket
        double totalPrice = discount.calculateTotalPrice();

        System.out.println("Total price: " + totalPrice);
    }



    // Takes the items that the user enters
    public void addToBasket( char val){
        int num = basket.get(val);
        basket.replace(val, num+1);
    }



    // Works out the total item price, delivery and total overall price
    public double calculateTotalPrice(){

        // Get the price for the items and for delivery
        double price = calculatePrice();
        double delivery = calculateDelivery(price);

        // Return the total
        return price + delivery;
    }



    // Calculates delivery charge based on total price
    private double calculateDelivery(double price){

        if(price >= this.deliveryNum){
            return 0.00;
        }else{
            return this.deliveryPrice;
        }
    }



    // This adds values to the totals appropriately
    private double calculatePrice(){
        double price = 0;
        for(int i = 0; i < items.length; i++){
            price += calculate(basket.get(items[i]), (int) rules[i][0], rules[i][1], rules[i][2]);
        }

        return price;
    }



    // Applies the rules appropriately based on inputs
    private double calculate(int numItem, int numforDiscount, double price, double discount){

        double subTotal;
        subTotal = discount * (numItem/numforDiscount);
        int mod = numItem % numforDiscount;
        subTotal += price*mod;

        return subTotal;
    }
}