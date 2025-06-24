package chapter02;

public class HelloJava { //class에 들어가는 public은 필수는 아님, 메모리에서 누구나 사용가능하도록 public으로 설정

	//메인 메소드 - 실행을 위한 필수 메소드
	public static void main(String[] args) { 
		//args:저장소 이름, 메소드에서 변경 가능한 것은 args 밖에 없으나, 변경하는 일은 많지 않다  
//		public, static 순서는 바뀌어도 되나, "void main(String[] args) {}" 순서는 바뀌면 안된다
		System.out.println("Welcome to JavaWorld!!"); //구문을 실행하기 위해서는 main 안에 있어야 한다
			
	}

}
