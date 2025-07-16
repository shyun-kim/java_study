package chapter12;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		//static이라 아래와 같이 클래스.메소드로 사용
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
	}

}
