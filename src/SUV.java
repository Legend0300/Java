public class SUV extends Car {
    int height;

    public SUV(int speed, String color, int height) {
        super(speed, color);
        this.height = height;
    }
    @Override
    void increaseSpeed(int speed) {
        setSpeed(super.getSpeed() + speed - 50);
    }
    
}
