package chapter07;

public class AnimalAccessModifier {
//class AnimalAccessModifier { >> chapter07에서만 사용 가능

	//Field
	String name;
	int age;
	
	private String pname;	//같은 클래스 내부에서만 접근 가능
	private int page;		//같은 클래스 내부에서만 접근 가능
	
	static String sname;
	static int sage;
	
	final String fname = "홍길동";		//final 키워드 적용
	final int fage=10;

	//상수 정의
	public static final int START = 0;
	static public final int CONTINUE =1;
	static public final int END = -1;
	
	
	//Constructor
	public AnimalAccessModifier() {}
	public AnimalAccessModifier(String pname, int page) {
		this.pname = pname;
		this.page = page;
	}
	
	//Method
	//static method
	void getInfo() {System.out.println(pname+", ");} //같은 클래스에서만 호출 가능
	public void getInfo2() {System.out.println(pname+", "+page);} //전체 클래스에서 호출 가능
	static public void getInfo3(){System.out.println(sname+", "+sage);} //static은 메모리에 올라가는 정보가 아니기 때문에 접근 가능
	
	//getter/setter
	public String getPname() {return pname;}
	public int getPage() {return page;}
	
	public void setPname(String pname) {this.pname = pname;}
	public void setPage(int page) {this.page = page;}
	
	
	
}
