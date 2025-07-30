package chapter20_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnectTest {

	public static void main(String[] args) {
		try {
			//0단계 - 드라이버 다운로드 및 패스 추가
			//1단계 - 드라이버 로딩
			//Url 형식 -
			//String url = "jdbc:mysql://서버주소:포트번호/DB명?옵션들추가..";
			//서버주소: localhost, 127.0.0.1, cmd>ipconfig 주소 사용
			String url = "jdbc:mysql://127.0.0.1:3306/hrdb2019";
			String user = "root";
			String password = "mysql1234";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("----->> 1단계 성공");
			
			//2단계: Statement 객체 생성
			Statement stmt = connection.createStatement();
			System.out.println("----->> 2단계 성공");
			
			//3단계: stmt ResultSet 객체 생성
//			String sql = "select emp_id, emp_name, dept_id, salary from employee"
//						+" where dept_id = 'SYS'"; //접합 연산자 때문에 앞에 한칸 띄우기
			
			//literal 방식 >> JDK 버전 15이상 사용가능/ 자바스크립트 ``(백틱연산자~): 문자
			String sql = """
					select
						row_number() over() as rno,
					    emp_id, 
					    emp_name, 
					    dept_id, 
					    salary,
					    hire_date
					from employee where dept_id = 'SYS'
					"""; 
			ResultSet rs = stmt.executeQuery(sql);
			
			//String builder 사용
//			StringBuilder sb = new StringBuilder(100);
//			sb.append("select emp_id, emp_name, dept_id, salary from employee");
//			sb.append(" where dept_id = 'SYS'");
//			ResultSet rs = stmt.executeQuery(sb.toString());
			
			if(rs != null) {
				System.out.println("----->> 3단계 성공");
				
				//4단계: rs객체에서 데이터 추출
				System.out.println("----->> 4단계 성공 : 데이터 추출");
				while(rs.next()) {
					//List<row가 담기는 객체: EmployeeVo>
					System.out.print(rs.getInt(1) + "\t");
//					System.out.println(rs.getInt("rno")); 행 이름도 사용 가능
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.print(rs.getInt(5) + "\t");
					System.out.print(rs.getString(6) + "\n");
				}
			}
			//ResultSet(rs)객체에 저장되어 있는 정보를 일반 java 프로젝트에서 사용하기 위해서는 connection 객체에 담아서 사용해야한다.
			
			
			//5단계: connection, stmt, rs 객체 종료
			if(rs != null) connection.close();
			if(stmt != null) connection.close();
			if(connection != null) connection.close();
			System.out.println("----->> 5단계 성공 : 종료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
