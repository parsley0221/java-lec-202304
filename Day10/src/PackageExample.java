//import day10.pet.Dog;
import day10.pet.*;
import day10.pet2.*;
// 애완동물들
 
// 패키지명 규칙 korea.co.kr
// kr.co.korea.pet
// kr.co.korea.config

public class PackageExample {
	
	public static void main(String args[]) {
		
		//Cat cat1 = new Cat(); 임포트 폴더명이 중첩되어 오류 pet과 pet2에 같은 이름
		//Dog dog3 = new Dog(); 위와 같다
		
		day10.pet.Dog dog1 = new day10.pet.Dog();
		// 너무 쓸 게 많아서 귀찮을 때 사용하는 방법 import
		
		//dog3.sayMyName();
		
		dog1.sayMyName();
		
		day10.pet2.Dog dog2 = new day10.pet2.Dog();
		dog2.sayMyName();
		
	}

}
