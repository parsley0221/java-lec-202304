package ext;

import java.io.*;
//import java.lang.*; // System 같은 기본적인 클래스들이 있는 package 쓰지 않아도 자동으로 임포트 된 것으로 처리된다.
import java.util.*;

public class InputProgram {
	
	//try ~ catch 구문 없이 throw new 를 통한 exception 발생 시
	void merong() throws NotValidNumberException { // try ~ catch 를 하지 않았으므로 떠넘기기라도 해야한다.
		throw new NotValidNumberException("메롱");
		/*
		 * throw를 통해서 Exception을 실제로 발생시키는 코드가 있는 경우에는
		 * 이미 발생이 되었기 때문에
		 * try ~ catch를 통한 예외처리를 하거나
		 * throws를 통한 위임(떠넘기기)를 하거나
		 * 둘 중 하나는 반드시 해야한다.
		 */
	}

	//-- 사용자의 입력을 받을겁니다.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //-- 사용자의 입력을 받는 부분
		String name = "";
		int age = 0;

		System.out.print("이름을 입력해주세요 : ");
		name = input.next();
		
		//-- int(정수) 만 받을 수 있으므로 예외가 발생할 수 있는 곳
		try {
		System.out.print("나이를 입력해 주세요 : ");
		age = input.nextInt(); // 여기서 Exception(예외 처리)을 던지면,

		if(age > 100) {
			throw new NotValidNumberException("나이는 100이하로 입력해주세요.");
		}
		
		
		} catch(NullPointerException e2) {
			System.out.println("NullPointerException");
		} catch(Exception ex) {
			System.out.println("Exception 다 잡아");
			System.out.println("예외메세지 : " + ex.getMessage());
		} finally { // try catch 구문이 실행 시 반드시 한 번 실행된다.
			        // 올바른 값을 입력해도, 예외처리가 되어도 되지 않아 오류가 떠도 실행된다.
			System.out.println("finally 구문 실행");
		} /*catch(InputMismatchException e3) {
			System.out.println("InputMismatchException");
		 // 다형성에 의한 최상위 클래스에 있는 exception 입력시 전부 필터링 가능하다.
			                                       // 하지만, 어떤 오류인지 모르기때문에 메시지가 잘못 출력될 수 있다.
												   // 삭제된 아이디 생성 시 뜨는 메시지가 이런 것 일듯? 올바른 예외메시지를 출력하지 않는다.
												   //
		} */
		
		
		System.out.println("저는 " + name + "이고요, 나이는 " + age + "입니다.");
		
	}
}
