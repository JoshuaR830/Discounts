package richardson.joshua.discount.code;

public interface CalculateDiscounts {

    /**
     * Adds the items to the basket if they are eligible
     * e.g. if user enters H it will ignore it as it is not a known item and will display a message
     * The basket has been set up so that it is incremented for each of the values entered so there is no need to
     * count the values at a later stage
     * @param val is the letter of the item entered
     */
    void addToBasket( char val);

    /** Works out the total item price, delivery and total overall price
     *
     * @return double of the total price of the items + delivery cost
     */
    double calculateTotalPrice();
}
