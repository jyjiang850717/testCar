package vehicle.object;

import vehicle.constant.VehicleConstant;
import vehicle.energy.Energy;
import vehicle.start.StartType;

public abstract class Car implements Vehicle {
	// 品牌
	String brand;
	// 型號
	String style;
	// 排氣量
	String disAirVolume;
	// 發動方式
	StartType startType;
	// 補充能源方式
	Energy chargingType;
	// 輪子數量
	final int wheelNumber = 4;
	// 速度
	int speed = 0;
	// 里程數
	long kilometer = 0;
	// 能圓滿載量
	int energyMax = 100;
	// 能圓剩餘量
	int energyCurrent = 0;
	// 車子狀態
	String status = VehicleConstant.SPEED_CLOSE;

	@Override
	public void fillEnergy() throws InterruptedException {
		this.chargingType.charge();
		for(int i =1; i<=100; i++) {
			this.energyCurrent+=1;
			Thread.sleep(1);
		}
	}

	@Override
	public void start() {
		this.startType.startUp();
		this.status=VehicleConstant.SPEED_UP;
	}

	@Override
	public void stop() {
		this.startType.stop();
		this.status=VehicleConstant.SPEED_STOP;
	}

	@Override
	public void open() {
		this.startType.open();
		this.status=VehicleConstant.SPEED_OPEN;
	}

	@Override
	public void close() {
		this.startType.close();
		this.status=VehicleConstant.SPEED_CLOSE;
	}

	@Override
	public void move() {
		if (this.isEnergyLow()) {
			System.out.println(VehicleConstant.ENERGY_WARN_MESSAGE);
			return;
		}
		if (this.energyCurrent == 0) {
			System.out.println(VehicleConstant.NO_ENERGY);
			this.stop();
			return;
		}

		this.kilometer += 1;
		this.energyCurrent -= 10;
		this.speed += 20;
	}

	@Override
	public boolean isEnergyLow() {
		if ((this.energyCurrent * 1.0/ this.energyMax ) <= 0.1) {
			return true;
		}
		return false;
	}
	
	@Override
	public void showStatus(){
		System.out.println("狀態:"+this.status);
	}
}
