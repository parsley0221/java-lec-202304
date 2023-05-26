
public class SingletonExample {
	
	void get출근시간() {
		관리자 a = 관리자.getInstance();//new 관리자();
		a.출근시간알림();
		System.out.println(System.identityHashCode(a)); // 객체 해쉬코드 1694819250
	}
	
	void get퇴근시간() {
		관리자 b = 관리자.getInstance();//new 관리자();
		b.퇴근시간알림();
		System.out.println(System.identityHashCode(b)); // 객체 해쉬코드 1365202186 (new 생성자로 생성했을 때)
														// 각자 생성되어 매번 새로 heap 메모리에 올리게 된다.
														// 끝나면 삭제되어 다음에 또 불러오므로 낭비이다.
														// 35~40열에 추가된 방법으로 이 낭비를 없앨 수 있다.
	}
	
	public static void main(String[] args) {
		
		SingletonExample ex = new SingletonExample();
		ex.get출근시간();
		ex.get퇴근시간();
		
	}

}


class 관리자 {
	String name = "관리자";
	
	private static 관리자 obj; // 아무것도 적지 않으면 디폴트 접근자 이므로 관리자에서만 사용하기 위해 private 
	
	public static 관리자 getInstance() {
		if (obj == null) { // obj가 비어있을 때만 new 생성자를 실행해줘
		obj = new 관리자();
		}
		return obj; // 리턴을 했더니 obj가 비어있지 않게 되므로 생성자를 실행하지 않는다.
	}
	
	void 출근시간알림() {
		System.out.println("출근 시간은 9시입니다.");
	}
	
	void 퇴근시간알림() {
		System.out.println("퇴근 시간은 오후 6시입니다.");
	}
}