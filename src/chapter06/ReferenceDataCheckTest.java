package chapter06;

import java.util.Scanner;

public class ReferenceDataCheckTest {
	public static void main (String[] args) {
		// 기본형
		int a = 10;
		int b = 10;
		
		String str1 = "홍길동";
		String str2 = "홍길동";
	
		
		System.out.println("a == b: "+(a==b)); //call by value 형태로 값을 비교
		System.out.println("str1 == str2: "+(str1==str2)); //call by value 형태로 값을 비교
		
		//참조형
		
		String strObj1 = new String("홍길동");
		String strObj2 = new String("홍길동");
		
		System.out.println(System.identityHashCode(strObj1));
		System.out.println(System.identityHashCode(strObj2));
//		System.out.println(strObj2.hashCode());
		System.out.println("strObj1 == strObj2: "+(strObj1==strObj2)); //stack 주소 비교
		System.out.println("strObj1.equals(strObj2): "+(strObj1.equals(strObj2))); //주소값에서 불러온 값 비교
		
		
		strObj1=str1; //스트링만 heap 영역에 주소 만들고 홍길동 값을 넣어준 것
		System.out.println(System.identityHashCode(strObj1));
		System.out.println(strObj1);
		
		//Scanner 객체를 이용하여 문자열 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력> ");
		String sdata = scan.next();
		
		System.out.println(sdata);
		System.out.println("sdata == str1: "+(sdata==str1));
		System.out.println("sdata.equals(str1): "+(sdata.equals(str1)));
		
		
		//만약 String이 길어져 8bite 보다 커진 경우, Method Area의 Constant Pool에 객체처럼 생성함
		String str3 = "홍길동은 자바천재이다.";
		String str4 = "홍길동은 자바천재이다.";
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		//동일한 텍스트라면 같은 주소에 저장한다
		String str5 = "홍길순도 자바천재이다.";
		System.out.println(System.identityHashCode(str5));
		//다른 텍스트일때 다른 주소에 저장한다
		
	}
}
