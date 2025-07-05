public class Nonexpiryproduct extends Product{

    public Nonexpiryproduct(String productName, int price, boolean shippable, int weight, int quantity) {
        super(productName, price, shippable, weight, quantity);
    }

    @Override
    public String getDetails() {
        return null;
    }

    @Override
    public Product recordWithQuantity(int Qunatity) {
        return new Nonexpiryproduct(this.productName,this.price,this.shippable,this.weight,Qunatity);
    }
}
