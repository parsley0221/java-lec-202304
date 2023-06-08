package poly;

public class 생산직 extends 사람 {
	
	String part; // 일하는 파트
	
	생산직(String name, String part) {
		this.name = name;  // 부모클래스인 사람에게서 상속
		this.part = part;
	}
	
	
	@Override
	public void 일하다() {
		System.out.println(name + "님은 " + part + " 실행");
		//System.out.println("생산하다.");
	}
	

}
