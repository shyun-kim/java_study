package kbank;

public class KBank {

	public static void main(String[] args) {
		//입출금 용지 1장 비치됨
		AccountPaperVo accountPaper = AccountPaperVo.getInstance(); //new로 생성하지 않고 가져옴/ 배열로 할때는 어떻게 하라는거지
		
		BankMan staffPark = new BankMan("박보검");
		staffPark.showAccountList();
		
		Customer hong = new Customer(null, "kb-1234", "1234", 100); //출금하는 사람, 계좌, 비번, 출금 금액/ 입력 받을거면 스캐너로 받으면 됨
		
//		고객 홍길동이 출금용지에 이름, 계좌번호, 비밀번호를 작성함
		hong.setAccountPaper(accountPaper);
		System.out.println("2 ----> "+accountPaper.getName());
		
//		은행 직원 박보검이 용지를 확인함
//		staffPark.setAccountPaper(hong.getAccountPaper());
		staffPark.checkPaper(hong.getAccountPaper(), hong); //한번에 받아서 체크하기
		
//		금액이 누락되어 고객에게 금액을 물어봄
////		고객이 100만원이라 응답함
//		staffPark.askMoney(hong.getMoney());
//		
////		은행 직원이 계좌 정보를 검증함
//		staffPark.check(); //얘는 오버로딩 해서 받는 값이 없는겨
//		
////		출금 처리를 하고, 잔액 400만원으로 업데이트함
//		staffPark.changeProcess();
//		
////		고객이 잔액을 확인하고 퇴장함 [종료]
//		hong.confirmBalance();
//		
				
		
	}

}
