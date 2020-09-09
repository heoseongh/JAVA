package polymorphism;

public class VIPCustomer extends Customer{

	private double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;		// 적립률 5%로 설정
		salesRatio = 0.1;		// 할인율 10%로 설정
	}
	
	
	@Override
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
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
