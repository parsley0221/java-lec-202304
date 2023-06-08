package ol;

public class 공군 extends 군대 {

	// int 복무기간 = 30; 도 가능하지만
	// --메서드 오버라이딩을 통해서
	// --부모 클래스의 복무기간출력(); 메서드를 '재정의'
	
	@Override
	void 복무기간출력() {
		System.out.println("우린 30개월");
	}
	
	@Override
	void 일하다() {
		System.out.println("새 쫒기");
	}
	
	void 일하다(String location) {
		System.out.println(location + "눈치우기");
	}
	
}
