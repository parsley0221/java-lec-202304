package manager.service;

import manager.entity.Student;

import java.util.List;

public interface ManagerService {

    //-- 학생등록
    Student registerStudent(Student student) throws Exception;

    //-- 학생수정
    Student modifyStudent(Student student) throws Exception;

    //-- 학생조회
    List<Student> searchStudents(Student student) throws Exception;
    // ㄴ1.전체학생 불러오기
    // ㄴ2.이름으로 불러오기
    // ㄴ3.학번으로 불러오기

    //-- 학생삭제
    boolean deleteStudent(int stdNo) throws Exception;

    //-- 자원반납
    void closeService() throws Exception;

}
