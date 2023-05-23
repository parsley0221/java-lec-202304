


public class ConstructorExample {

	public static void main(String[] args) {
		
		Animal an1 = new Animal(); // 생성자도 행위이므로 호출하여 출력이된다.
		//an1.name = "고양이";
		an1.whoIam();
		
		Animal an2 = new Animal("바둑이");
		an2.whoIam();
		
		Animal an3 = new Animal("나비", "고양이");
		an3.whoIam();
		
		
	}
	
}
