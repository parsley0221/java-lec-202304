
public class Animal {

	String name; // 이름
	String type; // 종
	
	// 기본 생성자
	
	/*Animal() { // 아무것도 넣지 않으면 기본값 출력
		System.out.println("생성자 Animal() 호출");
		name = "동물";
		type = "포유류";
	}
	*/ // 위와 같이 없애면 중첩이 남아 있어 기본 생성자를 생성할 수 없다
	// new Animal(); 을 하면 오류가 뜬다.
	
	Animal() { // 아무것도 넣지 않으면 기본값 출력
		System.out.println("생성자 Animal() 호출");
		name = "동물";
		type = "포유류";
	}
	
	Animal(String pName) { // 네임만 쓴 것으로 출력
		name = pName;
	}
	
	Animal(String pName, String pType) { // 네임 타입을 쓴 것으로 출력
		name = pName;
		type = pType;		
	}

	// 내가 누구인지 소개하는 메서드
	void whoIam() {
		System.out.print("저는 " + type + "이고,");
		System.out.println(" 제 이름은 " + name + "입니다.");
	}
	
}
