
public class Counter2 {
	
	int count = 0;
	static int count2 = 0;
	
	Counter2() {
		count ++;
		Counter2.count2++;
		System.out.println("동적 변수 count = " + count);
		System.out.println("정적 변수 count2 = " + count2);
	}
	
	public static void main(String[] args) {
		
		Counter2 a = new Counter2(); // 동적 영역은 각자 1, 1이 출력된다.
		Counter2 b = new Counter2(); // 정적 영역(static) 은 메소드에 저장되므로 1씩 증가하여 1, 2, 3, 4가 출력된다.
		Counter2 c = new Counter2();
		Counter2 d = new Counter2();
		
		
	}

}
