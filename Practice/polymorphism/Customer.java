package polymorphism;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/* public Customer() {
		customerGrade = "SILVER";	// 기본 등급인 SILVER로 설정
		bonusRatio = 0.01;			// 기본 적립율 1%로 설정
	}
	*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;	// 보너스를 계산해서 누적해
		return price;
	}
	
	public String showCustomerInfo() {
		return  customerName + "님의 등급은 " + 
				customerGrade + "이며, 적립된 보너스포인트는 " +
				bonusPoint + "점 입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
