package vehicle.start;

public class Start extends StartType{
	String name = "Start";
	@Override
	public void startUp() {
		System.out.println("加速");
	}
	@Override
	public void stop() {
		System.out.println("停止");
	}
	@Override
	public void open() {
		System.out.println("開機");
	}
	@Override
	public void close() {
		System.out.println("關機");		
	}
}
