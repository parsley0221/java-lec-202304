package staticexample;

// 웹 어플의 카운터
public class Counter {

	// static 키워드는
	// 멤버변수, 메서드 에 붙여 씁니다.
	int dynamicCounter = 0; // 인스턴스 변수(즉, 객체변수) // 생성될 때마다 초기화 된다. // heap 영역에 들어간다
	static int staticCounter = 0; // 정적변수 // 
	
	
	// 인스턴드 메서드(객체 메서드) = 동적
	public void plusDynamicCounter() {
		dynamicCounter ++;
	}

	// 정적 메서드 = 정적( MethoArea 에 한번만 할당 )
	public static void plusStaticCounter() {
		staticCounter ++;
	}
	
	
}
