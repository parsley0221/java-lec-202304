package poly;

public class Factory {
	
	//데이터타입[] 변수명;
	사람[] workers = new 사람[10];
	int worker_cnt = 0;
	
	
	void 채용(사람 person) {
		System.out.println("채용을 진행합니다.");
		this.workers[worker_cnt++] = person;
	}
	
	
	void 생산하다() {
		System.out.println ("제품을 생산합니다.");
		for(int i = 0; i < worker_cnt; i ++) {
			workers[i].일하다(); 
		}
	}
	
}
