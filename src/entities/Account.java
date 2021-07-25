package entities;

public class Account {
	
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account() {
		this.number = 0;
		this.holder = "";
		this.balance = 0.0;
	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdrow(double amount) {
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.holder + ", ");
		sb.append(this.number + ", ");
		sb.append(String.format("%.2f", this.balance));
		return sb.toString();
	}
}
