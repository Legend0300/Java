public class Sedan extends Car {
    int length;

    public Sedan(int speed, String color, int length) {
        super(speed, color);
        this.length = length;
    }

    @Override
    void increaseSpeed(int speed) {
        setSpeed(getSpeed() + speed);
    }
}
