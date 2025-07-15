package kbank2;

import java.util.Scanner;

public class Customer {
	private String name;
	private String accountNumber;
	private String password;
	private int money;
	private AccountPaperVo accountPaper;
	private Scanner scan;
	
	public Customer() {}
	public Customer(String name, String accountNumber, String password, int money) {
		scan = new Scanner(System.in);
		this.name=name;
		this.accountNumber=accountNumber;
		this.password=password;
		this.money=money;
	}
	
	
	public AccountPaperVo answer(int checkResult) {
		switch(checkResult) {	
			case BankMan.ACCOUNT_NAME:
				System.out.print(this.name + "고객명> ");
				accountPaper.setName(scan.next());
				break;
			case BankMan.ACCOUNT_ACCOUNTNUMBER:
				System.out.print(this.name + "계좌번호> ");
				accountPaper.setAccountNumber(scan.next());
				break;
			case BankMan.ACCOUNT_PASSWORD:
				System.out.print(this.name + "패스워드> ");
				accountPaper.setPassword(scan.next());
				break;
			case BankMan.ACCOUNT_MONEY:
				System.out.print(this.name + "금액> ");
				accountPaper.setMoney(scan.nextInt());
				break;
		}
		return accountPaper;
	}
	
	
	public Scanner getScan() {
		return scan;
	}
	
	public AccountPaperVo getAccountPaper() {
		return accountPaper;
	}
	
	public void setAccountPaper(AccountPaperVo accountPaper) {
		this.accountPaper = accountPaper;
		this.accountPaper.setName(this.name);
		this.accountPaper.setAccountNumber(this.accountNumber);
		this.accountPaper.setPassword(this.password);
		this.accountPaper.setMoney(this.money);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
