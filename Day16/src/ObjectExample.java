import java.lang.*; //-- 이것을 쓰지 않아도 자바는 기본적으로 java.lang 패키지는 import 되어있다.


public class ObjectExample { // extends Object 를 쓰지 않아도 기본적으로 자바클래스는 Object의 상속을 받는다.

	public static void main(String[] args) {

		String s1 = "이영현";
		String s2 = "이영현";
		System.out.println(" s1 == s2 = " + (s1 == s2));
		// 참으로 나온다. (옛날에는 거짓이었다.)
		// 상수 Pool ( String pool )에 저장된다.
		System.out.println(s1.hashCode()); // 객체당 실제값(이영현)을 기준으로하는 해시코드를 생성한다.
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1)); // 참조 변수당 해시코드를 생성한다.
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("-------------------------------");
		
		String s3 = new String("이영현");
		String s4 = new String("이영현");
		System.out.println(" s3 == s4 = " + (s3 == s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		// 거짓으로 나온다. heap 영역에 새로 저장하기 때문이다.
		
		System.out.println(" s3.equals(s4) = " + s3.equals(s4)); // 참조 영역의 해시코드가 아닌, 실제값(이영현)이 같은 것인지 물어보는 방법
		System.out.println("이영현".toString());
		
		Student std = new Student("이영현",1);
		System.out.println(std); // 
		
		
		
		
	}

}	
	
	
	
class Student {
	
	String name;
	int grade;

	//-- 생성자
	Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
	//-- 오버라이딩(Object클래스에 있는 메소드를)
	@Override
	public String toString() {
		return "class Student { name = " + name + ", grade = " + grade + "}";
	}
	
	
}