package acc;
import acc.data.Parent;

public class AccChild extends Parent{

	public AccChild() {
		
		this.publicName = "이영현"; // 접근 가능/상속 받음
		this.defaultName = "이영현"; // 접근 불가능/상속 x(에러)
		this.protectedName = "이영현"; // 접근 가능/상속 받음
		//this.privateName = "이영현"; // 접근 불가능/상속 x(에러)
		
	}
		
}

//-- 상속에서 접근제한자
// 1.public 은 모두 상속 받음 (제한 없음)
// 2.private 는 모두 상속x (제한 없음)

// if(같은 패키지 == true) {
// 3.default / protected 상속 가능
// } else { //-- 다른 패키지 일 때
// 3. default 상속 불가
// 4. protected 상속 가능
//}