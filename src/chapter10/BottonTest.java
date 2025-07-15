package chapter10;

//import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BottonTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		f.setLayout(new BorderLayout());
		Button btnClick = new Button("클릭해주세요1");
		Button btnClick2 = new Button("클릭해주세요2");
		Button btnClick3 = new Button("클릭해주세요3");
		p.add(btnClick);
		p2.add(btnClick2);
		p3.add(btnClick3);
		f.add(p, BorderLayout.NORTH);
		f.add(p2, BorderLayout.CENTER);
		f.add(p3, BorderLayout.SOUTH);
		f.setTitle("버튼 테스트");
		f.setSize(300,400);
		f.setVisible(true);
		
		//버튼의 이벤트 처리 1. - 내부 클래스를 생성하여 액션이벤트 처리
//		BottonTest.ButtonActionListener action = new BottonTest.ButtonActionListener();
		//내부 클래스는 사용되고 사라지니 new 키워드로 사용해도 됨
		btnClick.addActionListener(new BottonTest.ButtonActionListener()); 
		//ActionListener 인터페이스를 상속받은 클래스객체를 생성해서 매개변수자리에 넣는것으로 버튼의 이벤트 처리
		
		
		//버튼의 이벤트 처리 2. - Anonymous(익명) 클래스를 생성하여 액션 이벤트 처리
		btnClick2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 2 click");
			}
		});
		//class AnonymousActionListener implements ActionListener: JVM이 자동으로 이름 없는 클래스를 만들어서 사용 
		
		
		//버튼의 이벤트 처리 3. - 람다식(Java 8 이상) 처리 방법을 이용한 이벤트 처리
//		btnClick3.addActionListener((ActionEvent e)->{
//			System.out.println("Button 3 click");
//		});
//		btnClick3.addActionListener(e->{
//			System.out.println("Button 3 click");
//		}); 
		//ActionEvent e는 파라미터 이기 때문에 감싸고 있는 괄호와 ActionEvent는 생략 가능하다.
		
		btnClick3.addActionListener(e->	System.out.println("Button 3 click"));
		//블럭도 생략하여 한줄로 작성가능
		
		
		//Frame의 종료 이벤트
		//WindowListener는 인터페이스 이기 때문에 모든 메소드를 다 적어야함.
		f.addWindowListener(new WindowListener() {
			public void windowActivated(WindowEvent e) {}
			public void windowClosed(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			public void windowDeactivated(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowOpened(WindowEvent e) {}
		});
		
	}
	
	/**
	 * 버튼의 이벤트 처리 클래스
	 */
	public static class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("짜잔");
		} 
	}

}
