package chapter05;

public class StarTest {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int star = 0;

		
		for (i=1;i<=5;i+=1) {
			for (j=5-i;j>0;j-=1) {
				System.out.print(" ");
			}
			for (star=1;star<=i*2-1;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

