import java.util.Scanner;

// lotto 6/45
// lotto 6/x
// java ArrayLottoExample 1000
// ( 1 ~ 1000까지의 숫자 중 6개를 선택하는 로또 프로그램을 만듭니다. )
// 2번 x/y 예를 들면 java ArrayLottoExample 10 100
// 1-100까지의 수에서 10개를 뽑아서 출력하기

public class ArrayLottoExample02 {
	
	public static void main(String[] args) {
		//System.out.println(args[0]); // Run 하면 실제값이 없는데 0을 넣어 에러가 발생한다. run > config ... 해서 값을 넣어주면 출력된다.
		
		System.out.println
		("Lotto <뽑을개수> 입력해주세요.");
		
		Scanner scan = new Scanner(System.in);
		
		int pickCount = scan.nextInt();
				
		System.out.println
		("Lotto <최대숫자> 입력해주세요.");
		
		Scanner scan0 = new Scanner(System.in);
		
		int maxNum = scan0.nextInt();
		
		scan0.close();

		//-- 사용법 안내 통과 후 진행하는 곳

		int[] lotto = new int[pickCount]; // 로또는 N개를 추첨하기 때문
		
		
		//-- 로또번호 방에 넣기
		for(int y=0; y < lotto.length; y++) {
			// 랜덤한 값을 집어넣습니다.
			int num = (int)(Math.random() * maxNum) + 1; //ramdom 실수형이기때문에 (int) 변경을 해야 에러가 사라진다.
			// +1은 정수변환 될 때 0부터 시작되기 때문
			
			lotto[y] = num;
			
			
			
		}
		
		//-- 로또번호 출력하기
		System.out.println("생성된 로또번호");
		for(int y = 0; y < lotto.length; y++) {
			System.out.print(lotto[y] + "\t");
		}		
		
		System.out.println("\n" + "프로그램을 종료합니다.");
		
	}

}
