public class PremiumBike implements Bike{



    @Override
    public void speedUp(int upspeed) {
        System.out.println("Speeding up by " + (upspeed + speed) +  " kmph");
        
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Changing gear to " + gear);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void applyBrakes(int downspeed) {
        System.out.println("decreasing speed to " + (speed - downspeed) +  " kmph");
        // TODO Auto-generated method stub
        
    }

    public void increaseSpeed(int i) {
    }


    public String toString() {
        return "PremiumBike [speed=" + speed + ", gear=" + gear + "]";
    }


    
}
