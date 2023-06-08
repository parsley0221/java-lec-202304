package military;

public abstract class 군대 { // abstract 는 추상클래스
	
	int 복무기간 = 26;

	void 어디소속() { // 모두 추상 메서드로 되어있지는 않고 일반 메서드도 있다.
		System.out.println("군대소속");
	}
	
    abstract void 복무기간출력(); // 추상 메서드가 하나라도 있다면 추상 클래스

}
