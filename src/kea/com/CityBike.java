package kea.com;

public class CityBike extends Bike {
    private String color;

    public CityBike(String name, int gear, int speed) {
        super(name, gear, speed);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    double calculateServicePrice() {
        return (200 + getGear()*7);
    }

//    @Override
//    public String toString() {
//        return "City bike:"+"\n"+"Price = " +
//                calculateServicePrice() + "\n" + "With Tax = " + calculateServicePrice()*1.25;
//    }
}
