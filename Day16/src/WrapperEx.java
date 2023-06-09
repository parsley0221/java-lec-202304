
public class WrapperEx {

	public static void main(String[] args) {
		Integer i1 = new Integer(10); // 명시적으로 Boxing ( deprecated ) 앞으로 쓰지 말라는 의미의 취소선이 생긴다. 후에 지원되지 않음.
		Integer i2 = Integer.valueOf(10); // 명시적 Boxing
		Integer i3 = Integer.valueOf("100"); // 명시적 Boxing
		Integer i4 = 10; // Auto Boxing 자동으로 객체로 변환이 된다.
		Integer i5 = new Integer(10);
		Integer i6 = 10;
		
		System.out.println("i1 == i5 = " + (i1 == i5)); // Wrapping Class 사용할 땐 equals를 사용해야 같은 값을 확인할 수 있다.
		System.out.println("i4 == i6 = " + (i4 == i6)); // 상수 pool 에 들어있기 때문에 ture
		System.out.println(i4.equals(10));
		
		// Wrapping Class의 상수들
		// 벨류들
		
		System.out.print("Short의 범위 : ");
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		
		Double db = Double.valueOf("1.999");
		
		System.out.println(i1);
		
		System.out.println("i6 + 10 = " + (i6 + 10)); // auto unboxing
		
	}
	
	
}
