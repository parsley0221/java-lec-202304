package home;


// 클래스는 프로텍티드가 안 된다. 퍼블릭과 디폴트만 가능하다
public class 아빠 {
	
	//private int walletBalance = 30000; // 지갑에 들어있는 돈
	private int walletBalance = 30000; // 지갑에 들어있는 돈
	
	public void sayMyName( ) {
		System.out.println("아빠 : 난 영현이 아빠야.");
	}
	
	/*
	protected int 용돈주세요() {
		return 1000;
	}
	*/
	
	public int 용돈주세요() {
		
		if(walletBalance < 25000) {
			System.out.println("아빠 : 돈이 다 떨어졌다.");
			return 0;
		}
		int 용돈 = 1000;
		walletBalance -= 용돈;
		System.out.println("아빠 : 여기있다 용돈 " + 용돈 + "원");
		return 용돈;
	}
	
	
	protected int 돈내놔() {
		int 돈 = walletBalance;
		walletBalance = 0;
		return 돈; // 남은 돈 전부를 준다.
		
	}
	
	void 청소() { // 디폴트 이므로 같은 폴더만
		System.out.println("집안 청소 쓱싹쓱싹");
	}

}
