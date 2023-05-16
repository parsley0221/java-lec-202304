import java.util.Arrays;

public class ArrayCopyExample {
	
	public static void main(String[] args) {
		
		//-- 배열 복사가 없을 때.
		int a[] = {1,2};
		int b[] = a;
		
		b[1] = 100;
		
		System.out.println("a[1] = " + a[1]);
		// 참조의 실제값은 heap 주소값에 있다.
		// 그러므로 x=y 로 복사하여 y를 변경하면 주소값 내부가 변경되어
		// x값도 같이 변경된다.
		
		
		// 독립적으로 복사하여 사용하려면?
		//-- 1. for 문을 활용한 복사
		int a1[] = {1,2,3};
		int b1[] = new int[a1.length];
		
		//for 복사
		for(int x = 0; x < a1.length; x ++) { // a1의 방개수 만큼 증감연산
			b1[x] = a1[x];
		}
		
		b1[1] = -1000;
		
		System.out.println("a1[1] = " + a1[1]);
		System.out.println("b1[1] = " + b1[1]);
		
		//-- 2. System.arrayCopy();
		int a2[] = {1,2,3};
		int b2[] = new int[a2.length]; 
		
		
		// arrayCopy 복사
		System.arraycopy(a2, 1, b2, 0, a2.length-1);
		// 복사할 원본, 원본 시작방, 붙여넣을 대상, 카피 시작방, 붙여넣을 길이
		System.out.println("arrayCopy로 복사");
		
		// 출력
		for(int x = 0; x < b2.length; x++) {
			System.out.println(b2[x]);
		}
		
		// 3.Arrays.copyOf 복사(null, 0)
		int a3[] = {1,2,3};
		int b3[] = null;
		
		System.out.println("Arrays.copyOf로 복사");
		b3 = Arrays.copyOf(a3, a3.length);
		for(int z = 0; z < b3.length; z++) {
			System.out.println(b3[z]);
		
		}
		
		//-- 4.향상된 for 문
		System.out.println("향상된 For문을 사용하여 배열 꺼내기");
		//-- for each 문 이라고도 한다		
		//-- 성능은 for 문(1.)이 좀 더 이득입니다.
		for (int val : b3) {
			System.out.println(val);
		}
		
		
	

	}
}
