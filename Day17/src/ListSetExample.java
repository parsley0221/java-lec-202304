import java.util.*;

public class ListSetExample {

	public static void main(String[] args) {
		
		// 1. List
		// a. 리스트 생성
		List list = new ArrayList();

		// b. 리스트에 값 넣기
		list.add(9);
		for(int i = 8; i > 0; i --) {
			list.add(i);
		}
	
		// c. 리스트 값 확인
		System.out.println(list);
		list.add(3, 100); // 3번 방에 100을 채우고 싶어요. 
		System.out.println(list); // 3번 방에 100이 들어가고 이후 한 칸씩 밀린다. 총 9개의 방에서 10개의 방으로
		
		// d. 리스트에서 값을 꺼내는 방법
		// d-1 : for()문 사용  // 속도는 가장 빠르다
		// d-2 : 향상된 for문
		// d-3 : iterator
		// d-4 : stream api
		
		// d-1
		for( int i = 0; i > list.size(); ) {// 배열에서 lenth 가 리스트에서 size
			System.out.println(list.get(i));
		}
		
		// d-2 foreach 문
		for( Object o : list) { // 끝날 때까지 첫칸부터 채우고 출력 > 두번째 채우고 출력을 반복한다.
			System.out.println(o);
		}
		
		// d-3 iterator
		Iterator it = list.iterator();
		while (it.hasNext()) { // it.hasNext가 트루일 때까지 돌린다.
			System.out.print(it.next()); //-- 값을 꺼내고 포인터 한 칸 이동 // 이게 없으면 무한 출력이 된다.
			it.remove();
		}
		
		System.out.println("");
		System.out.println(list);
		
		
		// z. 리스트 비우기
		list.clear();
		System.out.println(list);
		
		
		
		
	}

}
