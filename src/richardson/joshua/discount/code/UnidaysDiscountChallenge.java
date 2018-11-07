package richardson.joshua.discount.code;

import java.util.*;

public class UnidaysDiscountChallenge {

    static final double DELIVERY_THRESHOLD = 50.00;
    static final double DELIVERY_COST = 7.00;
    static final int NUM_ITEMS = 5;
    private double delivery = 0;
    private double price = 0;
    private double total = 0;
    private HashMap<Character, Integer> basket;

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

    public double getDelivery() {
        return total;
    }

    public double getTotal() {
        return total;
    }

    public double getPrice() {
        return price;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
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
        System.out.println(num);
        return subTotal;
    }

    // Applies rules for B
    private double calculateB(int num){
        double subTotal;
        subTotal = 0;
        System.out.println(num);
        return subTotal;
    }

    // Applies rules for C
    private double calculateC(int num){
        double subTotal;
        subTotal = 0;
        System.out.println(num);
        return subTotal;
    }

    // Applies rules for D
    private double calculateD(int num){
        double subTotal;
        subTotal = 0;
        System.out.println(num);
        return subTotal;
    }

    // Applies rules for E
    private double calculateE(int num){
        double subTotal;
        subTotal = 0;
        System.out.println(num);
        return subTotal;
    }





}
