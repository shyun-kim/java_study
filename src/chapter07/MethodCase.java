package chapter07;

public class MethodCase {
	//Field
	
	
	//Constructor
	public MethodCase() {
		System.out.println("MethodCase 객체 생성");
	}
	
	//Method
	
	//(1) 리턴타입 X, 매개변수 X: 
		public void method1() {
			System.out.println("method1 --> 리턴타입 X, 매개변수X");
		}
		
	//(2) 리턴타입 O, 매개변수 X: 
		public int method2() {
			int num1 = 10;
			int num2 = 20;
			System.out.println("method2 --> 리턴타입 O, 매개변수X");
			return num1+num2;
		}
		
	//(3) 리턴타입 X, 매개변수 O: 
		String name = "홍길동"; 
		public void method3(int num1, int num2) {
			System.out.println("method3 --> 리턴타입 X, 매개변수O");
			System.out.println(num1+num2);
		}
		public void method3(String name) { //메소드 오버로딩(Over Loading)으로 다른 타입의 매개변수를 줄수 있음
			System.out.println("method3 --> 리턴타입 X, 매개변수O");
			System.out.println(name);
		}	
		
	//(4) 리턴타입 O, 매개변수 O: 	
		public int method4(int num1, int num2) {
			System.out.println("method3 --> 리턴타입 X, 매개변수O");
			return num1+num2;
		}
			
		
	
	// main method 정의
	public static void main (String[] args) {
		MethodCase mc = new MethodCase();
		
		mc.method1();
		System.out.println(mc.method2());
		
		//반복시 변수에 메소드를 넣을수 있음
		int sum = mc.method2();
		System.out.println(sum);
		
		mc.method3(15,20);
		mc.method3("홍길동");
		
		mc.method4(23, 45);
	}
	
}
