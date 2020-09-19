package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		// default 메서드도 재정의가 가능하다는 것을 보여주기 위한 테스트
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		// 다운 캐스팅도 가능
		if(seller instanceof Customer) {
			Customer cus = (Customer)seller;
			cus.sayHello();
			
		}
	}

}
