package vehicle.start;

public class Key extends StartType{
	String name = "Key";
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
		System.out.println("發動");
	}
	@Override
	public void close() {
		System.out.println("熄火");
	}
}
