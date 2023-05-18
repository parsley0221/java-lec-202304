// 메서드(행위) 만들기 - 함수
// (접근제한자) 리턴타입 메서드명( 매개변수 ) {
//		..실행문 (메서드 정의부)
// }


public class MethodExample {
	
	// 그림처럼 add 라는 메서드를 작성하겠다.
	int add(int x, int y) {
		return x + y;
	}	
	
	void bark(String name) { // 리턴 값이 없이 출력만 할 때 void
		System.out.println("내 이름은 " + name + ", 왈왈");
	}
	
	void sayMyName() {
		System.out.println("내 이름은 이영현이야.");
	}
	
	
	public static void main(String[] args) {
		                                        // (MethodExample 이라는 클래스에 들어가서)
		MethodExample ex = new MethodExample(); // new - 객체를 가시화 하는 것. 전화를 검.
		                                        // 가시화 하지 않으면 행위를 할 수 없다.
		int result = ex.add(10, 11);   // . 연산자 가시화된 메서드.
		System.out.println(result);
		
		//int a = ex.bark("바둑이"); // 리턴값이 없으므로(void) 에러
		ex.bark("바둑이");
		
		
				
	}

}
