package kbank;

import java.util.Scanner;

/**
 * 은행의 고객 정보를 받는 클래스이며, 은행직원을 통해 생성된다.
 */
public class AccountVo {
	//Field
	private String name;
	private String accountNumber;
	private String password;
	private int balance;
	

	//Constructor
	public AccountVo() {}
	public AccountVo(String name, String accountNumber, String password, int balance) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.password=password;
		this.balance=balance;
	}
	

	
	//Method
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getAccountNumber() {return accountNumber;}
	public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	

}
