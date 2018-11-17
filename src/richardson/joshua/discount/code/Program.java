package richardson.joshua.discount.code;

import java.util.HashMap;
import java.util.Scanner;

public class Program {


    public char items[] = {'A', 'B', 'C', 'D', 'E'};
    public HashMap<Character, Integer> basket;

    public double[][] rules;


    public char[] getInput(){
        Scanner itemInput = new Scanner(System.in);
        return itemInput.next().toCharArray();
    }

    public void initialiseHashMap(UnidaysDiscountChallenge discount){
        // Store key value pairs
        discount.basket = new HashMap<Character, Integer>();

        for (int i = 0; i < discount.items.length; i++) {
            discount.basket.put(discount.items[i], 0);
        }
    }
}
