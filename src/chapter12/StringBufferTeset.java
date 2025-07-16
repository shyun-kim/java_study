package chapter12;

public class StringBufferTeset {

	public static void main(String[] args) {
		String str = "홍길동";
		str=str+"은 자바를";
		str=str+" 열심히 공부한다.";
		
		System.out.println(str); //매번마다 새로운 메모리에 배정되고 마지막 메모리 자리를 가져온다
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //기본 크기 16
		sb.append("홍길동");
		sb.append("은 자바를");
		sb.append(" 열심히 공부한다.");
		
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.toString()+" toString 출력"); 

	}

}
