package lunch;

public class LunchOrderSYstemOOPTest {

	public static void main(String[] args) {
		//LunchOrderSystemOOP system = new LunchOrderSystemOOP("HAPPY");
		//system.showMainMenu();
		
		//기본 생성자에서 호출하여 사용하는 경우
//		LunchOrderSystemOOP system = new LunchOrderSystemOOP();
//		system.title = "HAPPY";
//		system.showMainMenu();
		
		//생성자를 객체 초기화 후 실행 메소드를 호출하는 경우(별도의 객체 선언이 필요없음)
		new LunchOrderSystemOOP("HAPPY");
	}

}
