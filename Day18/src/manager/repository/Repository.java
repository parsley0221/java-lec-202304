package manager.repository;

import java.sql.SQLException;
import java.util.List;
import manager.entity.Student;

public interface Repository {

	// CRUD
	// 1. Read
	List<Student> selectAllStudents() throws SQLException;
	
	Student selectStudent(int stdNo) throws SQLException;
	
	List<Student> selectSearchedStudents(Student student) throws SQLException;
	
	// 2. Create(Insert)
	boolean registStudent(Student student) throws SQLException;
	
	// 3. Update
	int updateStudent(int stdNO, Student student) throws SQLException;

	// 4. Delete
	boolean deleteStudent(int stdNo) throws Exception;
	
	// Etc... (전체 rows 숫자)
	int rowCount() throws Exception;

}
