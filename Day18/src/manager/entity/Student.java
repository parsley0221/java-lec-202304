package manager.entity;

/*
 * List<Student>
 * 학생 클래스
 */
public class Student {

 private int stdNo; //-- 학생코드
 private String name; //-- 학생이름
 private String grade; //-- 학년
 private int score; //-- 평균점수
 private String insertDt; //-- 입력일시
 private String updateDt; //-- 수정일시
 
 /*생성자*/
 public Student(int stdNo, String name, String grade, int score, 
		 String insertDt, String updateDt) {
	 this.stdNo = stdNo;
	 this.name = name;
	 this.grade = grade;
	 this.score = score;
	 this.insertDt = insertDt;
	 this.updateDt = updateDt;
 } 
  
 
 public Student(String name, String grade, int score) {
	this(0,name,grade,score,null,null);
}




public int getstdNo() {
	return stdNo;
 }
 public void setStd_no(int std_no) {
	this.stdNo = std_no;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public String getGrade() {
	return grade;
 }
 public void setGrade(String grade) {
	this.grade = grade;
 }
 public int getScore() {
	return score;
 }
 public void setScore(int score) {
	this.score = score;
 }
 public String getInsertDt() {
	return insertDt;
 }
 public void setInsertDt(String insertDt) {
	this.insertDt = insertDt;
 }
 public String getUpdateDt() {
	return updateDt;
 }
 public void setUpdateDt(String updateDt) {
	this.updateDt = updateDt;
 }
  
}
