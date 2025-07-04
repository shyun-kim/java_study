package chapter07;

public class Student {
	//Field
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	int avg;
	
	//Cons
	public Student () {
		
	}
	
	//Method
	public int getTot() {
		return	tot=kor+eng+math;
	}
				
	public int getAvg() {
		return	avg=tot/3;
	}
}
