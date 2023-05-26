
public class ThisClass {
	
	void sayMyName() {
		System.out.println("나는 ThisClass야");
	}
	
	public static void main(String[] args) {
		
		//this.sayMyName(); 스태틱(정적) 영역에만 존재하고 있기 때문에 불러올 수 없어 오류가 난다.
		//sayMyName(); 위와 같다
		
		ThisClass tc = new ThisClass(); // new를 통해 heap 영역에 올려주고 
		tc.sayMyName(); // 이후 호출하면 호출이 된다.
		
		AClass a = new AClass("이영현", 32);
		a.introduceMySelf();
		
		AClass b = new AClass("만나이 영현", 31);
		b.introduceMySelf();
	}

}

class AClass {
	
	String name;
	int age;
	
	//-- 이 클래스의 생성자를 만듭니다.
	public AClass(String name, int age) {
		this.name = name; // 같은 변수를 컴퓨터는 구분할 수 없으니, 이 클래스의 name을 부를 때 사용
		this.age = age;
	}
	
	
	void introduceMySelf() {
		
		String name = "메롱";
		
		String message = 
				String.format("제 이름은 %s이고 제 나이는 %d입니다.", name, this.age);
		// %s 는 String 이고 %d는 십진수를 의미한다. name이 %s 에 들어가고, this.age 는 %d에 들어간다.
		// 이 안에 name = "메롱"; 이 있으니 this. 이 없으면 메롱이 들어간다. this. 를 넣으면 위의 이름들이 들어간다.
		// this는 heap 영역에 올라간 이후에만 사용할 수 있다.
		// 그러므로 static 메서드에서는 메서드에만 있어 아직 사용할 수 없다.
		System.out.println(message);
	}
	
	
	void test() {
		introduceMySelf();
		this.introduceMySelf();
	}
}