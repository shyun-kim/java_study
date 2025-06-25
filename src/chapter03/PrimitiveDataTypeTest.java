package chapter03;

public class PrimitiveDataTypeTest {
	public static void main (String[] args) {
		//선언부
		//논리형 데이터 타입
		boolean run = true;
		
		//정수형 데이터 타입
		byte b =1;
		short s =10;
		int i = 100;
		long l = 1000;
		long l2 = 1000L;
		
		//실수형 데이터 타입
		float f = 10.0f;
		double d = 100.0;
		
		//문자 리터럴 데이터 타입
		char c = 'a';
		char c2 = 'A';
		int c_asc = c;
		int c_asc2 = c2;
		char str ='홍';
//		char str2 = "홍"; char 데이터 타입은 반드시 '' 사용
		
		//상수 정의 : 프로그램 시작부터 종료까지 같은 값을 가지며, 상수명은 전체 대문자로 선언한다.
		//final 키워드를 앞에 정의해야 함
		//프로그램 시작: START(1), 종료 : END(0)
		final int START = 1;
		//int START = 2;
		final int END = 0;
		
		
		
		//출력부
		System.out.println("boolean : "+run);
		System.out.println("byte : "+b);
		System.out.println("short : "+s);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("long : "+l2);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		System.out.println("char : "+c);
		System.out.println("char : "+c2);
		System.out.println("char ascii : "+c_asc);
		System.out.println("char ascii2 : "+c_asc2);
		System.out.println("START : "+START);
		System.out.println("END : "+END);
		System.out.println(str);
		
	}

}
