public abstract class Product {
    protected String productName;
    protected int price;
    protected boolean shippable;
    protected int weight;
    protected int quantity;


    public Product(String productName, int price, boolean shippable, int weight, int quantity) {
        this.productName = productName;
        this.price = price;
        this.shippable = shippable;
        this.weight = weight;
        this.quantity = quantity;
    }

    public abstract String getDetails();

    // helps in assigning the product to cart with quantity using Polymorphism
    // to prevent making customer is tightly coupled with type of product
    public abstract Product recordWithQuantity(int Qunatity);

    public boolean isAvailable(int requestedQunatity) {
        return quantity >= requestedQunatity;
    }

    public void decreaseQuantity(int decreasedQuantity){
        if (decreasedQuantity <= quantity) {
            quantity -= decreasedQuantity;
        }
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getWeight() {
        return weight;
    }

    public void setPrice(int price) {
        // can be used to edit price in case of discount
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
