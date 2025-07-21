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
			String id = "홍길동";
			final String HOST = "localhost";
			final int PORT = 9000;
			Frame f = new Frame("채팅 클라이언트");
			Panel p = new Panel();
			f.setLayout(new BorderLayout());
			TextField tf = new TextField(40);
			TextArea ta = new TextArea();
			Button send = new Button("전송");
			Button button1 = new Button("종료");
			ta.setEditable(false);
			tf.setText("["+id+"]: ");
			p.add(tf);	p.add(send);
			
			
			
			
			Socket s = new Socket(HOST, PORT); //localhost, 127.0.0.1, 192.168.50.54
			System.out.println("클라이언트 접속~");
			
			DataInputStream input = new DataInputStream(s.getInputStream());
			DataOutputStream output = new DataOutputStream(s.getOutputStream());
			
//			ta.append(input.readUTF()+"\n");
			new ServiceThread(input, ta).start();
			
			f.add(p, BorderLayout.NORTH);
			f.add(ta, BorderLayout.CENTER);
			f.add(button1, BorderLayout.SOUTH);
			f.setSize(400, 500);
			f.setVisible(true);
			
			//전송 버튼 이벤트
			send.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						//전송버튼 클릭 ---> 서버로 tf 데이터 전송
						output.writeUTF(tf.getText());
						tf.setText("["+id+"]: ");
//						ta.append(input.readUTF()+"\n");
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
			});
			
			//종료 이벤트
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						System.out.println("-- 클라이언트 종료 --");
						output.writeUTF("exit");
						System.exit(0);						
					}catch(Exception e2) {
						
					}
					
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

class ServiceThread extends Thread {
	DataInputStream input;
	TextArea ta;
	
	public ServiceThread(DataInputStream input, TextArea ta) {
		this.input = input;
		this.ta = ta;
	}
	
	public void run() {
		try {
			while(true) {
				ta.append(input.readUTF()+"\n");				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


