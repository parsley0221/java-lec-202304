// 다차원 배열
public class MultipleArrayExample {
	
	public static void main(String[] args) {
		// 1.	1차원 배열
		// 1-1. 1차원 배열 선언
		int[] a;
		// 1-2. 선언과 (빈)방 만들기
		int[] a1 = new int[3]; // 방 3개짜리 1층 집
		// 1-3. 선언과 동시에 방 갯수 + 값까지 채우기
		int[] a2 = {1,2,3};
		// 1-4. for 문을 이용하여 전체 출력
		for(int x = 0; x < a2.length; x++) {
			System.out.println(" a2 = " + a2[x]);
		}
		
		// 2.	2차원 배열
		// 2-1. 2차원 배열 선언
		int[][] b; // [층][방]
		// 2-2. 선언과 (빈)방 만들기
		int[][] b1 = new int[2][3]; // 방 3개짜리 2층 집
		// 2-3. 선언과 동시에 방 갯수 + 값까지 채우기
		int[][] b2 = {
						{1,2,3} , // 1층에 방 3개 0층 0,1,2호실
						{4,5,6}	  // 2층에 방 3개 1층 0,1,2호실
					 };
		// 2-4. for 문을 이용하여 전체 출력 (2개를 이용)
		System.out.println("2차원 배열 출력하기");
		for(int y = 0; y < b2.length; y++) { 	 // 층 
			for(int z = 0; z < b2[y].length; z++) { // 방
				System.out.println(b2[y][z]);
			}
		}		
		
	}

}
