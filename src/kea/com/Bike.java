package kea.com;

abstract class Bike {
    private int gear;
    private int speed;
    private String name;

    public void applyBrake(int decrement){

    }
    public void speedUp(int increment){

    }
    abstract double calculateServicePrice();

    public int getGear() {
        return gear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return name+"\n"+"Price = " +
                calculateServicePrice() + "\n" + "With Tax = " + calculateServicePrice()*1.25;
    }

    public Bike(String name, int gear, int speed) {
        this.name = name;
        this.gear = gear;
        this.speed = speed;
    }
}
