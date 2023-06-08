package military;

public class 공군 extends 군대 { // 군대 클래스에 있는 복무기간 출력이라는 추상 메서드는 반드시 구현해야한다. 에러 클릭시 자동으로 작성

	// 추상 메서드가 아닌 일반 메서드 어디소속은
	// 재정의를 해도, 하지 않아도 자유.
	@Override
	void 어디소속() {
		System.out.println("공군 91전대 소속");	
	}
	
	
	// 추상 메서드는 자식 클래스에서 반드시 재정의 해야한다. 하지 않으면 컴파일 할 수 없다.
	@Override
	void 복무기간출력() { // 장점은 자식 클래스에서 값이 달라지는 경우가 많을 때
					  // 추상 메서드 선언을 통해 값 입력을 강제할 수 있다.
					  // 복무기간은 육, 해, 공이 다르기 때문에 좋은 례이다.
		// TODO Auto-generated method stub
		System.out.println("공군은 30개월");
	} 

}
