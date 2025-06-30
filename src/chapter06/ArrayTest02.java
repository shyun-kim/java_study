package chapter06;

public class ArrayTest02 {

	public static void main(String[] args) {
		String[] names;
		String names2[];
		
		names = new String[3];
		names2 = new String[5];
		
		int[] scores = new int[10];
		//int score2[] = new double[30];
		int scores3[] = {10,20,30};
		String names3[] = {"홍길동","홍길순"};
		System.out.println(scores3[2]);
		names[0]="홍길동";
		System.out.println(names[0]);
		System.out.println(names2);
		System.out.println(names3[0]);
		scores[0] = 100;
		scores[1] = 200;
		scores[2] = 300;
		names[1] = "이순신";
		
		
		
	}

}
