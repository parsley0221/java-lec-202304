package inter;

public interface Father01 extends GrandFather {

	//-- 소스 파일만 넘겨받았을 때 default 메서드를 사용할 수도 있다.
	//-- 인터페이스 내의 자세한 사양을 알 수 없고, 안내문만 받기에?
	
	
	default void eat() {
		System.out.println("Father01 밥 먹는다.");
	}
	
}
