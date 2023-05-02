// Char 캐릭터 문자



public class CharExample {
	
	public static void main(String args[]) {
		
		char alpha = 97;
		byte x = 127;
		
		float f = 1.0f;
		//float 값을 주려면 실수 뒤에 f 를 써야한다.
		
		
		//10; // -- 정수의 기본 값은 int 이다.
		//1.0; // -- 실수의 기본 값은 double 이다.
		System.out.println(alpha);
		
		final char ALPHA_FINAL = 65;
		char alpha2 = 65;
		int ascii = 0;
		
		for(int i = 0; i < 26; i++) {
			alpha2 = (char)(ALPHA_FINAL+i);
			ascii = alpha2;
			System.out.println(
					"문자 : " + alpha2 + "는 ASCII CODE"
					+ ascii + " 입니다. "
				);
		}
		
		
		
	}

}
