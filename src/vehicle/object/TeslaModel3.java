package vehicle.object;

import vehicle.energy.Electricity;
import vehicle.start.Push;

public class TeslaModel3 extends Car{
	public TeslaModel3() {
		this.brand="Tesla";
		this.style="Model 3";
		this.disAirVolume="1200";
		this.startType = new Push();
		this.chargingType = new Electricity();
	}
	@Override
	public void showKilometer() {
		System.out.print("公里數:"+this.kilometer);
	}
}
