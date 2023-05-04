/*
 *  이름 : 이영현
 *  사는곳 : 서울 금천구
 *  직장 : 경기 화성시
 *  "안녕하세요"
 * 
 */



public class LiteralExample {
	
	public static void main(String args[]) {
		
		
		//상수
		double pi = 3.14;
		pi = 3.15; // 오류가 나지 않는다. (pi는 변수)
		
		final double PI = 3.14;
		//PI = 3.15; // 불변인 상수를 중간에 수정하고자 하면 컴파일 에러
		
		final double MAX_AGE;
		MAX_AGE = 10;  //<-- 오류는 아니지만 지양해야 한다. 값을 나중에 입력하는 방식.
		
		
		
		
		// 리터럴은 \n, \t, \", 등 문자열을 출력/정하고 싶을 때 사용하는
		// 규칙 (escape sequence) 이다.
		System.out.print("이름 : 이영현\n");
		System.out.print("사는곳 : 서울 금천구\n");
		System.out.print("직장 : 경기 화성시\n");
		System.out.print("\"안녕하세요\"");
		
		
	}

}
