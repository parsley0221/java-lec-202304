
public class GenExample {

	public static void main(String[] args) {
		
		StudentA<String, Integer> stdA 
		= new StudentA<String, Integer>();
	
		stdA.set("name", 100);
		//stdA,set("name","100"); // 뒤에 인티져가 아니라서 에러
		
		System.out.println(stdA.getKey() + "\t" +  stdA.getValue());
		stdA.isObject(new String("a")); // Object 타입으로 쓰는 거랑 같아
		// isObjecr(Object t1)
		stdA.<Integer>isObject(1);
		
		
		Genesis<? extends Gen2> genesis = new Genesis<Gen2>(); // ? extends Gen2  << Gen2의 상속을 받은 무언가를 Gen2와 Gen3
		genesis.getObj(); // 내가 제일 조상이니까 Gen2
		
		Genesis<? extends Gen2> genesis1 = new Genesis<Gen3>(); // Gen2의 상속을 받았으니 가능
		genesis1.getObj(); // 모든 클래스의 조상은 오브젝트
		
		// Genesis<? extends Gen2> genesis = new Genesis<Gen1>(); // 상속 받은 것이 아니므로 에러
		Genesis<? super Gen2> genesis2 = new Genesis<Gen2>(); // ? super Gen2 << Gen2에게 상속한 무언가 Gen2와 Gen1
		Genesis<? super Gen2> genesis3 = new Genesis<Gen1>(); // Gen1은 상속해주었으니 가능
		// Genesis<? super Gen2> genesis2 = new Genesis<Gen3>(); // 상속해준 것이 아니므로 에러
		
	}


}

class StudentA <K,V> { // K = Key, V = Value 상관없지만 규율
	
	K key;
	V value;
	
	void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	K getKey() { return this.key; }
	V getValue() { return this.value; }
	
	// 메서드에서도 사용 가능
	public <T> boolean isObject(T t1) { // <T> 인자의 데이터를 클래스로 받겠다? T = Type 클래스
		System.out.println(t1.toString());
		return false;
	}
	
}


class Gen1 {
	void sayMyName() {		
	}
}
class Gen2 extends Gen1 {
	void sayMyName() {		
	}	
}
class Gen3 extends Gen2 {
	void sayMyName() {		
	}	
}

class Genesis<T>{
	T obj;
	T getObj() {
		return this.obj;
	}
}