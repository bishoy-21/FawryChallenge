public class Expiryproduct extends Product{
    String expireDate;

    public Expiryproduct(String productName, int price, boolean shippable, int weight, int quantity, String expireDate) {
        super(productName, price, shippable, weight, quantity);
        this.expireDate = expireDate;
    }

    @Override
    public String getDetails() {
        return null;
    }

    @Override
    public Product recordWithQuantity(int Qunatity) {
        return new Expiryproduct(this.productName,this.price,this.shippable,this.weight,Qunatity,this.expireDate);
    }
}
