package kbank.copy;

public class AccountVo {
	//Field
	private String name = "홍길동";
	private int bankAccount=1234567890;
	private int password=102030;
	private int amount=5000000;

	//Constructor
//	public AccountVo() {}
	
	//Method
	public String getName() {return name;}
	public int getBankAccount() {return bankAccount;}
	public int getPassword() {return password;}
	public int getAmount() {return amount;}

	public void setName(String name) {this.name = name;}
	public void setBankAccount(int bankAccount) {this.bankAccount = bankAccount;}
	public void setPassword(int password) {this.password = password;}
	public void setAmount(int amount) {this.amount = amount;}

	
}
