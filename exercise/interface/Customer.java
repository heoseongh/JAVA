package interfaceex;

public class Customer implements Buy, Sell {

	@Override	// Sell 인터페이스의 sell 메서드 구현
	public void sell() {
		System.out.println("customer sell");
	}

	@Override	// Buy 인터페이스의 buy 메서드 구현
	public void buy() {
		System.out.println("customer buy");
	}

	@Override	// order 메서드 재정의
	public void order() {
		System.out.println("customer order");
	}
	
	public void sayHello() {
		System.out.println("hello");
	}

}
