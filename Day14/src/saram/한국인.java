package saram;

public class 한국인 extends 사람 
				  implements 아버지인터페이스, 직장인인터페이스 { // 추상 클래스와 똑같이 에러를 눌러 추상 메서드를 반드시 오버라이드(재정의(구현)) 해줘야 한다.

	String name = "";
	
	한국인(String name){
		this.name = name;
	}

	@Override
	void 배채우다() {
		System.out.println("한국인의 주식은 밥.");
	}

	@Override
	public void 아이와놀아주다() {
		// TODO Auto-generated method stub
		System.out.println("한국인 : 나는 재기차기하면서 놀아준다."); 
	}

	@Override
	public void 출근() {
		// TODO Auto-generated method stub
		System.out.println("7시 출근");
	}

	@Override
	public void 퇴근() {
		// TODO Auto-generated method stub
		System.out.println("4시 30분 퇴근");
	}
	
	
	
}
