package ol;

public class App {

	public static void main(String[] args) {

		공군 airforce = new 공군();
		airforce.복무기간출력(); // 오버라이딩
		airforce.일하다(); // 오버라이딩
		airforce.일하다("격납고에서 "); // 오버로딩

		
		// ((군대)airforce).복무기간출력(); 오버라이딩이 되어 30개월로 출력된다.
		
		육군 army = new 육군();
		army.복무기간출력(); // 오버라이딩 없이 부모객체의 복무기간
						 // 이 출력
		
	}

}
