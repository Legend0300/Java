public class EgoSmasher {
  
    public static void main(String[] args) {

        Car car1 = new Car(1000, 4);

        Car car2 = car1.clone();

        System.out.println(car2.price);

        car2.price = 2000;

        System.out.println(car2.price);

        System.out.println(car1.price);


}
    }


 //Make a vehicle class with 2 properties

class Vehicle{
    int price;

    Vehicle(int price){
        this.price = price;
    }

    public Vehicle clone()
    {
        return new Vehicle(this.price);
    }
}


//Make a car class that inherits from vehicle and adds 1 property

class Car extends Vehicle{
    int wheels;

    Car(int price, int wheels){
        super(price);
        this.wheels = wheels;
    }

    public Car clone()
    {
        super.clone();
        return new Car(this.price, this.wheels);
    }
}