import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Customer {
 protected String customerName;
 protected int customerID;
 protected int customerBalance;
 protected int weightOfProducts=0;
 protected int shippingPrice; //depends on how far is the customer house

 List<Product> cart;

    public Customer(String customerName, int customerID, int customerBalance , int shippingPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerBalance = customerBalance;
        this.shippingPrice = shippingPrice;
        this.cart = new ArrayList<>();
        System.out.println("** Shipment notice ** ");
    }

    public void addToCart(Product product, int qty) {
        if (product.isAvailable(qty)) {
            // Create a copy with qty for the cart
            Product cartCopy =product.recordWithQuantity(qty);
            product.decreaseQuantity(qty); // reduce stock
            cart.add(cartCopy);
            weightOfProducts += product.getWeight() * qty;
            // next line is used for testing
            System.out.println(qty + " X " + product.getProductName() + "   " + (product.getWeight() * qty) + "gm");
        } else {
            System.out.println("Not enough stock for " + product.getProductName());
        }
    }

    public void checkout(){
        if(cart.isEmpty()){
            System.out.println("Cart is Empty");
            return;
        }

        System.out.println("Total package weight  "+ getWeightOfProducts() +"gm \n");
        int subTotal =0;
        System.out.println("** Checkout receipt ** ");

        for(int i=0;i<cart.size();i++){
            Product p = cart.get(i);
            if(customerBalance < p.getPrice()*p.getQuantity()){
                // Assume we would skip this item
                System.out.println("Not Enough balance");
                continue;
            }
            subTotal += (p.getPrice()*p.getQuantity());
            System.out.println(p.getQuantity()+ "X " + p.getProductName()+ "     "+ p.getPrice()*p.getQuantity()+ "");
        }
        System.out.println("--------------------");
        System.out.println("SubTotal     " + subTotal);
        System.out.println("Shipping     "+ this.getShippingPrice());
        System.out.println("Amount       "+ (subTotal+ getShippingPrice()));

    }

    public int getWeightOfProducts() {
        return weightOfProducts;
    }

    public int getShippingPrice(){
        return shippingPrice;
    }
}
