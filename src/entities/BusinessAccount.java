package entities;

public class BusinessAccount extends Account{
	
	private Double loadLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loadLimit) {
		super(number, holder, balance);
		this.loadLimit = loadLimit;
	}

	public Double getLoadLimit() {
		return loadLimit;
	}

	public void setLoadLimit(Double loadLimit) {
		this.loadLimit = loadLimit;
	}
	
	public void loan(double amount) {
		if(amount <= this.loadLimit) {
			this.balance += amount - 10.00;
		}
	}
	
	@Override
	public void withdrow(double amount) {
		super.withdrow(amount);
		this.balance -= 2.00;
	}
}
