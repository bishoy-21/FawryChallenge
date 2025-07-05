public class Main {
    public static void main(String[] args) {

        Product Milk = new Expiryproduct("Milk", 5, true,1000,5,"5-7-2025");
        Product Cheese = new Expiryproduct("Cheese", 20, true,250,5,"13-7-2025");
        Product Biscuits = new Expiryproduct("Biscuits", 5, true,1000,5,"5-7-2025");
        Product book = new Nonexpiryproduct("Books", 15,true,50, 5);



        Customer customer = new Customer("Andrew",55,5000,30);

        //FOR TESTING if Cart is empty will print checkout or not
//        customer.checkout();

        customer.addToCart(Milk, 2);
        customer.addToCart(Cheese, 1);
        customer.addToCart(Biscuits, 3);
//        customer.addToCart(book, 15); // FOR TESTING it will not be added as it exceeded the stored quantity

        customer.checkout();


    }
}