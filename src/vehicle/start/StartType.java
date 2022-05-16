package vehicle.start;

public abstract class StartType {
	String name;
	abstract public void startUp();
	abstract public void stop();
	abstract public void open();
	abstract public void close();
}
