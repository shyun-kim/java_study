package kbank.copy;

public class BankMan {
	//Field
	AccountVo avo = new AccountVo();
	Customer cus = new Customer();
	boolean nameCheck = false;
	boolean accountCheck = false;
	boolean pwCheck = false;
	boolean amountCheck = false;
	int total=0;
	
	//Constructor
	public BankMan() {
		cus.requestWithdrawal();
		checkInfo();
	}
	
	//Method
	public void checkInfo() {
		System.out.println("고객입력");
		System.out.println(cus.name);
		System.out.println(cus.bankAccount);
		System.out.println(cus.password);
		System.out.println(cus.amount);
		
		
	}	
	
	
}
