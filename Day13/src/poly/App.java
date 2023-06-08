package poly;

public class App {

	public static void main(String[] args) {
		
		// 1. 공장을 만들고
		Factory f = new Factory();
		
		// 2. 채용을 함.
		/*f.채용(new 사람("이영현"));
		f.채용(new 사람("영현"));
		f.채용(new 사람("현"));
		f.채용(new 사람("이영")); */
		
		f.채용(new 생산직("이영현", "설계"));
		f.채용(new 생산직("영현", "조립"));
		f.채용(new 생산직("현", "QC"));
		f.채용(new 생산직("이영", "상품화"));
		
		// 3. 일을 시키자
		f.생산하다();
		
		
	}



}
