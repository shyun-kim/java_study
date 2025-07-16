package chapter12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("홍길동");
		list2.add(String.valueOf(123)); //제네릭 <>으로 스트링만 들어가게 선언해서 int 값 사용불가, valueOf 사용하여 변환
		list2.set(0, "이순신");
		list2.remove(1);
		
		
		for (String str : list2) {
			System.out.println(str);
		}
		System.out.println("======================");
		
		System.out.println(list.size()); //데이터가 채워진 공간수 만큼 출력, length는 사용불가하여 size 사용
		list.add(100);
		list.add(new String ("홍길동"));
		list.add(123.456);
		list.add(new Scanner(System.in));
		
		System.out.println(list.size()); //데이터가 채워진 공간수 만큼 출력, length는 사용불가하여 size 사용
		System.out.println(list.get(0)); //객체로 만들어져 있어 배열처럼 list[0] 사용불가, 메소드 사 용필요
		System.out.println(list.get(1)); 
		System.out.println(list.get(3)); 
		
		//위와 같은 방법들은 실제로는 쓰지 않음, 제너릭과 연동해서 사용
 
		

	}

}
