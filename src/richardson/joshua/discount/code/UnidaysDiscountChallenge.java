package richardson.joshua.discount.code;

import java.util.*;

public class UnidaysDiscountChallenge {

    static final double DELIVERY_THRESHOLD = 50.00;
    static final double DELIVERY_COST = 7.00;
    static final int NUM_ITEMS = 5;

    double priceA = 8.00;
    double priceB = 12.00;
    double priceC = 4.00;
    double priceD = 7.00;
    double priceE = 5.00;




    private double delivery = 0;
    private double price = 0;
    private double total = 0;
    public HashMap<Character, Integer> basket;

    public static void main(String[] args){
        UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge();

        // Store key value pairs
        discount.basket = new HashMap<Character, Integer>();

        char items[] = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < items.length; i++) {
            discount.basket.put(items[i], 0);
        }

        // Function to actually add to basket
        discount.addToBasket();
        discount.calculateTotalPrice("AAA");

    }
    public HashMap<Character, Integer> getBasket() {
        return basket;
    }

    public double getDelivery() {
        return total;
    }

    public double getTotal() {
        return total;
    }

    public double getPrice() {
        return price;
    }




    // Takes the items that the user enters
    public void addToBasket(){
        Scanner itemInput = new Scanner(System.in);
        char[] userInput = itemInput.next().toCharArray();
        for(int i = 0; i<userInput.length; i++){
            int num = basket.get(userInput[i]);
            basket.replace(userInput[i], num+1);
        }
    }

    // Works out the total item price, delivery and total overall price
    public void calculateTotalPrice(String items){
        this.price = 0;

        // This adds values to the totals appropriately
        this.price += calculateA(basket.get('A'));
        this.price += calculateB(basket.get('B'));
        this.price += calculateC(basket.get('C'));
        this.price += calculateD(basket.get('D'));
        this.price += calculateE(basket.get('E'));

        // Calculates delivery charge based on total price
        if(this.total >= DELIVERY_THRESHOLD){
            this.delivery = 0.00;
        }else{
            this.delivery = DELIVERY_COST;
        }

        this.total = this.price + this.delivery;
    }



    // Applies rules for A
    private double calculateA(int num){
        double subTotal;
        subTotal = 0;

        subTotal += priceA*num;

        System.out.println("£" + subTotal);
        return subTotal;
    }

    // Applies rules for B
    private double calculateB(int num){
        double subTotal;
        subTotal = 0;

        int mod = num % 2;

        subTotal += mod * priceC;

        subTotal += (num-mod) * priceC;

        System.out.println(subTotal);
        return subTotal;
    }

    // Applies rules for C
    private double calculateC(int num){
        double subTotal;
        subTotal = 0;
        System.out.println(subTotal);
        return subTotal;
    }

    // Applies rules for D
    private double calculateD(int num){
        double subTotal;
        subTotal = 0;
        System.out.println(subTotal);
        return subTotal;
    }

    // Applies rules for E
    private double calculateE(int num){
        double subTotal;
        subTotal = 0;



        System.out.println(subTotal);
        return subTotal;
    }

}
