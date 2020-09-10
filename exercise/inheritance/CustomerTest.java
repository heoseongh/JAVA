package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer Kim = new Customer(1000, "Kim");
		Kim.bonusPoint = 1000;
		System.out.println(Kim.showCustomerInfo());
		
		VIPCustomer Lee = new VIPCustomer(1001, "Lee");		
		Lee.bonusPoint = 10000;
		System.out.println(Lee.showCustomerInfo());
		
	}

}
