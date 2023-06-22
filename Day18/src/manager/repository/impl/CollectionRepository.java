package manager.repository.impl;

import java.sql.SQLException;
import java.util.List;

import manager.entity.Student;
import manager.repository.Repository;

public class CollectionRepository implements Repository {

	@Override
	public List<Student> selectAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectSearchedStudents(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updateStudent(int stdNO, Student student) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int rowCount() throws Exception {
		// TODO Auto-generated method stub
		return 100;
	}

}
