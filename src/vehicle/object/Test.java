package vehicle.object;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		TeslaModel3 myTeslaModel3= new TeslaModel3();
		myTeslaModel3.showStatus();
		myTeslaModel3.open();
		myTeslaModel3.showStatus();
		myTeslaModel3.move();
		myTeslaModel3.fillEnergy();
		myTeslaModel3.move();
		myTeslaModel3.showKilometer();
	}

}
