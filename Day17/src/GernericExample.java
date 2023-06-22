
import java.util.*;

public class GernericExample {

	public static void main(String[] args) {
		
		// List list = new ArrayList(); Object 타입을 받으므로 예외의 가능성 존재 ex) "a" 
		List<Integer> list = new ArrayList<Integer>(); 
		// Integer 객체만 받는 List로 선언합니다.
		//list.add("1"); // String 이기에 에러
		//list.add("a"); // 위와 같음
		list.add(1);
		list.add(20);
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		Map<String, Integer> pointMap = new HashMap<String, Integer>();
		pointMap.put("name", 1); // "name", "이영현" 로 적을 시 두번째가 인티져가 아니라 에러
		
		List<Map<String, Integer>> dataList
			= new ArrayList<Map<String, Integer>>();
	}


}
