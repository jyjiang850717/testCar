package vehicle.object;

import vehicle.energy.Energy;
import vehicle.start.StartType;

public abstract class Motorcycle implements Vehicle {
	//品牌
	String brand;
	//型號
	String style;
	//排氣量
	String disAirVolume;
	//發動方式
	StartType startType;
	//發動方式
	Energy chargingType;
	//輪子數量
	final int wheelNumber = 2;
	//速度
	int speed;
	//里程數
	Long kilometer;
	//能圓滿載量
	int energyMax = 50;
	//能圓剩餘量
	int energyCurrent = 0;
	@Override
	public void start() {
		this.startType.startUp();
	}
	@Override
	public void stop() {
		this.startType.stop();
	}	
}
