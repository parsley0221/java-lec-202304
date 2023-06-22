package manager.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import manager.connect.MariaDBConnect;
import manager.entity.Student;
import manager.repository.Repository;

public class DBRepository implements Repository {

	private Connection connection = null;
	
	// DBRepository의 객체가 생성될 때 DbConnection 객체를 connection에 채우고 싶다.
	// 생성자
	
	public DBRepository() {
		try {
			this.connection = MariaDBConnect.getConnection();
		} catch(Exception ex) {
			System.out.println("DB 접속에러 : \n" + ex.getMessage());
		}
	}
	
	
	//-- R
	//-- 검색어가 없음(메서드의 인자가 없음) = 학생 전체를 불러온다.
	@Override
	public List<Student> selectStudents() throws SQLException {
		
		String sql = "SELECT * FROM student ORDER BY std_no asc";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		//-- 쿼리를 DB에 날린다.
		ResultSet result = pstmt.executeQuery();
		List<Student> resultList = new ArrayList<Student>();
		
		while(result.next()) { // 1개 이상이면 들어오게 되어있다.
			resultList.add(
				new Student(
					result.getInt("std_no") ,
					result.getString("name"),
					result.getString("grade"),
					result.getInt("score"),
					result.getString("insert_dt"),
					result.getString("update_dt")
				)
					
			);			
		}
		
		return resultList;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		
		String sql = "SELECT * FROM student where std_no = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, stdNo);
		//-- 쿼리를 DB에 날린다.
		ResultSet result = pstmt.executeQuery();
		Student student = null;
		
		while(result.next()) {
			student = new Student(
					result.getInt("std_no") ,
					result.getString("name"),
					result.getString("grade"),
					result.getInt("score"),
					result.getString("insert_dt"),
					result.getString("update_dt")
					
			);				
		}
		
		return student;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		
		String sql = "SELECT * FROM student where name = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, name);
		//-- 쿼리를 DB에 날린다.
		ResultSet result = pstmt.executeQuery();
		List<Student> resultList = new ArrayList<Student>();
		
		while(result.next()) { // 1개 이상이면 들어오게 되어있다.
			resultList.add(
				new Student(
					result.getInt("std_no") ,
					result.getString("name"),
					result.getString("grade"),
					result.getInt("score"),
					result.getString("insert_dt"),
					result.getString("update_dt")
				)
					
			);	
		}		
		
		return resultList;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		
		// 데이터베이스 마다 다르지만
		String sql = "select * from student order by std_no desc limit 1"; 
		// asc = 오름차순(1,2,3,...) desc = 내림차순(5,4,3,...)
		// limit 숫자 = 위에서 숫자만큼 까지만 꺼내오겠다.
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet result = pstmt.executeQuery();
		Student student = null;
		
		while(result.next()) {
			student = new Student(
					result.getInt("std_no") ,
					result.getString("name"),
					result.getString("grade"),
					result.getInt("score"),
					result.getString("insert_dt"),
					result.getString("update_dt")
			);
		}
		
		return student;
	}

	//--- C (Insert)

	@Override
	public boolean registStudent(Student student) throws SQLException {
		
		//String sql = "insert into 테이블명 (컬럼명,...) values (값...); ";
		String sql = "insert into student (name, grade, score) values (?, ?, ?)";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getGrade());
		pstmt.setInt(3, student.getScore());
		int affectedRows = pstmt.executeUpdate();
		pstmt.close();
		
		// ㄴ 영향받은 행의 수를 표시한다.
		
		return affectedRows > 0;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		// ㄴ 성공실패 번호가 1회 이상이므로 int로 설정하였다.
		
		//String sql = "update 테이블명 set 컬럼 = 바꿀값, 컬럼2 = 바꿀값2 where xxxx";
		String sql = "update student set name = ?, grade = ?, score = ? "
				+ ", update_dt = current_timestamp() where std_no = ?";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getGrade());
		pstmt.setInt(3, student.getScore());
		pstmt.setInt(4, stdNo);
		
		int AffectedRows = pstmt.executeUpdate();
		pstmt.close();
		return AffectedRows;

	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		// delete 문법
		// String sql = "delete from 테이블명 where xxx";
		String sql = "delete from student where std_no = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, stdNo);
		int AffectedRows = pstmt.executeUpdate();
		pstmt.close();		
		return AffectedRows > 0;
	}

	@Override
	public void closeRepository() throws Exception {
		// 데이터베이스 커넥션을 닫는		
		if(connection != null && !connection.isClosed()) connection.close();
	}

}
