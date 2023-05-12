
//-- 99단
//-- x * 1 = x, x * 2 = 2x ......  1, 2 부분만 증가시키면 된다.

public class MultipleExample {
	
	public static void main(String[] args) {
		
		//-- 2단만 할 때
		for(int y = 1; y <=9; y++) {
			
			System.out.println("2 X " + y + " = " + (2 * y));
			
		}
		
		//-- 2 ~ 9단을 할 때
		for(int x = 2; x <=9; x++) {
			System.out.println("\n");
			for(int y = 1; y <=9; y++) {
				System.out.println(x + " X " + y + " = " + (x * y));
			}
		}
		
	}

}
