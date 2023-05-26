
public class ExtendsExample {
	
	public static void main(String[] args) {

		Parents parents = new Parents();
		parents.밥먹다();
		parents.담배를피다();
		
		Child child = new Child();
		child.밥먹다();
				
		Human human = new Parents();
		human.밥먹다(); // 휴먼 클래스에는 밥먹다라는 메서드가 있어서 가능
		//human.담배를피다();// 휴먼 클래스에는 담배를피다가 없어서 오류.
		((Parents)human).담배를피다(); // 휴먼 클래스를 패런츠 클래스로 형변환 캐스팅 해서 가능하다.
		
		Object object = new Child();
		//object.밥먹다(); // 오브젝트 클래스에는 밥먹다라는 메서드가 없기에 오류.
		((Human)object).밥먹다(); // 오브젝트 클래스를 휴먼 클래스로 형변환 캐스팅 해서 가능하다.
		
	}
}

class Human {
	int 입개수 = 1;
	int 눈개수 = 2;	
	void 밥먹다() {
		System.out.println("Human 밥먹다.");
	}
}

class Parents extends Human {	
	void 담배를피다() {
		System.out.println("인류 담배 지식 습득");
	}
}


class Child extends Parents {	
}

