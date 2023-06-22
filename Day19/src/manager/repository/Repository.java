package manager.repository;

import java.sql.SQLException;
import java.util.List;
import manager.entity.Student;

public interface Repository {
	
	// CRUD 
	// 1. Read 
	List<Student> selectStudents() throws SQLException;
	// ㄴ전체 학생을 리스트 형식으로 불러온다
	
	Student selectStudent(int stdNo) throws SQLException;
	// ㄴ 하나의 학번에 등록되어 있는 건 한명의 학생이므로 리스트X
	
	List<Student> selectStudent(String name) throws Exception;
	// ㄴ 동명이인이 있을 수 있으므로 리스트
	//-- 최종 추가된 학생
	
	Student lastInsertedStudent() throws Exception; 
	// 최종 입력된 학생번호

	// 2. Create(Insert) 
	boolean registStudent(Student student) throws SQLException;
	
	// 3.Update
	int updateStudent(int stdNo, Student student) throws SQLException; 
	
	// 4.Delete 
	boolean deleteStudent(int stdNo) throws Exception;


	// 5. 자원반납
	void closeRepository() throws Exception;

	
}
