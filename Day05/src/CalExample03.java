// 비트 연산

public class CalExample03 {
	
	public static void main(String[] args) {
		
		// bit 연산 ( bitwise 연산 )
		// 1. bit 연산자는 논리 연산자와 똑같다.
		// And, Or, XOR, Not
		
		byte x = 5;
		byte y = 10;
		
		System.out.println("x = 0" + Integer.toBinaryString(x));
		System.out.println("y = " + Integer.toBinaryString(y));
		System.out.println("x & y = " + (x & y));
		System.out.println("x | y = " + (x | y));
		System.out.println("x ^ y = " + (x ^ y));
		System.out.println(" ~x = " + (~x));
		
		
		// 5  = 0101
		// 10 = 1010
		// & = 양쪽 다 1일 때 1 이므로 0000 = 0
		// | = 둘 중 하나만 1이어도 1 이므로 1111 = 15
		// ^ = 둘 중 하나만 1이어야 1 이므로 1111 = 15
		// ~ = 전체 반대의 값 
		// ~x = 1111 1111 1111 1111 1111 1111 1111 1010 = -6
		
		System.out.println("x << 2 = " + (x << 2));
		System.out.println("x >> 2 = " + (x >> 2));
		System.out.println("~x >> 2 = " + (~x >> 2));
		System.out.println("~x >>> 2 = " + (~x >>> 2));
		
		// 5 = 0101
		// 5 << 2 = 0001 0100 = 20
		// 5 >> 2 = 0000 0001 = 1
		// ~5 >> 2 = 1111 1110 = -2
		// 1111 1111 1111 1111 1111 1111 1111 1110
		// 1110 - 1 = 1101 를 뒤집으면 = 0010 = 2 
		// ~5 >>> 2 = 1,073,741,822
		// 0011 1111 1111 1111 1111 1111 1111 1110
		// 2^30 에서 0(1), 2^0 (1), 2를 빼면 
		// (2^30)-2 = 1,073,741,822
		
		
		//--
		
		System.out.println(2*2*2*2*2*2);
		System.out.println(1 << 6);
		
		// 모바일은 윗 방법으로 연산한다. 위는 연산속도가 느리지만 전력소비가 낮다
		// PC는 아래 방법으로 연산한다. 아래는 연산속도가 빠르지만 전력소비가 높다
		
		byte z = 10;
		byte z1 = 10;
		z = (byte)(z << 2);
		z1 <<= 2;
		// 10 = 0000 1010
		// 10 << 2 = 0010 1000 = 40
		
		System.out.println("z = " + z);
		System.out.println("z1 = " + z1);
		
		
		System.out.println("안녕하세요 저는 " + 20 + 5 + "살 입니다.");
		//20이 문자열로 바뀌어 선연산 되어, 205로 출력된다.
		
		System.out.println("안녕하세요 저는 " + (20 + 5) + "살 입니다.");
		// ()부터 선연산이 되서 25로 출력된다.
		
		int colorPen = 5 * 12;
		int studentCount = 27;
		int divColorPen = colorPen/studentCount;
		
		System.out.println("학생당 나눠가지는 색연필수 = " + divColorPen);
		
		int remainColorpen = colorPen%studentCount;
		System.out.println("똑같이 나눠가지고 남은 색연필수 = " + remainColorpen);
		
		
		int year = 1904;
		int a = 4;
		int b = 100;
		int c = 400;
		
		boolean leapYear = (year % b == 0 ^ year % a == 0) || year % c == 0;
		
				System.out.println(leapYear);
		
		
		
		
	}
	

}
