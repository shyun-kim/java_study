package chapter07;

public class ArithmeticTest {

	public static void main(String[] args) {
		Arithmetic math=new Arithmetic();
		ArithmeticOverloading over = new ArithmeticOverloading();
		
		System.out.println("over.add = "+over.add(10, 20));
		System.out.println("over.add = "+over.add(3.14, 1.5));
		System.out.println("over.add = "+over.add("15", "100"));
		System.out.println("over.add = "+over.add(1,2,3,4,5,6));
		System.out.println("over.add = "+over.add("1","5","3"));
		
		int add = math.add(10.5, 20.4);
		int sub = math.sub(100, 30);
		double mul = math.mul(3.14, 10);
		double div = math.div(10, 20);
		int mod = math.mod(10, 20);
		
		System.out.println("add = "+add);
		System.out.println("sub = "+sub);
		System.out.println("mul = "+mul);
		System.out.println("div = "+div);
		System.out.println("mod = "+mod);

	}

}
