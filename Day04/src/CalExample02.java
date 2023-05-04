public class CalExample02 {
	
	public static void main(String args[]) {
		
		int x = 10;
		//x = x + 10;
		// x -> 20
		x += 10; // x = x + 10;
		x -= 10; // x = x - 10;
		x *= 10; // x = x * 10;
		x /= 10; // x = x / 10;
		x %= 3;  // x = x % 3;
		
		System.out.println(" x = " + x );
		
		
		// 2. 증감연산
		int y = 1;
		y ++; // y = y + 1; 이 라인이 끝나고 다음 라인부터 적용
		y --; // y = y - 1; 이 라인이 끝나고 다음 라인부터 적용
		++ y; // y = y + 1; 이 라인부터 적용
		-- y; // y = y - 1;	이 라인부터 적용	
		System.out.println(" y = " + y );
		
		
		// 선/후입력 수식에 따라 나타나는 차이점
		int z = 10;
		System.out.println(" z = " + (++ z));
		
		/*
		z ++;
		System.out.println(" z = " + z); <-- 11 출력
		*/
		
		
	}
	

}
