
public class ForExample {
	
	public static void main(String[] args) {
		
		// 1 ~ 100 까지 출력하세요.
		
		for( int i = 1; i <= 100; i++ ) { // 1.변수 초기화식; 2.조건식; 4.증감식
			System.out.println(i); // 3.실행문; 1 -> 2-> 3-> 4 반복하다가 조건식이 false가 될 때 빠져나온다.
		}
		
		// for문 내부의 값을 (초기화;비교;증감)
		// 부분은 필수가 아니다.
		int i = 1;
				
		for(;i<=100;i++) {
			System.out.println(i);			
		}
		i = 1;
		for(;i<=100;) {
			System.out.println(i++);
		}
		
		//for(;;) {
			
		
		
	}

}
