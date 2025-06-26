package chapter04;
/*
 * 대입 연산자: =, +=, -=, *=, /=
 */
public class OpAssignmentTest {

	public static void main(String[] args) {
		// 정수형 number 변수에 100을 대입
		int number = 100;
		System.out.println(number);
		
		// number라는 변수에 10값을 중첩하여 대입
		number += 10; //number = number+10;
		System.out.println(number);
		
		// number 변수에 10을 중첩으로 빼서 대입
		number -= 10; //number = number-10;
		System.out.println(number);

		// number 변수에 10을 중첩으로 곱하기하여 대입
		number *= 10; //number = number*10;
		System.out.println(number);
		
		// number 변수에 10을 중첩으로 나누기하여 대입
		number /= 10; //number = number/10;
		System.out.println(number);
		
		// number 변수에 10을 중첩으로 모듈러 연산(정수를 특정 수로 나눈 나머지를 구하는 연산)하여 대입
		number %= 3; //number = number%10;
		System.out.println(number);
	}

}
