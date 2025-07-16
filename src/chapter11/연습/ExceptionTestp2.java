package chapter11.연습;

public class ExceptionTestp2 {
	
	public static void main (String[] args) {
		int array[] = {1,2,3,4};
		
		ExceptionTestp1 ref = new ExceptionTestp1();
		
		try {
			ref.repeat(array);
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
		
			
			
			
	}

}
