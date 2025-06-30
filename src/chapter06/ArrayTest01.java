package chapter06;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arrInt;
		int arrInt2[] = null;
		
//		System.out.println(arrInt); >>에러 이유: arrInt 지역변수는 JVM이 초기화 하지 않음, 직접 초기화 필요
		System.out.println(arrInt2);

	}

}
