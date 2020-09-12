package practice.customer;

public class VIPCustomer extends Customer {

	private String agnetID;		// 담당 상담원 ID
	private int salesRatio;		// 할인율
	
	// Customer 클래스에서 매개변수가 있는 생성자를 따로 호출해줘야 한다. (기본 생성자가 없으므로) 
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		// VIP 혜택 설정
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusRatio = 0.1;
		this.agnetID = agnetID;
	}
	
	@Override
	public int calcPrice(int price) {
		
	}
	
	public String getAgnetID() {
		return agnetID;
	}

	public void setAgnetID(String agnetID) {
		this.agnetID = agnetID;
	}

	public int getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(int salesRatio) {
		this.salesRatio = salesRatio;
	}
}
