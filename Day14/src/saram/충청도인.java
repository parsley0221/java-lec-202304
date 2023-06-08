package saram;

public class 충청도인 extends 한국인 {

	
	//-- 한국인 클래스에 default 생성자인 한국인()이 없기 때문에
	//-- super() 생성자를 사용해서 부모객체 먼저 선언해야 한다.
	충청도인(String name) { // 이름없이 생성된 부모클래스를 호출할 때는 슈퍼(상속을 의미)로 재정의 해줘야한다.
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
