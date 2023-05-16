
public class ArrayUsage01 {
	
	public static void main(String[] args) {
		
		String[] arrString = {"이영현", "금천구", "살려줘"}; // [3] 으로 구성된 1차원 배열
		for( int x = 0; x < arrString.length; x ++ ) {  // length 배열 내용을 순서대로 출력할 때 사용
			System.out.println(x + " : " + arrString[x]);
		}
		
		
		//--- String[] args 가지고 놀기
		System.out.println
		("프로그램 시작 변수 : " + args.length); // 변수를 넘기지 않아서 0으로 출력 , Run > Run Config... > Arguments > 내용 넣으면 변경
		for( int x = 0; x < args.length; x ++) {
			System.out.println(x + " : " + args[x]); // 이걸로 할 수 있는 것 : 사용자의 입력값을 스캐너 없이 ~~
		}
		
		
		//-- javac xxxx.java <-- 컴파일  , cmd에서 실행할 때?
		//--> xxxx.class
		//--java xxxx <-- 실행
		//--java xxxx 매개변수1 매개변수2 매개변수3 // 위 방법을 cmd에서 하는 방법?
		
		
		
		
	}

}
