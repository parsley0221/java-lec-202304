// 컴파일 에러를 발생시키는 기초 문법
//1. 자바는 파일이름과 클래스 이름이 같아야합니다. ~~.java 와 class ~~ 
//2. 자바는 대소문자를 구분합니다.
// ex)  ab.java 와 class Ab 는 같지 않습니다.
// c계열의 언어는 대소문자를 구분합니다. 베이직계열은 구분하지 않습니다.
//3. { } 중괄호로 문단, 문장을 구분합니다.
//4. 자바의 문장의 끝은 ; 을 사용합니다.

public class JavaStructure {

	public static void main(String args[]) {
		//System.out.println("메롱");
		
		//System.out.println("메롱") <-- 오류
		// 문장의 끝에는 ; 이 필요해서 오류.
		
		System			
		.out // 세미클록 사용 시 <-- 에러 (문장이 중간에 끝났다)
		.println("메롱")		
		;
		
	}
}
