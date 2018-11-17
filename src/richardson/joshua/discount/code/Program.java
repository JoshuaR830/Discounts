package richardson.joshua.discount.code;

import java.util.HashMap;
import java.util.Scanner;

public class Program {


    public char items[] = {'A', 'B', 'C', 'D', 'E'};
    public HashMap<Character, Integer> basket;

    public double[][] rules;


    public char[] getInput(){
        Scanner itemInput = new Scanner(System.in);
        char[] charArray = itemInput.next().toCharArray();
        itemInput.close();
        return charArray;
    }

    public void initialiseHashMap(UnidaysDiscountChallenge discount){
        // Store key value pairs
        discount.basket = new HashMap<Character, Integer>();

        for (int i = 0; i < discount.items.length; i++) {
            discount.basket.put(discount.items[i], 0);
        }
    }
}
