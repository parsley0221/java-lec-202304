// 1. 대입연산
// 2. 산술연산

public class CalExample01 {
	
	public static void main(String args[]) {
		
		//대입연산
		int a = 10; // 좌측 공간에 우측 값을 할당(대입)한다.
		            // 좌측은 변수/상수 우측은 값 혹은 연산식
		int b = a + 3; // 좌측은 변수 우측은 연산식
		System.out.println(a + " + 3 = " + b);
		
		
		//산술연산
		int x = 10;
		int y = 20;
		int z = ( x + y ) * 10 / 20; // 대입연산 =, 산술연산 + * /
		                             // 연산자 우선순위는 사람과 같다.
		System.out.println("( " + x + " + " + y + " ) " + "* 10 / 20 = " + z );
		
		// 곱셈
		int x1 = 10;
		int y1 = 20;
		int z1 = x1 * y1; // 컴퓨터의 x(곱하기)는 * 로 표기합니다
		
		System.out.println(x1 + " x " + y1 + " = " + z1);
		
		// 나눗셈
		int x2 = 10;
		int z2 = x2 / 2;
		System.out.println(x2 + " / 2 = " + z2);
		
		//나머지
		int x3 = 10;
		int y3 = 7;
		System.out.println(x3 + " % " + y3 + " = " + (x3 % y3));
		
		
	}

}
