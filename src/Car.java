abstract public class Car {
    int speed;
    String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    abstract void increaseSpeed(int speed);

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + "]";
    }
}
