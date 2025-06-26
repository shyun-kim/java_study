package chapter04;

/*
 * 논리연산자: &&(AND), ||(OR), !(NOT)
 * &&, || 연산자는 앞의 식의 결과에 따라 Shortcut으로 진행됨
 */

public class OpLogicTest {

	public static void main(String[] args) {
		 int a = 10;
		 int b = 5;
		 
		 // &&(AND) : 두개의 항이 모두 true인 경우에만 실행결과가 true
		 System.out.println(a>b && a==10); //true
		 System.out.println(a>b && b==10); //false
		 System.out.println(a<b && a==10); //false, 앞 행이 이미 false 이기 때문에 뒷 행을 체크하지 않는다(short cut)
		 System.out.println(a<b && (b==10)); //false
		 System.out.print("\n");
		 
		 // ||(OR) : 두개의 항 중 하나라도 true인 경우에 실행결과가 true
		 System.out.println(a>b || a==10); //true, 앞 행이 이미 true 이기 때문에 뒷 행을 체크하지 않는다(short cut)
		 System.out.println(a>b || b==10); //true
		 System.out.println(a<b || a==10); //true
		 System.out.println(a<b || b==10); //false
		 System.out.print("\n");
			 
		 // !(NOT) : 결과의 반대를 boolean 값으로 변경
		 System.out.println(!(!(a>b) || !(a==10))); //true
		 //System.out.println(!a); error 발생 > a는 int 타입으로 NOT 연산자가 적용되지 않음 

	}

}
