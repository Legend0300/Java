public class Clothing extends Product {
    String size;
    String material;

    Clothing(int productId , String name , double price , String size , String material)
    {
        super(productId, name, price);
        this.size = size;
        this.material = material;
    }




    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }
    @Override
    public int getProductId() {
        // TODO Auto-generated method stub
        return super.getProductId();
    }


    public String getMaterial() {
        return material;
    }
    public String getSize() {
        return size;
    }




    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }
    @Override
    public void setPrice(double price) {
        // TODO Auto-generated method stub
        super.setPrice(price);
    }

    @Override
    public void setProductId(int productId) {
        // TODO Auto-generated method stub
        super.setProductId(productId);
    }



    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}




