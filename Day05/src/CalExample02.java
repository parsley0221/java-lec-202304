
public class CalExample02 {
	
	public static void main(String[] args) {
		
		byte x = 3; // 1 byte = 8 bit
		            // 0000 0000
		            // 3 = 0000 0011
		
		System.out.println
		("3은 2진수로 " + Integer.toBinaryString(x));
		
		byte y = -1; // 1 byte = 8 bit
        // -1 = 1111 1111 1111 1111 1111 1111 1111 1111
		// 1  = 0001이지만 음수는 반대로 표현하고 1을 더한다.
		// -1 = 1110 + 1 이므로 1111이 된다.

        System.out.println
        ("-1은 2진수로 " + Integer.toBinaryString(y));
        
        byte z = 15; // 1 byte = 8 bit
        // 15 = 1111

        System.out.println
        ("15는 2진수로 " + Integer.toBinaryString(z));
        
        byte a = -4; // 1 byte = 8 bit
        // -4 = 1111 1111 1111 1111 1111 1111 1111 1100
		// 4  = 0100이지만 음수는 반대로 표현하고 1을 더한다.
		// -4 = 1011 + 1 이므로 1100이 된다.

        System.out.println
        ("-4는 2진수로 " + Integer.toBinaryString(a));
		
		
	}

}
