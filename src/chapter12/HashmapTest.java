package chapter12;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		HashMap<String,String> map2 = new HashMap<String,String>();
		
		map2.put("name", "hong");
		map2.put("age", String.valueOf(10));
		
		map.put("name", "홍길동");
		map.put("age", 10);
		map.put("scan", new Scanner(System.in));
		
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("scan"));
		System.out.println("==============================");
		System.out.println(map2.get("name"));
		System.out.println(map2.get("age"));

	}

}
