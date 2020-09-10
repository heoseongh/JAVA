package customer;

public class VIPCustomer extends Customer{

	private double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;		// 적립률 5%로 설정
		salesRatio = 0.1;		// 할인율 10%로 설정
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public double getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
