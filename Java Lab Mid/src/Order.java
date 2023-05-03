

public class Order {
    static int counter;
    Product product;
    int quanity;

    Order(Product product , int quanity)
    {
        this.product = product;
        this.quanity = quanity;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuanity(int quanity) {
        this.quanity = counter++;
    }

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "" + getProduct();
}

    public int getquantity() {
        return this.quanity;
    }
    
}
