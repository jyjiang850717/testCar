package vehicle.object;

public interface Vehicle {
	//加速
	public void start();
	//停止
	public void stop();
	
	//啟動
	public void open();
	//停止
	public void close();
		
	//移動 增加行駛里程數
	public void move();
	//顯示行駛里程數
	public void showKilometer();
	//是否需補充能源
	public boolean isEnergyLow();
	//補充能源
	public void fillEnergy() throws InterruptedException;
	//顯示車子目前狀態
	public void showStatus();
}
