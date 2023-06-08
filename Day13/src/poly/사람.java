package poly;

public class 사람 {

	String name; // 이름

	// 생성자
	사람(){
		this.name = "이름";
	}
	
	사람(String name){
		this.name = name;
	}

	// 메서드(멤버메서드) = 행위
	void 일하다() {
		System.out.println("일하다.");
	}
	
}
