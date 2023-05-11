import java.util.Scanner;

public class SwitchExample {
	
	public static void main(String[] args) {
		
		// 1-7
		// 1 = 월, 2 = 화 , 3 = 수, 4 = 목, 5 = 금 , 6 = 토, 7 = 일
		
		
		
		
		System.out.println("1-7 범위내의 숫자를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		
		int dayCode = scan.nextInt();
		scan.close();
		switch(dayCode) {
			default : // else 와 같은 의미
			System.out.println("범위는 1~7 입니다.");
				break;
			case 1 : 
				System.out.println("월요일");
				break; // 브레이크가 없을 경우 case 를 스킵하고 화요일을 출력한다. 
			case 2 :
				System.out.println("화요일");
				break;
			case 3 :
				System.out.println("수요일");
				break;
			case 4 :
				System.out.println("목요일");
				break;
			case 5 :
				System.out.println("금요일");
				break;
			case 6 :
				System.out.println("토요일");
				break;
			case 7 :
				System.out.println("일요일"); // 최하단 일 경우 break; 를 입력하지 않아도 된다.							
		}
		
		
		System.out.println("종료.");
		// 위의 switch문을 if else if else로 바꿔보세요.
		
		
		if(dayCode == 1) {
			System.out.println("월요일");
		} else if(dayCode == 2) {
			System.out.println("화요일");
		} else if(dayCode == 3) {
			System.out.println("수요일");
		} else if(dayCode == 4) {
			System.out.println("목요일");
		} else if(dayCode == 5) {
			System.out.println("금요일");
		} else if(dayCode == 6) {
			System.out.println("토요일");
		} else if(dayCode == 7) {
			System.out.println("일요일");
		} else {
			System.out.println("범위는 1~7 입니다.");
		}
		
		System.out.println("종료.");
		
	}

}
