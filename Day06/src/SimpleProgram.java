import java.util.*;


public class SimpleProgram {
	
	public static void main(String[] args) {
		
		int command = 0;
				
		do {
			
			System.out.println("명령 코드 입력.(종료 5)");
			Scanner scan = new Scanner(System.in);
			command = scan.nextInt();
			
			
		} while(command != 5);
		
		System.out.println("프로그램 종료");
		
	}

}