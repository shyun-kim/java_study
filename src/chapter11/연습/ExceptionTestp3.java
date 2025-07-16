package chapter11.연습;

public class ExceptionTestp3 implements ExceptionTest{
	@Override
	public void repeat(int array[]) throws Exception {
		for(int i=0;i<5;i++) {
			if(array[i] != 0) {
				System.out.println(array[i]);
			}
		}
	}


}

	

