import java.util.Scanner;



public class whileExample {
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 1에서부터 몇 까지 출력할까요?");
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		int startNum = 1;
		
		
		//-- while(조건식) 에서 조건식이 true 일 때(까지 - false)
		//-- { } 내 실행문을 반복 실행합니다.
		while(maxNum >= startNum) { // 조건부터 ture 검증합니다.
			System.out.print((startNum ++) + "\t");
		}
		
		
		//-- do while
		
		do {
			System.out.println("최소 한번은 실행합니다.");
			System.out.print((startNum ++) + "\t");			
		} while(maxNum >= startNum); 
		
		
	}

}
