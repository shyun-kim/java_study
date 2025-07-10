package kbank;

/**
 * 은행 직원 클래스
 */
public class BankMan {
	//Field
	String name;
	AccountPaperVo accountPaper;
	AccountVo accountList[];
	Customer customer;
		
	//Constructor
	public BankMan() {
		this ("변우석"); //기본 생성자에 아무것도 입력되지 않았을 때 변우석으로 출력 
	}
	public BankMan(String name) { //오버로딩
		this.name=name;
		accountList = createAccountList(); //createAccountList의 return 값이 accountList 배열에 들어감
	}
	/**
	 * 은행 직원이 관리하는 고객 리스트 출력
	 */
	public void showAccountList() {
		System.out.println("========================================");
		System.out.println("\tKB 고객 리스트");
		System.out.println("========================================");
		for(int i=0;i<accountList.length;i++) {
			AccountVo account = accountList[i];
			System.out.print((i+1)+".\t");
			System.out.print(account.getName()+"\t");
			System.out.print(account.getAccountNumber()+"\t");
			System.out.print(account.getPassword()+"\t");
			System.out.print(account.getBalance()+"\n");

		}
		System.out.println("========================================");
	}
	
	/**
	 * 은행직원이 관리하는 고객 리스트 생성
	 */
	//Method
	public AccountVo[] createAccountList() {
		String names[] = {"홍길동", "이순신", "김유신"};
		String number[] = {"kb-1234","kb-9876","kb-3456"};
		String password[ ]= {"1234","9876","3456"};
		int balance[] = {500, 1000, 700};
		AccountVo[] list=new AccountVo[names.length];
		
		for(int i=0;i<names.length;i++) {
			AccountVo account = new AccountVo();
			account.setName(names[i]);
			account.setAccountNumber(number[i]);
			account.setPassword(password[i]);
			account.setBalance(balance[i]);
			
			list[i]=account;
		}
		return list;
		
	}
	
	/**
	 * 입출금 용지 체크
	 */
	public void checkPaper(AccountPaperVo paper, Customer customer) {
		this.customer=customer;
		
		System.out.println("은행직원: ["+ name +"] 출금 용지 정보를 확인하는 중입니다.");
		if(paper.getName()==null) {
			System.out.println("[은행직원:"+ name +"] 이름을 입력해 주세요.");
			System.out.print("[고객:"+ customer.getName()+"] 이름 입력> ");
			String name = customer.getScan().next();
			paper.setName(name);
			System.out.println("고객명 ===> "+paper.getName());
		} else if(paper.getAccountNumber()==null) {
			System.out.println("[은행직원:"+ name +"] 계좌번호를 입력해 주세요.");
		} else if(paper.getPassword()==null) {
			System.out.println("[은행직원:"+ name +"] 패스워드를 입력해 주세요.");
		} else if(paper.getMoney()==0) {
			System.out.println("[은행직원:"+ name +"] 금액을 입력해 주세요.");
		} else {
			System.out.println("[은행직원:"+ name +"] 정보 확인이 완료되었습니다.");
		}
	}
	
	
}
