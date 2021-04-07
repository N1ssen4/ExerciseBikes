package kea.com;

public class MountainBike extends Bike {
    private int seatHeight;

    public MountainBike(String name, int gear, int speed) {
        super(name, gear, speed);
    }


    public void seatHeight(int newValue){

    }

    @Override
    double calculateServicePrice() {
        return (275+(getGear()*7));
    }


    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

//    @Override
//    public String toString() {
//        return "Mountain bike:"+"\n"+"Price = " +
//                calculateServicePrice() + "\n" + "With Tax = " + calculateServicePrice()*1.25;
//    }
}

