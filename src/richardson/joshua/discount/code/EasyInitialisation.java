package richardson.joshua.discount.code;

import java.util.HashMap;
import java.util.Scanner;

/**
 * The EasyInitialisation class is used to make it possible to run the code normally and
 * run tests on the code without the need to duplicate code
 *
 * @author Joshua Richardson*/
public class EasyInitialisation {


    public char items[] = {'A', 'B', 'C', 'D', 'E'};
    public HashMap<Character, Integer> basket;

    public double[][] rules;

    /**
     * This method is used to get the input to the program
     * @return an array of characters that the user enters as a string
     */
    public char[] getInput(){
        Scanner itemInput = new Scanner(System.in);
        char[] charArray = itemInput.next().toCharArray();
        itemInput.close();
        return charArray;
    }

    /**
     * This method is used to remove the repetition of code in the main program and in the testing scripts.
     * This will make the program easier to maintain
     * @param discount takes the reference to the UnidaysDiscountChallenge class so that it can initialise the HashMap
     */
    public void initialiseHashMap(UnidaysDiscountChallenge discount){
        // Store key value pairs
        discount.basket = new HashMap<Character, Integer>();

        for (int i = 0; i < discount.items.length; i++) {
            discount.basket.put(discount.items[i], 0);
        }
    }
}
