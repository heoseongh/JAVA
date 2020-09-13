package practice.customer;

public class VIPCustomer extends Customer {

	private int agnetID;		// 담당 상담원 ID
	private double salesRatio;	// 할인율
	
	// Customer 클래스에서 매개변수가 있는 생성자를 따로 호출해줘야 한다. (기본 생성자가 없으므로) 
	public VIPCustomer(int customerID, String customerName, int agnetID) {
		super(customerID, customerName);
		
		// VIP 혜택 설정
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusRatio = 0.1;
		this.agnetID = agnetID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * salesRatio);
	}

	public int getAgnetID() {
		return agnetID;
	}

	public void setAgnetID(int agnetID) {
		this.agnetID = agnetID;
	}

	public double getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}
}
