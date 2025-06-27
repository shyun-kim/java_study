package chapter05;

/*
 [시작]
 *
 **
 ***
 ****
 *****
 [종료]
 
 */

public class ForOverlabStarTest {

	public static void main(String[] args) {
		
		System.out.println("[시작]");
		
		int i=0;
		int j=0;
				
		for (i=1;i<=5;i++) {
			for (j=1;j<=i;j++) {
			System.out.print("*");
			// if (j >= i) {
			//	System.out.print("*");
			//	}
			}
			System.out.println();
		}
		System.out.println("[종료]");
	}

}
