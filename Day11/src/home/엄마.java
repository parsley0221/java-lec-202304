package home;

//디폴트(아무 것도 입력하지 않았을 때)는 같은 폴더에서만 사용할 수 있다.

class 엄마 {
	
	public void sayMyName() { // 퍼블릭은 누구나 호출 할 수 있지만 행위는 객체보다 하위이기 때문에 
		                      // 엄마의 호출을 사용하려면, 엄마의 허락 없이는 사용할 수 없다.
		System.out.println("엄마 : 나는 영현이 엄마야.");
	}

}
