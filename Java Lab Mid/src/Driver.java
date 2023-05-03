public class Driver {
    public static void main(String[] args) throws Exception {
     Electronics laptop = new Electronics(1  , "Dell Inspiron" , 7500 , "Dell" , 12);
     Clothing shirt = new Clothing(2 , "Cotton Shirt" , 2000 , "L" , "Cotton");
     Book novel = new Book(3 , "Best Novels" , 2000 , "Hamid" , "Urdu Books");
     
     //Create an ordder

     Order order1 = new Order(laptop , 1);
     Order order2 = new Order(shirt , 2);
     Order order3 = new Order(novel , 1);



     //Create a shopping cart

     ShoppingCart shoppingCart = new ShoppingCart();    
     shoppingCart.addItem(order1);
     shoppingCart.addItem(order2);
     shoppingCart.addItem(order3);
     

     //Create an customer

     Customer customer = new Customer("Ali" , "ali@example.com");
     customer.setShoppingCart(shoppingCart);


     //Display shopping carts

     System.out.println("Customer:"  + customer.getName());
     System.out.println("Customer:"  + customer.getEmail());
     System.out.println("Shopping cart items: ");
     for(Order order : customer.getShoppingcart().getItems())
     {
        System.out.println("Product: " + order.getProduct().getName() + ", Quantity: " + order.getquantity());
     }

    }
}
