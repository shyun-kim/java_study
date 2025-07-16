package chapter12;

public class StringTest {
	public static void main(String [] args) {
		String name1= "홍길동";
		String name2= new String ("홍길동");
		String num = String.valueOf(123);
		name2 = "welcomeToJava";
		String name3 = "welcome-To-Java";
		String[] sname2=name3.split("-");
		
		String phone = "010-1234-5678";
		String subject = "java,css,html,mysql";
		String phones[] = phone.split("-");
		String subjects[] = subject.split(",");
		
		String jphone=String.join(",",phones); //StringTokenizer의 역할
		
		System.out.println(subject.contains("html"));
		System.out.println(subject.contains("hmtl"));
		System.out.println(jphone);
		System.out.println(phones[0]);
		System.out.println(subjects[0]);
		System.out.println(sname2[0]);
		System.out.println(sname2[1]);
		System.out.println(sname2[2]+"\n");
		System.out.println(name2.substring(7,10)); //7번부터 시작해서 10번 전에 끝>7,8,9 ToJ 출력
		System.out.println(name2.substring(7));
		System.out.println(name2.toUpperCase());
		System.out.println(name2.toLowerCase());
		System.out.println(num+10);
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		
		
		if (name1 == name2){System.out.println("동일");}
		else System.out.println("다름");

		if (name1.equals(name2)){System.out.println("동일");}
		else System.out.println("다름");
		
		
		
	}

}
