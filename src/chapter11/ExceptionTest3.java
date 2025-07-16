package chapter11;

public class ExceptionTest3 {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = null;
		ExceptionObject eo = null;
		eo = new ExceptionObject();
		
//		if (name1.equals(name2)) {
//			System.out.println("동일");
//		} else {
//			System.out.println("다름");
//		}
		
		try {
			if (name1.equals(eo.name)) { //eo가 null 이기 때문에 NullPointerException
				System.out.println("동일");
			} else {
				System.out.println("다름");
			}
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException 발생");
			ne.printStackTrace();
		}
		
		
		
		
		
	}

}
