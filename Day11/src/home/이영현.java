// 접근제한자

package home;

public class 이영현 { // 접근제한자 public
	
	public void sayMyName() { // 접근제한자 public
		System.out.println("영현 : 이영현입니다.");
	}
	
	public void sayMotherName() {
		엄마 mother = new 엄마();
		mother.sayMyName();
	}
	
	
	void sayMyAge() {
		System.out.println(31);
	}

}
