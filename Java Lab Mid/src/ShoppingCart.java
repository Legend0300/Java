public class ShoppingCart {
    Order[] items = new Order[3];
    static int counter;
    

    ShoppingCart(Order[] items)
    {
        this.items = items;
    }

    ShoppingCart()
    {

    }

    public void test(Order item)
    {

    }


    public void addItem(Order item)
    {
       items[counter] = item;
    counter++;
    }


    public void setItems(Order[] items) {
        this.items = items;
    }



    public Order[] getItems() {
        return this.items;
    }

    public ShoppingCart clone(ShoppingCart shoppingCart)
    {
        return new ShoppingCart(this.items);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
