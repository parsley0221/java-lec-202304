package staticexample;

public class WebApp {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		//-- 이걸 만나는 순간 JVM의 execute engine이 
		//-- Heap 영역에 데이터 할당
		counter.plusDynamicCounter();
		counter.plusDynamicCounter();
		counter.plusDynamicCounter();
		System.out.println(counter.dynamicCounter);
		//-- 3을 출력
		
		Counter counter2 = new Counter();
		System.out.println(counter2.dynamicCounter);
		// 다이나믹. 즉 동적 할당을 따로 받았기에 0으로 시작한다.
		
		
		//-- static 은 어디에 할당? (Method Area)
		
		Counter.plusStaticCounter(); // 정적 할당을 할 때는 프로그램이 실행될 때 한번만 메소드의 영역에 할당 되므로 
		Counter.plusStaticCounter(); // new(Heap 영역에 올리는 작업)을 하지 않는다.
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		System.out.println(Counter.staticCounter);
		
		
		
		
		
	}

}
