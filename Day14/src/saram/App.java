package saram;

public class App {

	public static void main(String[] args) {
		
		한국인 person = new 한국인("이영현");
		직장 workplace = new 직장(person); // 한국인을 구현했을 때 직장인인터페이스를 구현했기 때문에 객체를 집어넣을 수 있다.
		                                 // 직장인인터페이스(타입) a(이름) = new 한국인(타입) 가능 
		집 home = new 집(person);  // " 아버지인터페이스 " 
		
		workplace.생활();
		home.생활();
		
		
		
		충청도인 ch = new 충청도인("이종석");
		// 1. 사람클래스에서 상속/재정의한 메서드인 배채우다() 
		// 메서드에 접근할 수 있는 가?    사람 : 부모의 부모
		ch.배채우다();
		
		// 2. 아버지 인터페이스(형제)의 아이와놀아주다(); 메서드가 상속되는가?
		ch.아이와놀아주다();
		
		// 3. 직장인 인터페이스(형제)의 출근(); 퇴근(); 메서드가 상속되는가?
		ch.출근();
		ch.퇴근();
		
		// 익명구현객체
		직장인인터페이스 worker = new 직장인인터페이스() { // ; 로 끝낼 경우 인터페이스는 구현할 수 없기때문에 에러가 뜬다 {}; 를 통해 임시 구현이 가능해진다.

			@Override
			public void 출근() {
				// TODO Auto-generated method stub
				System.out.println("임시 출근();");
			}

			@Override
			public void 퇴근() {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		worker.출근();
		
		
		// 한국인을 직장인으로 Casting 형변환을 하면.
		직장인인터페이스 worker1 = new 한국인("이영현2"); // 직장인은 부모나 형제를 채워놓지 않은 상태인 경우이다.
		
		worker1.출근();
		worker1.퇴근();
		
		((한국인)worker1).배채우다(); // 형변환을 해주지 않을 땐 실행할 수 없다.
		((아버지인터페이스)worker1).아이와놀아주다(); // 위와 같다.
		
	}
}

class 직장 {

	직장인인터페이스 worker; // has a 관계

	
	//-- 생성자
	직장(직장인인터페이스 worker) {
		this.worker = worker;
	}
	public void 생활() {
		worker.출근();
		worker.퇴근();
	}
}

class 집 {

	아버지인터페이스 father;
	
	집(아버지인터페이스 father){
		this.father = father;
	}
	public void 생활() {
		father.아이와놀아주다();
	}


}