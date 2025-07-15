package chapter08;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection의 클래스들이 인터페이스 기반으로 설계가 됨
 * 인터페이스 기반으로 객체 생성하는 것을 권장함 
 */
public class CollectionTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> list = new Vector(); > Interface-List로 상속해서 하는것이 유지보수하기 편함
		list.add("홍길동");
		 
		System.out.println(list.get(0));

	}

}
