package chapter11.연습;

public class ExceptionTestMain {

	public static void main(String[] args) {
		int array[] = {1,2,3,4};
		
		ExceptionTestp3 ref = new ExceptionTestp3();
		
		try {
			ref.repeat(array);
		} catch (Exception e) {
			System.out.println("행이 초과하였습니다.");
		}

	}

}
