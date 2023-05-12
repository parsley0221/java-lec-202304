
public class ArrayExample {
	
	public static void main(String[] args) {
		
		// 1. 선언과 공간 할당하는 법
		
		//-- 선언과 공간(방)할당을 따로따로
		//-- 배열을 선언
		int odd[];
		//-- 초기하 방법
		odd = new int[4]; // [방의 개수]
		//-- 선언과 동시에 초기화
		
		//-- 선언과 동시에 공간(방)할당을 만들어 주는 방식
		int odd2[] = new int[4];
		
		//2. 각 방에 값을 넣어주는 것
		odd2[0] = 1;
		odd2[1] = 3;
		odd2[2] = 5;
		odd2[3] = 7; // 방번호는 0부터 시작하여 할당번호-1 까지
		
		//3. 선언과 동시에 공간(방)할당 하고, 값까지 넣어주는 방법
		int odd3[] = {1,3,5,7};
		for(int i = 0; i < odd3.length; i++) {
			System.out.println(i + "번 방에는 " + odd3[i] + "이(가) 들어있습니다.");
		}		
		
		//!) 10개짜리 방을 만들고, 이 안에 홀수를 다 채우고 싶어요
		int[] odd4 = new int[10];
		int idx = 0; //-- 배열의 호실
		for(int x = 1; x <= 100; x++) {
			
			if(x % 2 != 1) {
				continue;
			}
			
			if(idx > 9) {
				break;
			}
			
			System.out.println
			("배열의 idx(호실) : " + idx + "(호실)에 " + x + "이(가) 들어있습니다");
			odd4[idx++] = x;
			
		}
				
	}

}
