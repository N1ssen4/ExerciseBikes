package kea.com;

public class RacingBike extends Bike {
    private boolean carbonFrame;

    public RacingBike(String name, int gear, int speed) {
        super(name, gear, speed);
    }


    @Override
    double calculateServicePrice() {
        return (250+getGear()*7);
    }

    public boolean isCarbonFrame() {
        return carbonFrame;
    }

    public void setCarbonFrame(boolean carbonFrame) {
        this.carbonFrame = carbonFrame;
    }

//    @Override
//    public String toString() {
//        return "Racing bike:"+"\n"+"Price = " +
//                calculateServicePrice() + "\n" + "With Tax = " + calculateServicePrice()*1.25;
//    }
}
