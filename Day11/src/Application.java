//import home.이영현;
import home.*; // 폴더가 달라 임포트 하지 않으면 8열이 실행되지 않는다.
               // 임포트를 했지만 엄마 클래스는 접근제한자가 디폴트 이기에 12열이 실행되지 않았다.
               // 디폴트(아무 것도 입력하지 않았을 때)는 같은 폴더에서만 사용할 수 있다.
import staticexample.Counter;

public class Application extends 아빠 { // public 선언 했기 때문에 누구나 부를 수 있다. extends 상속에 쓰인다.
	
	
	
	
	public static void main(String[] args) {
		
		int 지갑 = 0;
		
		이영현 a = new 이영현();
		a.sayMyName();
		a.sayMotherName(); // 같은 폴더에서 알아낸 것을 간접적으로 부르는 것은 허용된다.
		
		아빠 b = new 아빠();
		b.sayMyName(); // 퍼블릭 이므로 누구나(임포트만 한다면) 부를 수 있다.
		지갑 += b.용돈주세요(); // 프로텍티드 이므로 상속관계만 가능하다. 추후 설명..
		지갑 += b.용돈주세요();
		지갑 += b.용돈주세요();
		지갑 += b.용돈주세요();
		지갑 += b.용돈주세요();
		지갑 += b.용돈주세요();
		지갑 += b.용돈주세요();
		
		System.out.println("이영현 아빠한테 삥듣음");
		System.out.println("영현 : 제 지갑에는 " + 지갑 + "원이 있어요.");
		//b.청소(); // 디폴트 이므로 같은 폴더만 호출할 수 있다.
		
		//b.walletBalance = 1000;
		//System.out.println("아빠 지갑에는 " + b.walletBalance + "원이 있어요.");
		
		/*new Application().용돈주세요(); // 상속관계가 되어 접근할 수 있다.
		new Application().청소();*/ // 디폴트 이므로 여전히 호출 불가능.
		
		// a.sayMyAge(); // 이영현은 퍼블릭 객체이지만, sayMyage는 디폴트 행위 이므로 말을 듣지 않는다. 같은 폴더만 물어볼 수 있다.
		
		// 엄마 b = new 엄마();
		
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		
		
	}

}
