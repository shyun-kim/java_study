package kbank2;

public class KbBankTest {

	public static void main(String[] args) {
		BankSystem kbsystem = new BankSystem("KB");
		kbsystem.showAccountList();
		
		AccountPaperVo accountPaper = AccountPaperVo.getInstance();
		
		BankMan staff = new BankMan("박보검",kbsystem);
		Customer hong = new Customer("홍길동","KB-1234","1234",100);
		
		boolean validateFlag = true;
		hong.setAccountPaper(accountPaper);
		staff.setAccountPaper(hong.getAccountPaper());
		staff.validateCheck();
		
		while(validateFlag) {
			if(staff.validateCheck(hong.answer(staff.checkResult))) {
				validateFlag = false;
			}
		}
		
		staff.processWithdrawal();
		
		kbsystem.confirmBalance(hong.getAccountPaper());
		
	}

}
