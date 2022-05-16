package vehicle.energy;

public class Oil extends Energy{
	String name= "Oil";
	@Override
	public void charge() {
		System.out.print("加油");
	}
}
