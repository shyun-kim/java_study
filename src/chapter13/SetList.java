package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {
	
	public static void main(String [] args) {
		Set<String> foods = new HashSet<String>();
		
		//1. 데이터 저장: C(Create)
		foods.add("된장찌개");
		foods.add("김치찌개");
		foods.add("짜장면");
//		foods.add("짜장면"); //중복데이터 저장 안됨
		
		//2. 데이터 출력: R(Read)
		foods.forEach(System.out::println);
		System.out.println();
		
		//3. 데이터 수정: U(Update)
		//짜장면 > 짬뽕
		
		if (foods.contains("짜장면")) {
			foods.remove("짜장면");
		}
		foods.add("짬뽕");
		foods.forEach(System.out::println);
		System.out.println();
		
		//4. 데이터 삭제: D(Delete)
		//김치 찌개 삭제
		if(foods.contains("김치찌개")) foods.remove("김치찌개");
		foods.forEach(System.out::println);

		Iterator ie = foods.iterator();
		while(ie.hasNext()) {
			String food = (String)ie.next();
			if (food.equals("김치찌개")) {
				ie.remove();
			}
			System.out.println();		
			foods.forEach(System.out::println);

		}
		
	}

}
