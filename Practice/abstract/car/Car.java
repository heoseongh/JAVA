package practice.car;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	final public void run() {
		start();		// 시동 걸기
		drive();		// 출발
		stop();			// 제동
		turnoff();		// 시동 끄기
	}
}
