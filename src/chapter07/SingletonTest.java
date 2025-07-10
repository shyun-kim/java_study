package chapter07;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton singleton = new Singleton(); >> 생성자가 private로 접근 제어 되어 객체 생성 불가.
		
		Singleton singleton = Singleton.getInstance();
		singleton.setName("싱글톤");
		System.out.println("name : "+singleton.getName());		

	}

}
