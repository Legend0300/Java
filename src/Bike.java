public interface Bike {

    int speed = 110;
    int gear = 0;

    void changeGear(int gear);
    void speedUp(int speed);
    void applyBrakes(int speed);
    void increaseSpeed(int i);
}
