// 클래스 정의 및 객체 생성

// class 클래스명 {}
// Human 클래스 정의부
class Human {
	
	// 클래스의 구성 요소
	// 필드(속성) - 객체 자신을 표현하는 속성 / 상태
	// 메서드(행위) - 그 객체의 행동
	//           - 자기자신을 생성하는 행위 (생성자)
	
	// Human 클래스의 멤버에 무었이 있니?
	// "멤버"필드(속성)는 ㅁㅁ가 있구요.
	// "멤버"메서드(행위)는 ㅇㅇ가 있어요.
	// 그리고 생성자는 *** 있어요.
	
	String name; // 이름 -- 이 상태로 실행시 null로 표기된다.
	
	
	void sayMyName() {
		
		System.out.println("제 이름은 " + name + "입니다.");
		
	}
	// "멤버"필드는 name이 있구요.
	// "멤버"메서드는 sayMyName이 있어요.
	// 생성자는 없어요.
	
	void 외치다() {
		
		System.out.println("아아악");
	
	}
	
	String 외치다(String name, String status) {
		
		System.out.println("뇽");
		return "으으으으";
		
	}
	
	void 외치다(String name) { // void 외치다()와 매개 변수는 같지만 넘어가는 값이 달라 중첩 가능하다.
							 // String 외치다(String 변수명) 은 중첩되지 않는다.
							 // String 외치다(String name, String status) 는 중첩 가능하다.
		System.out.println("야! " + name + "!");
		
	}
	
	// JVM 해석방식
	// 외치다는
	// void 외치다()
	// String 외치다(String)
	// void 외치다(String)
	
	
	// 같은 이름의 메서드 여러개를 사용하는 것을
	// 메소드 오버로딩(중첩) 이라고 한다.
	// 구분 방법 : 리턴타입이 다르거나, 인자가 다르거나
	
}


public class ClassExample {
	
	public static void main(String[] args) {
		// 변수선언
		// 데이터타입 변수명 = 값;
		Human human = new Human(); // 객체가 생성됩니다. (); 생성자 메서드다. 객체의 만드는 행위.
		Human human2 = new Human(); // 객체 생성2
		// 위 두 객체는 같은 객체인가? // 같은 주소를 참조하는가?
		// 같은 곳에서 불러냈지만 다르다.
		// 서로 다른 주소값을 갖는다.
		Human human3 = human; // 이와 같이 했을 경우 human와 human3는 같은 주소값을 갖는다.
		
		//new 라는 연산자를 만나 클래스를 구체화 하여 . 이라는 연산자를 통해 그 클래스의 행위에 접근할 수 있다.
		human.name = "이영현"; // 17열에 값을 넣어 이영현으로 표기된다.
		human.sayMyName();
		
		human2.name = "메롱";
		human2.sayMyName();
		
		human3.sayMyName(); // human과 같은 주소를 참조한다.
		
		if(human != human2) { // h, h2가 같지 않으면 true
			System.out.println("h와 h2는 다른 객체이다.");
		}
		// '사람'이라는 클래스에서 생성된 이영현과 메롱의 객체는 다르다.
		
		if(human == human3) { // h, h3가 같다면 true
			System.out.println("h와 h3는 이영현을 가르키는 참조변수.(같다)");
		}
		// h와 h3 는 같은 객체야? 라는 위와 같은 질문이 아닌
		// h와 h3 는 사람이야? (h와 h3는 Human 클래스에서 생성된 객체야?) 라는 질문을 하려면
		// 아래와 같다.
		if(human instanceof Human && human3 instanceof Human ) { 
			// h, h3 은 Human 클래스에서 생성된 객체야? instanceof
			System.out.println("이영현과 메롱은 사람입니다.");			
		}
		
		human.외치다(); // 한글도 사용 가능하지만 사용하지 말자.
		human.외치다("이영현");
		human.외치다("ㅁ", "ㅇ");
		
	}

}
