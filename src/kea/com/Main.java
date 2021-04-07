package kea.com;

public class Main {

    public static void main(String[] args) {
	MountainBike mBike = new MountainBike("Mountain bike:",22,50);
	System.out.println(mBike);
	RacingBike rBike = new RacingBike("Racing bike:",18,80);
	System.out.println();
	System.out.println(rBike);
	CityBike cBike = new CityBike("City Bike:",2,40);
	System.out.println();
	System.out.println(cBike);

    }
}
