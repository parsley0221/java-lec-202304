import java.util.*;


public class MapExample {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put("key", "value");
		map.put("name", "이영현");
		map.put("age", new Integer(32));
		map.put("char", '1');		
		
		System.out.println(map.get("name"));
		
		System.out.println(map.containsKey("name"));
		System.out.println(map.containsKey("name2"));		
		
		
		//-- 모든 키를 꺼내보자
		Set mapKeys = map.keySet();
		
		for(Object o : mapKeys) {
			System.out.println(o + " = " + map.get(o.toString())); // map.get(x) x를 키로하는 밸류를 리턴한다.
						
		}
		
		// key = value
		// name = 이영현
		// age = 14
		// char = 1		
		
		List<Map> dataList = new ArrayList<Map>();
		
		Map row1 = new HashMap();
		row1.put("name", "이");
		row1.put("age", "32");
		row1.put("grade", "1");
		
		Map row2 = new HashMap();
		row2.put("name", "이");
		row2.put("age", "60");
		row2.put("grade", "2");
		
		dataList.add(row1);
		dataList.add(row2);		
			
		System.out.println("이름 \t나이 \t학년");
		for(Object val : dataList) { //-- 리스트 꺼내기
			//-- Map 꺼내기
			Map tmp = (Map)val;
			System.out.print(tmp.get("name") + "\t");
			System.out.print(tmp.get("age") + "\t");
			System.out.print(tmp.get("grade") + "\t\n");
			
		}
		
	}		
	
}
