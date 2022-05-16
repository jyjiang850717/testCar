package vehicle.start;

public class Push extends StartType{
	String name = "Push";

	@Override
	public void startUp() {
		System.out.println("加速");		
	}
	@Override
	public void stop() {
		System.out.println("停下");
	}
	@Override
	public void open() {
		System.out.println("開啟");
	}
	@Override
	public void close() {
		System.out.println("關閉");
	}
}
