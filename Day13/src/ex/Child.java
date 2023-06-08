package ex;

public class Child extends Parent {
	
	public Child() {
		// 자식에서, 부모의 객체를 생성하는 코드를 넣으시면 됩니다.
		// new Parent("메롱"); <-- 오류
		super("이영현"); // <-- 내 부모의 객체 먼저 생성.
		// this <-- 자기자신
		System.out.println("Child 객체 생성.");
	}

	
	void 밥먹다() {
		//부모님밥먹다();
		//this.부모님밥먹다();
		System.out.println("자식이 밥을 먹다.");
	}
	
	
	//-- Parent 객체의 밥먹다(); 메소드를 호출해야합니다.
	void 부모님밥먹다() {
		super.밥먹다();
	}
	
	
}
