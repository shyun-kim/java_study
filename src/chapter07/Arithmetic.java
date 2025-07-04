package chapter07;

/*
 *두개의 숫자를 입력받아 결과를 리턴하는 메소드를 포함 
 *sub 메소드 기능은 첫번째 숫자가 큰경우에만 빼기, 작거나 같으면 0을리턴
 */

public class Arithmetic {
	//Field
	
	//Constructor
	
	//Method
	public int add(double x, double y) {return (int)(x+y);}
	public int sub(int x, int y) {
//		if (x>y) {
//			return x-y;			
//		} else {
//			return 0;
//		}
		int result = 0;
		if (x>y) {
			result = x-y;
		}
		return result;
		}
	public double mul(double x, double y) {return x*y;}
	public double div(double x, double y) {return x/y;}
	public int mod(int x, int y) {return x%y;}
	
	
}
