package kbank2;

public class BankSystem {
	String name;
	AccountVo[] accountList;
	
//	public BankSystem() {
//		this("시중");
//	}
	public BankSystem(String name) {
		this.name = name;
		accountList=createAccountList();
	}
		
	
	
	/**
	 * 은행직원이 관리하는 고객리스트 생성
	 */
	public AccountVo[] createAccountList() {
		String names[] = {"홍길동","이순신","김유신"};
		String numbers[] = {"KB-1234","KB-5678","KB-9876"};
		String passwords[] = {"1234","5678","9876"};
		int balance[] = {500,200,300};
		AccountVo[] list = new AccountVo[names.length];
		
		for (int i=0;i<names.length;i++) {
			AccountVo account = new AccountVo();
			account.setName(names[i]);
			account.setAccountNumber(numbers[i]);
			account.setPassword(passwords[i]);
			account.setBalance(balance[i]);
			
			list[i]=account;
		}
		
		return list;
	}
	
	/**
	 * 은행직원이 관리하는 고객리스트 출력
	 */
	public void showAccountList() {
		System.out.println("================================================");
		System.out.println("\t"+name+" 직원 고객 리스트");
		System.out.println("================================================");
		for(int i=0;i<accountList.length;i++) {
			AccountVo account = accountList[i];
			System.out.print((i+1)+".\t");
			System.out.print(account.getName()+"\t");
			System.out.print(account.getAccountNumber()+"\t");
			System.out.print(account.getPassword()+"\t");
			System.out.print(account.getBalance()+"\n");
		}
	}
	
	/**
	 * 계정 검색
	 */
	
	public int searchAccount(AccountPaperVo accountPaper) {
		int resultIDX = -1;
		
		for(int i=0;i<accountList.length;i++) {
			AccountVo account = accountList[i];
			if (account.getAccountNumber().equals(accountPaper.getAccountNumber()) && account.getPassword().equals(accountPaper.getPassword())) {
				resultIDX=i;
				break;
			}
		}
		
		return resultIDX;
	}
	
	
	/**
	 * 고객 계정 정보 출력
	 */
	
	public void confirmBalance(AccountPaperVo accountPaper) {
		int resultIdx=-1;
		for (int i=0;i<accountList.length;i++) {
			AccountVo account = accountList[i];
			if(account.getAccountNumber().equals(accountPaper.getAccountNumber()) && account.getPassword().equals(accountPaper.getPassword())) {
				resultIdx = i;
				break;
			}
			
			if(resultIdx != -1) {
				System.out.print(accountList[resultIdx].getName()+"\t");
				System.out.print(accountList[resultIdx].getAccountNumber()+"\t");
				System.out.print(accountList[resultIdx].getPassword()+"\t");
				System.out.print(accountList[resultIdx].getBalance()+"\n");
				System.out.println("이용해 주셔서 감사합니다.");
			} else {
				System.out.println("사용자 정보가 없습니다.");
			}
	
		}
	}

}
