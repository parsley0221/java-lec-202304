//scope
//변수의 범위.
//변수가 어디까지 영향을 끼치는가?

public class ScopeExample {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat(); // Cat이라는 클래스 속의 cat 이라는 객체를 생성합니다.
		cat.sayMyName(); // 네 이름이 뭐니? -- 지역변수 이영현 출력
		cat.sayMyAge(); // 네 나이가 몇이니? -- 전역(클래스)변수 야옹이 출력		
	}

}



class Cat {
	
	//-- 클래스 멤버(필드or변수)
	//-- 클래스 전역(모든지역) 변수
	String name = "야옹이"; // name 과
	//String name = "이영현";
	// 같은 구역에 같은 이름을 가지는 변수명이 있기에 에러.
	
	void sayMyName() { // sayMyName 은 같은 {} 내(레벨)에 있다.
		
		//-- 지역(일부지역(sayMyName에서만 사용하는))변수
		int age = 10; // *age 와
		String name = "이영현"; 
		//-- 우리동네에 name이라는 이름의 사람이 있어요(동명이인)
		//-- 에러 X
		System.out.println(name);
		
	}
	
	void sayMyAge() { // *sayMyAge 는 다른 {} 내(레벨)에 있다.
		
		System.out.println(name);
		// int age는 sayMyName() 정의부 내에 존재하는
		// '지역'변수 이기 때문에 접근 불가
		// String name은 클래스 전역에서 접근하는 변수이므로
		// 접근 가능
		// System.out.println("난 " + name + ", 나이는 " + age); <--age 때문에 에러
		
		
	}
	
}
