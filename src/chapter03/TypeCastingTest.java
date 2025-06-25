package chapter03;

public class TypeCastingTest {

	/*
	 * 형변환: 자동(묵시적) 형변환, 강제(명시적) 형변환
	 */
	public static void main(String[] args) {
		//자동(묵시적) 형변환: 작은 데이터를 큰데이터 타입에 넣는다.
		byte bdata = 1;
		short sdata = bdata;
		int idata = sdata;
		long ldata = idata;
		
		int number = 100;
		float fnumber = number;
		
		char str = 'A';
		int strNumber = str;
		
		//강제(명시적) 형변환: 큰데이터 타입을 작은 데이터 타입에 넣는다. 데이터 손상 발생
		int inumber = 400;
		byte bnumber = (byte)inumber; //앞에 괄호로 변경할 타입을 적시해 줌
		
		double dnumber = 12345.37;
		int inumber2 = (int)dnumber;
		
		
		//실행부
		System.out.println("-- 자동 형변환 --");
		System.out.println(ldata);
		System.out.println(fnumber);
		System.out.println(strNumber);
		
		System.out.println("\n-- 강제 형변환 --");
		System.out.println(bnumber);
		System.out.println(inumber2);
		
	}

}
