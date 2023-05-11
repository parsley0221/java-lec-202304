/*
 * 
 * 1. if
 * 2. if else
 * 3. if else if
 * 
 */


public class Control01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		// 1. if
		int age = 39;
		age = 70;
		
		System.out.println("신청자 나이 : " + age);
		
		System.out.println("심사중......");
		Thread.sleep(2000);
		
		
		// 청년저축가입 나이 제한		
		if(age < 40) {
			System.out.println("청년 저축 가입 가능합니다.");
		}
		
		
		// 청년저축 가입 나이는 19세 이상이고(and = &&), 39세 이하인 사람만
		// 가입할 수 있다.
		// 사람은 19 <= age <= 39 이지만, 컴퓨터는 2항만 있어야한다.
		// age >= 19 && age <= 39
		
		
		if (age >= 19 && age <= 39 ) {
			System.out.println("19세 이상, 39세 이하인 분이시군요.");
			System.out.println("진행시켜");
		}
		
		if (age < 19 || age > 39 ) {
		     System.out.println("자네는 가입대상이 아니오.");
		}
		
		// if ~ else
		Thread.sleep(2000);
		
		if(age >= 19 && age <= 39) { // 조건식이 참이면 실행
			System.out.println("나이 : " + age);
			System.out.println("진행시켜.");			
		} else { // 조건식이 거짓이면 실행
			System.out.println("돌아가시오.");
		}
		
		// if ~ (else if) ~ (else)
		// 19세 이상, 39세 이하 = 청년저축 대상자
		// 40세 이상, 60세 이하 = 중장년 카운셀링 대상자
		
		if(age >= 19 && age <= 39) {
			System.out.println("청년저축 대상자입니다.");
		} else if(age >= 40 && age <= 60) {
			System.out.println("중장년 카운셀링 대상자입니다.");			
		} else {
			System.out.println("19세 미만, 61세 이상에 해당하는 혜택이 없습니다.");
		}
		
		
		System.out.println("프로그램 종료.");
		
		
		
	}

}
