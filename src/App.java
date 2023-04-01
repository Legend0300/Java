
public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("John", "123 Main St", 18);

        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("Jane", "456 Main St", 17, "Junior");

        HighhighSchoolStudent highhighSchoolStudent = new HighhighSchoolStudent("Jill", "789 Main St", 16, "Sophomore", "Senior");

        Object s2 = new Student("John", "123 Main St", 18);

        System.out.println(s2);

        System.out.println(student);

        
        System.out.println(highSchoolStudent);


        highhighSchoolStudent.reduceAge();
        System.out.println(highhighSchoolStudent);


        Sedan sedan = new Sedan(100, "Red", 10);
        sedan.increaseSpeed(100);
        System.out.println(sedan);

        Car car = new Sedan(100, "Red", 10);

        car.increaseSpeed(1000);

        Car car2 = new SUV(100, "Blue", 10);
        car2.increaseSpeed(1000);

        System.out.println(car);
        System.out.println(car2);



        PremiumBike premiumBike = new PremiumBike();
        premiumBike.applyBrakes(100);
        premiumBike.changeGear(5);
        premiumBike.speedUp(100);
        System.out.println(premiumBike);

        Bike bike = new PremiumBike();
        bike.changeGear(1000);
        bike.applyBrakes(100);
        System.out.println(bike);



        Account account = new Account(1000 , "John" , 1000);

        System.out.println(account);

        ATM atm = new ATM(account);

        atm.deposit(1000);
        atm.withdraw(1000);


        Food[] foods = new Food[10];

        for(int i = 0; i < foods.length; i++) {
            foods[i] = new Food("Food" + i);
        }

        System.out.println(Food.counter);

        for(Food food : foods) {
            System.out.println(food);
        }
        Food.counter = 0;

        System.out.println(Food.counter);
    }
}
