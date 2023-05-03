public class Electronics extends Product {
    String brand;
    int warrantyPeriod;

    Electronics(int productId , String name , double price , String brand , int warrantyPeriod)
    {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }




public String getBrand() {
    return brand;
}

public int getWarrantyPeriod() {
    return warrantyPeriod;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public void setWarrantyPeriod(int warrantyPeriod) {
    this.warrantyPeriod = warrantyPeriod;
}
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
