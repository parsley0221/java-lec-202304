
public class TypeCasting {
	
	
	public static void main(String args[]) {
		
		short x = 10; // 10은 int 이지만, 
		              // short의 범위 내 묵시적 형변환
		short y = (short)40000; // 범위 밖 명시적 형변환 (short)를 입력
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		// 결과값 -25536 / 명시적 형변환을 할때 값을 앞에서 부터 자른다.
		// 32767~-32768에서 앞부분 40000을 잘라낸 값이다. 
		// 32767+0(1)+7232=40000 / -32768+7232=-25536
		
	}


}
