package richardson.joshua.discount.code;

import java.util.HashMap;
import java.util.Scanner;

public class UnidaysDiscountChallenge {

    public double deliveryPrice;
    public double deliveryNum;

    public char items[] = {'A', 'B', 'C', 'D', 'E'};

    public HashMap<Character, Integer> basket;

    public double[][] rules;

    public UnidaysDiscountChallenge(Rules rules){
        this.rules = rules.pricingRules;
        this.deliveryPrice = rules.DELIVERY_COST;
        this.deliveryNum = rules.DELIVERY_THRESHOLD;
    }

    public static void main(String[] args){
        Rules rules = new Rules();
        UnidaysDiscountChallengeWithExtraStuff discount = new UnidaysDiscountChallengeWithExtraStuff(rules);

        // Store key value pairs
        discount.basket = new HashMap<Character, Integer>();

        for (int i = 0; i < discount.items.length; i++) {
            discount.basket.put(discount.items[i], 0);
        }

        Scanner itemInput = new Scanner(System.in);
        char[] userInput = itemInput.next().toCharArray();

        for(int i = 0; i<userInput.length; i++){
            discount.addToBasket(userInput[i]);
        }

        // Function to actually add to basket
        double totalPrice = discount.calculateTotalPrice();

        System.out.println(totalPrice + "\n");

    }

    // Takes the items that the user enters
    public void addToBasket( char val){
        int num = basket.get(val);
        basket.replace(val, num+1);
    }

    // Works out the total item price, delivery and total overall price
    public double calculateTotalPrice(){
        // This adds values to the totals appropriately
        double price = 0;
        for(int i = 0; i < items.length; i++){
            price += calculate(basket.get(items[i]), (int) rules[i][0], rules[i][1], rules[i][2]);
        }

        // Calculates delivery charge based on total price
        double delivery;
        if(price >= this.deliveryNum){
            delivery = 0.00;
        }else{
            delivery = this.deliveryPrice;
        }

        // Calculate the total
        double total = price + delivery;

        return total;

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