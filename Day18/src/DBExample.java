import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
//-- JDBC ( java.sql.* / javax.sql.* )
//-- ConnetorJ / JDBC Driver (업체가 만들어서 제공 - 데이터베이스 벤더)
//-- 1. 사용할 DB 벤더의 Driver 로딩시킴 ( java.sql.*에 있는 인터페이스를 객체화 시켜서 사용 가능)
//-- 2. 연결(데이터베이스)을 수행
//	 Host : http://naver.com
//	 ID/PWD : 로그인
//	 메일탭 -> table을 선택(use 테이블)
//-- 3. SQL 문을 날립니다.
//-- 4. 모든 질의(SQL)문의 끝나면, 나중에는 자원반납(Connection을 닫는다.)

//-- 자바에서 실행하려면 이 규격에 맞게 만들어 와야 해. 대부분 인터페이스로 구성되어 있다.
//-- 맥은 오픈 머시기를 사용해서 다이렉트 x 가 아니라서 새롭게 만들어야 게임을 할 수 있다.
public class DBExample {

	public static void main(String[] args) throws Exception{
		
		// 1. mariadb Driver 로딩
		Class.forName("org.mariadb.jdbc.Driver"); 
		
		// 2. DB 연결하자.
		Connection conn = 
		DriverManager.getConnection(
		 "jdbc:mariadb://javalec.cacrpbu8np1b.ap-northeast-2.rds.amazonaws.com:3306/JavaProject", //host + database,
		 "admin",  //id,
		 "12345678"//pwd
		);		
		
		
		// 3. 질의문
		String sql = "select * from student";
		Statement stmt = conn.createStatement(); // 쿼리 구문을 실행하는 객체
		ResultSet rs = stmt.executeQuery(sql); // DB에 질의문 실행 (Select 전용)
		// executeQuery() Select 전용(데이터를 가지고옴) - ResultSet
				
		//System.out.println("레코드 수 : " + rs.getFetchSize());
		
		/*while(rs.next()) {
			System.out.println("이름 : " + rs.getString("name"));
			System.out.println("학년 : " + rs.getString("grade"));
			System.out.println("평균점수 : " + rs.getInt("score"));
		}
		*/
		//-- 데이터 수정
		sql = "update student set name = '이영현', update_dt=current_timestamp()" 
			  + "where std_no = 1";
		
		int affected_rows = stmt.executeUpdate(sql);
				
		System.out.println("Affected Rows " + affected_rows);
		
		//-- 수정 데이터 확인
		sql = "select * from student";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("이름 : " + rs.getString("name"));
			System.out.println("학년 : " + rs.getString("grade"));
			System.out.println("평균점수 : " + rs.getInt("score"));
		}
		
		// 4. 자원반납(Connection 끊기)
		stmt.close();
		if(conn.isClosed()) conn.close();
		
		
	}	
	
}
