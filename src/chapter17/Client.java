package chapter17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		try {
			final String HOST = "localhost";
			final int PORT = 9000;
			Frame f = new Frame();
			Panel p = new Panel();
			f.setLayout(new BorderLayout());
			TextField tf = new TextField(40);
			TextArea ta = new TextArea();
			Button send = new Button("전송");
			Button button1 = new Button("종료");
			ta.setEditable(false);
			p.add(tf);	p.add(send);
			
			
			
			
			Socket s = new Socket(HOST, PORT); //localhost, 127.0.0.1, 192.168.50.54
			System.out.println("클라이언트 접속~");
			
			f.add(p, BorderLayout.NORTH);
			f.add(ta, BorderLayout.CENTER);
			f.add(button1, BorderLayout.SOUTH);
			f.setSize(400, 500);
			f.setVisible(true);
			
			DataInputStream input = new DataInputStream(s.getInputStream());
			DataOutputStream output = new DataOutputStream(s.getOutputStream());
			ta.append(input.readUTF());
			
			
			//전송 버튼 이벤트
			send.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						//전송버튼 클릭 ---> 서버로 tf 데이터 전송
						output.writeUTF(tf.getText());
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
			});
			
			
			//종료 이벤트
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("-- 클라이언트 종료 --");
					System.exit(0);
				}
			});
			
			
			
//			byte[] buffer = new byte[1024]; //1kb 크기
//			int bytesRead = input.read(buffer); // 읽은 바이트 수 변환
//			
//			if(bytesRead != -1) {
//				String receivedMessage = new String(buffer, 0, bytesRead, "UTF-8");
//				ta.append("서버로부터 받은 메세지> "+receivedMessage);
//			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
