package chapter12;

public class WrapperTest {

	public static void main(String[] args) {
		int num1 = 100;
		Integer num2 = new Integer(num1); //취소선: Deprecated 이후버전에는 없어질수도 있습니다.
		Integer num3 = Integer.valueOf(num1);
		int num4 = Integer.parseInt("123");
		double dnum = Double.valueOf("123.60");
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(dnum);
		
		//기본형에 wrap을 씌우면 class 타입, 벗기면 기본타임
		//JVM이 자체적으로 wrap을 씌우는중
		
	}

}
