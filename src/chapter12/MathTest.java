package chapter12;

public class MathTest {

	public static void main(String[] args) {
		//모든 메소드가 static으로 정의되어있음 : 클래스명.메소드명()
		System.out.println(Math.abs(-100)); //절대수
		System.out.println(Math.floor(123.4567)); //소수점 절삭
		System.out.println(Math.max(200,100));
		System.out.println(Math.min(200,100));
		System.out.println(Math.random()); //0~99 랜덤출력
		System.out.println((int)Math.floor(Math.random()*100)); //정수만 2자리수 랜덤출력
		System.out.println(Math.round(123.456));
		
	}

}
