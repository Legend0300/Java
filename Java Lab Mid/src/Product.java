
public class Product {
    int counter;
    int productId;
    String name;
    double price;

    Product(int productId , String name , double price)
    {
        this.productId = counter++;
        this.name = name;
        this.price = price;

    }



public String getName() {
    return name;
}
public double getPrice() {
    return price;
}
public int getProductId() {
    return productId;
}

public void setName(String name) {
    this.name = name;
}
public void setPrice(double price) {
    this.price = price;
}
public void setProductId(int productId) {
    this.productId = productId;
}



@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}
}
