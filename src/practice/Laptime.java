package practice;

import java.util.Scanner;

public class Laptime {
	//Field
	String driver[];
	String lap[][]; //=new String [3][];
	int driverNum;
	

	
	//Constructor
	public Laptime (){
		
	}
	
	//Method
	public void driver() {
		System.out.print("입력하실 드라이버는 몇명입니까?> ");
		Scanner input = new Scanner(System.in);
		driverNum=input.nextInt();
		driver =new String [driverNum];
		System.out.println(driverNum+"명이 입력되었습니다.");
	}
	public void driverName() {
		
		for (int i=0;i<driverNum;i++) {
			System.out.print("드라이버의 이름을 입력해 주십시오.> ");
			Scanner input = new Scanner(System.in);
			driver[i] = input.next();
		}
	}
	public void timeRecord() {
		
	}
}
