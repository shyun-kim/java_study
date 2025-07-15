package zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooTest {

	public static void main(String[] args) {
//		Lion lion = new Lion();
//		lion.sleep();
//		lion.eat();
//		
//		AnimalInterface lion2 = new Lion("무파사",10);
//		lion2.sleep();
//		lion2.eat();
		
		List<Lion> list = new ArrayList<Lion>(); //라이온 타입만 array에 들어갈 수 있음
		List<AnimalInterface> list2 = new ArrayList<AnimalInterface>(); //AnimalInterface를 상속받은 
		
		Lion lion1 = new Lion();
		Tiger tiger1 = new Tiger();
		
		list.add(lion1);
//		list.add(tiger1); list는 Lion클래스 객체만 저장 가능
		
		list2.add(lion1); //AnimalInterface를 갖고 있기 때문에 자동(묵시적) 형변환이 일어나 list2에 저장
		list2.add(tiger1); //AnimalInterface를 갖고 있기 때문에 자동(묵시적) 형변환이 일어나 list2에 저장

		list.get(0).sleep();
		
		list2.get(0).sleep();
		list2.get(1).sleep();
		
		Lion lion2 = (Lion)list2.get(0);
		System.out.println("lion2.name > "+lion2.name);
		
		//아래와 같은 방법으로 Interface에 Method를 추가하면 위와 같이 강제 형변환을 하지 않아도 됨
		System.out.println(list2.get(0).getName());
		System.out.println(list2.get(0).getAge());
		System.out.println(list2.get(1).getName());
		System.out.println(list2.get(1).getAge());
		
	}

}
