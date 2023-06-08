package inter;

public class Son implements Father01, Father02 {

	//-- 인터페이스는 다중 상속을 해도 추상 메서드를 상속받아 클래스 단계에서 구현하기 때문에 오류가 생기지 않는다.
	
	@Override
	public void sayMyName() {
		// TODO Auto-generated method stub
		System.out.println("이름이름");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		//Father01.super.eat();
		System.out.println("Son 이 먹는다.");
	}
	
	public void father01Eat() {
		//-- 인터페이스 Father01의 default 메서드인 eat()을 호출해보기
		Father01.super.eat();
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		son.eat();
		son.father01Eat();
	}

}
