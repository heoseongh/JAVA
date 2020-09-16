package practice.car;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
	
		// 자동차들을 관리할 리스트 생성
		ArrayList<Car> carList = new ArrayList<Car>();
		// 자동차 생성 후 배열에 담음
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
			System.out.println("====================");
		}
		
	}

}
