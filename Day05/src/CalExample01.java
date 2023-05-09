// 논리연산 && 와 &, || 와 | 의 차이점


public class CalExample01 {
	
	public static void main(String args[]) {
		
		int a = 10;
		int b = 20;
		
		// &&
		System.out.println(a > 10 && a++ < 20);
		System.out.println("a = " + a);
		// &&는 좌항 값이 false 라면, 우항 값을 연산하지 않는다.
		// 그러므로 a++이 연산되지 않아, 두번째 a 는 10으로 출력된다.
		
		// &
		System.out.println(a > 10 & a++ < 20);
		System.out.println("a = " + a);
		// &는 좌항 값이 false 여도, 우항 값을 연산한다.
		// 그러므로 a = 11 으로 출력된다.
		
		//||
		System.out.println(b <= 20 || b-- < 20);
		System.out.println("b = " + b);	
		// ||는 좌항 값이 true 라면, 우항 값을 연산하지 않는다.
		// 그러므로 b = 20 으로 출력된다.
		
		// |
		System.out.println(b <= 20 | b-- < 20);
		System.out.println("b = " + b);
		// |는 좌항 값이 true 여도, 우항 값을 연산한다.
		// 그러므로 b = 19 로 출력된다.
		
		
	}

}
