package richardson.joshua.discount.code;

public class UnidaysDiscountChallenge {

    static final double DELIVERY_THRESHOLD = 50.00;
    static final double DELIVERY_COST = 7.00;
    private double delivery = 0;
    private double price = 0;
    private double total = 0;

    public static void main(String[] args){
        UnidaysDiscountChallenge discount = new UnidaysDiscountChallenge();

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

    }

    // Works out the total item price, delivery and total overall price
    public void calculateTotalPrice(String items){
//        this.delivery = 0;
//        this.price = 0;
        this.total = 0;



        this.total += calculateA();
        this.total += calculateB();
        this.total += calculateC();
        this.total += calculateD();
        this.total += calculateE();

        if(this.total >= DELIVERY_THRESHOLD){
            this.delivery = 0.00;
        }else{
            this.delivery = DELIVERY_COST;
        }


        setTotal(total);
        setDelivery(delivery);
        setPrice(price);
    }



    // Applies rules for A
    private double calculateA(int num){

        return 0;
    }

    // Applies rules for B
    private double calculateB(int num){

        return 0;
    }

    // Applies rules for C
    private double calculateC(int num){

        return 0;
    }

    // Applies rules for D
    private double calculateD(int num){

        return 0;
    }

    // Applies rules for E
    private double calculateE(int num){

        return 0;
    }





}
