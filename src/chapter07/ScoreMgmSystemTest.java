package chapter07;

public class ScoreMgmSystemTest {

	public static void main(String[] args) {
		ScoreMgmSystem tjsms = new ScoreMgmSystem();
		
	
		System.out.println("학생 정보/성적 정보 입력");
		tjsms.insert();
		
		// 여러명을 입력 받으려면 배열, 반복해서 받기 위해 while/for 문
		// 이중 배열이나 , 여러 1차원 배열들의 주소값을 통일해서 받기
		tjsms.show();
		
		System.out.println("-- 메인 종료 --");
		
	}

}
