package chapter06;

import java.util.Scanner;

public class Test {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		boolean menuSize =true;
		int MAX_SIZE =0;
		
		while (menuSize) {
			if (scan.hasNextInt()) {
				MAX_SIZE = scan.nextInt();
				menuSize=false;
			} else {
				System.out.println("다시입력해 주십시오");
			}
		}
		
		
	}
}
