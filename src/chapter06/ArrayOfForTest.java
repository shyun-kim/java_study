package chapter06;

/*
 * 향상된 for 문: 배열, Collection 객체(List)에 사용됨
 */
public class ArrayOfForTest {

	public static void main(String[] args) {
	
		int[] nlist = {1,2,3,4,5};
		String[]textlist = {"이순신","홍길동","권율"};
		
		//일반적인 for문을 이용하여 출력
		System.out.println("Normal for statement");
		for(int i = 0; i<nlist.length; i++) {
			System.out.print(nlist[i]+"\t");
		}
		System.out.println();
		System.out.println("=================");
		
		//향상된 for문
		System.out.println("Enhanced for statement");
		for(int number: nlist) {
			System.out.print(number+"\t");
		}
		
		System.out.println();
		System.out.println("=================");
		
		for (String text: textlist) {
			System.out.print(text+"\t");
		}

	}

}
