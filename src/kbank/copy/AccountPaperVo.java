package kbank.copy;

public class AccountPaperVo {
	//Field
	private String name;
	private int bankAccount;
	private int password;
	private int amount;
	
	//Constructor
	
	//Method
	public void setName(String name) {this.name = name;}
	public void setBankAccount(int bankAccount) {this.bankAccount = bankAccount;}
	public void setPassword(int password) {this.password = password;}
	public void setAmount(int amount) {this.amount = amount;}
	
	public String getName() {return name;}
	public int getBankAccount() {return bankAccount;}
	public int getPassword() {return password;}
	public int getAmount() {return amount;}

	
}
