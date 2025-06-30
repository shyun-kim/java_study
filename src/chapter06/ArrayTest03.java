package chapter06;

public class ArrayTest03 {

	public static void main(String[] args) {
		// 1에서 5까지의 데이터를 저장 후 순서대로 출력
//		int num[] = {1,2,3,4,5};
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
		
		
		int num[]=new int[100]; //배열의 전체 크기: 변수.length
		int i;
		int j = 1;
		int k = 0;
		System.out.println(num.length);
		
		for (i=0; i<100; i++) {
			num[i] = j;
			j++;
		}
		
//		for (int k=0;k<100;k++) {
//			System.out.println(num[k]);
//		}
		
		while (k<100) {
			System.out.println(num[k]);
			k++;
		}
		
		
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);

	}

}
