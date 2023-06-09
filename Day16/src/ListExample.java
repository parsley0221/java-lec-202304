import java.util.*;

public class ListExample {

	public static void main(String[] agrs) {
		
		// 배열의 경우
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		
		List list = new ArrayList(); // new List(); // List는 인터페이스이기 때문에 에러
		
		
		// 배열과 다른 list에 집어 넣기
		list.add(10); // 인티저 래퍼 클래스로 오토 박싱된다.
		list.add(20);
		list.add(new String("이영현"));
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(new String("일영현"));
		list.add(new String("이영현"));
		// list. 입력시 오브젝트를 받는 걸 확인할 수 있다.
		
		System.out.println(list);
		//=System.out.println(list.toString()); 같은 뜻이다.
	
		// list 크기 구하기
		System.out.println("list.size() = " + list.size());
		
		// list에서 값 꺼내기.
		System.out.println("list[0] = " + list.get(0));
		
		System.out.println("==================");
	
		// 1. 배열처럼 값 전체 꺼내기
		for( int i = 0; i < list.size(); i++) {
			System.out.println("list[" + i + "] = " + list.get(i));
		}
	
		System.out.println("==================");
		
		// 2. 향상된 for 문
		for( Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("==================");
		
		Set set = new HashSet(); // 향상된 for 문만 사용할 수 있다. 1.문자 2.숫자 오름순 정렬된다.
		
		set.add(10);
		set.add(20);
		set.add(new String("이영현"));
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(new String("일영현"));
		set.add(new String("이영현"));
		
		System.out.println(set);
		
		System.out.println("==================");
		
		for( Object o1 : set) {
			System.out.println(o1);
		}
		
	}
}
