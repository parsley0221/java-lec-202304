// loop문(반복문)에서 사용되는 키워드
// 2개 break, continue (106p)

public class LoopKeywordExample {
	
	public static void main(String[] args) {
		
		// break 예시
		// 1부터 100까지의 합이 400을 넘으면 출력하지 않도록
		// 하는 프로그램을 만드세요.
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {			
			sum += i; // sum = sum + i			
			if(sum >= 400) {
				break;
			}
		}
		
		System.out.println("총합 : " + sum);
		
		
		// continue;
		// 반복문에만 존재
		// ex) 짝수만 출력하고 싶을 때 (범위는 1 ~ 100)
		
		for(int x = 1; x <= 100; x++) {
			
			if(x % 2 != 0) {
				continue;
			}
			
			System.out.println(x);
		}
		
		int x = 0;
		while(x <= 100) {
			x++;
			if(x % 2 != 0) {
				continue;
			}
			System.out.println(x);
		}
	
	}
}
