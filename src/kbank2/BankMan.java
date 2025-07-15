package kbank2;

public class BankMan {
	String name;
	int checkResult;
	private AccountPaperVo accountPaper;
	private AccountVo[] accountList;
	private BankSystem kbsystem;
	
	public static final int ACCOUNT_NAME = 1;
	public static final int ACCOUNT_ACCOUNTNUMBER = 2;
	public static final int ACCOUNT_PASSWORD = 3;
	public static final int ACCOUNT_MONEY = 4;
	
	
	public BankMan() {}
	public BankMan(String name, BankSystem kbsystem) {
		this.name=name;
		this.kbsystem=kbsystem;
		System.out.println("은행직원: "+this.name+" 업무 시작");
	}
	
	
	/**
	 * 고객의 출금정보 유효성 체크: 고객에게 전달 받은 출금 용지 체크
	 */
	public void validateCheck() {
		System.out.println("은행직원: "+this.name+" 고객정보 유효성 체크");
		
		if(accountPaper.getName() == null) {
			ask(ACCOUNT_NAME);
		} else if (accountPaper.getAccountNumber() == null) {
			ask(ACCOUNT_ACCOUNTNUMBER);
		} else if (accountPaper.getPassword() == null) {
			ask(ACCOUNT_PASSWORD);
		} else if (accountPaper.getMoney() == 0) {
			ask(ACCOUNT_MONEY);
		} else {
			System.out.println("은행직원: "+this.name+" 입력이 모두 완료되었습니다.");
		}
	}
	
	/**
	 * 고객에게 전달 받은 출금용지 빈값체크
	 */
	public boolean validateCheck(AccountPaperVo updateAccountPaper) {
		boolean result = false;
		System.out.println("유효성 체크 재진행");
		if(accountPaper.getName() == null) {
			ask(ACCOUNT_NAME);
		} else if (accountPaper.getAccountNumber() == null) {
			ask(ACCOUNT_ACCOUNTNUMBER);
		} else if (accountPaper.getPassword() == null) {
			ask(ACCOUNT_PASSWORD);
		} else if (accountPaper.getMoney() == 0) {
			ask(ACCOUNT_MONEY);
		} else {
			System.out.println("은행직원: "+this.name+"입력이 모두 완료되었습니다.");
			result=true;
		}
		return result;
	}
		
	public void ask(int num) {
		switch(num) {
		case ACCOUNT_NAME:
			System.out.println("이름을 입력해주세요");
			checkResult = ACCOUNT_NAME;
			break;
		case ACCOUNT_ACCOUNTNUMBER:
			System.out.println("계좌번호를 입력해주세요");
			checkResult = ACCOUNT_ACCOUNTNUMBER;
			break;
		case ACCOUNT_PASSWORD:
			System.out.println("비밀번호를 입력해주세요");
			checkResult = ACCOUNT_PASSWORD;
			break;
		case ACCOUNT_MONEY:
			System.out.println("금액을 입력해주세요");
			checkResult = ACCOUNT_MONEY;
			break;
		}
	}
	
	
	public void processWithdrawal() {
		System.out.println("출금요청 진행중");
		int accountIdx = kbsystem.searchAccount(accountPaper);
		if(accountIdx != -1) {
			AccountVo account = kbsystem.accountList[accountIdx];
			if(account.getBalance()>=accountPaper.getMoney()) {
				int money = account.getBalance()-accountPaper.getMoney();
				account.setBalance(money);
				kbsystem.accountList[accountIdx]=account;
				
				processCompleted(accountIdx);
			} else {
				System.out.println("은행직원: "+this.name+" 잔액이 부족합니다.");
			}
		} else {
			System.out.println("계좌 정보가 일치하지 않습니다.");
		}
	}
	
	public void processCompleted(int num) {
		AccountVo account = kbsystem.accountList[num];
		System.out.println("은행직원: "+this.name+" 출금 처리가 완료되어습니다.");
		System.out.println("잔액: "+account.getBalance());
	}
	
	
	public AccountPaperVo getAccountPaper() {
		return accountPaper;
	}
	public void setAccountPaper(AccountPaperVo accountPaper) {
		this.accountPaper = accountPaper;
	}
	public AccountVo[] getAccountList() {
		return accountList;
	}
	public void setAccountList(AccountVo[] accountList) {
		this.accountList = accountList;
	}
	public BankSystem getKbsystem() {
		return kbsystem;
	}
	public void setKbsystem(BankSystem kbsystem) {
		this.kbsystem = kbsystem;
	}

}
