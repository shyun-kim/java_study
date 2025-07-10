package kbank.copy;

import java.util.Scanner;

public class Customer {
	//Field
	Scanner scan = new Scanner(System.in);
	AccountPaperVo pvo = new AccountPaperVo();
	
	String name;
	int bankAccount;
	int password;
	int amount;
	
	//Constructor
	public Customer() {}
	
	//Method
	public void requestWithdrawal() {
		requestName();
		requestBankAccount();
		requestPassword();
		requestAmount();
		System.out.println(pvo.getName());
		System.out.println(pvo.getBankAccount());
		System.out.println(pvo.getPassword());
		System.out.println(pvo.getAmount());
	}
	
	public void requestName() {
		System.out.print("이름을 입력해 주십시오.> ");
		name=scan.next();
		pvo.setName(name);
	}
	public void requestBankAccount() {
		System.out.print("계좌번호를 입력해 주십시오.> ");
		bankAccount=scan.nextInt();
		pvo.setBankAccount(bankAccount);
	}
	public void requestPassword() {
		System.out.print("비밀번호를 입력해 주십시오.> ");
		password=scan.nextInt();
		pvo.setPassword(password);
	}
	public void requestAmount() {
		System.out.print("인출하실 금액을 입력해 주십시오.> ");
		amount=scan.nextInt();
		pvo.setAmount(amount);
	}
	
	
}
