package practice.customer;

public class Customer {
	protected int customerID;			// 고객 ID
	protected String customerName;		// 고객 성함
	protected String customerGrade;		// 고객 등급
	protected int bonusPoint;			// 포너스 포인트
	protected double bonusRatio;		// 적립율
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		this.customerGrade = "SILVER";		// 기본 등급인 "SILVER" 등급으로 설정
		this.bonusRatio = 0.01;				// 기본 적립율은 1%로 설정
	}

	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);	// 보너스 포인트를 누적해줌
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + 
			   customerGrade + "이며, 적립된 포인트는 " +
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

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}
