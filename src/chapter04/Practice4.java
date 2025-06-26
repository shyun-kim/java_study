package chapter04;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner input =
				new Scanner(System.in);
		
		System.out.print("이름을 입력하세요> ");
		String name = input.next();
		
		System.out.print("나이를 입력하세요> ");
		int age = input.nextInt();
		
		System.out.print("보호자와 함께 탑승합니까?(예:1 /아니오: 0)> ");
		int parent = input.nextInt();
		boolean parentresult = (parent == 1)? true:false; 
		
		System.out.print("키를 입력하세요> ");
		int height = input.nextInt();
		
		System.out.print("심장관련 질환이 있습니까?(예:1 /아니오: 0)> ");
		int dease = input.nextInt();
		boolean hearchDease = (dease == 1)? true:false; 
		
//		System.out.println(name+","+age+","+parentresult+","+height+","+hearchDease);
		
		String result = ( ((age >=6) && (height >= 120)) || ((age < 6) && (height >=120) && (parentresult == true)) ) && (hearchDease == false) ? "탑승가능":"탑승불가";
		System.out.println(name+"님은 "+result+"합니다.");

	}

}
