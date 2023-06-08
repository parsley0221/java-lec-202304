package dyamond;

public class Son extends Father01, Father02{ // 상속(extends) 에서는 다중 상속 불가로 , 에 에러 메시지가 뜬다.
	
	//-- 클래스는 자바컴파일러단에서 다중 상속 ( extends x, y ) 시
	//-- 컴파일 에러를 발생시켜 원칙적으로 다중 상속 금지 ( 다이아몬드 상속 문제 )

}
