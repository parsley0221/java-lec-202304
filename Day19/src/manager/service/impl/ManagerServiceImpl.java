package manager.service.impl;

import manager.entity.Student;
import manager.service.ManagerService;
import manager.repository.Repository;
import manager.repository.impl.CollectionRepository;
import manager.repository.impl.DBRepository;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {

	//-- Repository 객체 생성
	//-- 불변객체
	//private final Repository repository = new DBRepository();
	private final Repository repository = new CollectionRepository();
	
    @Override
    public Student registerStudent(Student student) throws Exception {
    	
    	Student resultStudent = null;
    	
    	if(repository.registStudent(student)) { // 수정한 값을 담고
    		resultStudent = repository.lastInsertedStudent(); // 마지막으로 입력된 학생을 보여준다.
    	} 
        return resultStudent;
    }

    @Override
    public Student modifyStudent(Student student) throws Exception {
    	// student.getStdNo(); 굳이 인자로 넘기지 않아도 되지만,
    	// repository 표준에 updateStudent(int, student)
    	int affectedRows = repository.updateStudent(student.getStdNo(), student);
        if(affectedRows > 0) {
        	return student;
        } else {
        	return null;
        }
    }

    @Override
    public List<Student> searchStudents(Student student) throws Exception {
    	
    	List<Student> list = null;
    	
    	//조건 1. 전체를 조회한다.
    	if( student == null ) {
    	list = repository.selectStudents();
    	} else if( student.getName() != null){
    		// 조건 2 . 학생이름을 검색어로 조회한다.
    		list = repository.selectStudent(student.getName());
    	} else {
    		// 조건 3. 학생번호로 조회한다.	
    		list = List.of(repository.selectStudent(student.getStdNo()));
    	}
    	
    	return list;        
    }

    @Override
    public boolean deleteStudent(int stdNo) throws Exception {
        return repository.deleteStudent(stdNo);
    }

    @Override
    public void closeService() throws Exception {
    	repository.closeRepository();
    }
}
