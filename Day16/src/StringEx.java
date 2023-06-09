


public class StringEx {


	public static void main(String[] args) {
		
		String str1 = "이영현";
		String str2 = "만세";
		System.out.println("str1 = " + System.identityHashCode(str1));
		str1 = str1 + str2 + "메롱";
		System.out.println("str1 = " + System.identityHashCode(str1));
		System.out.println(str1);
		
		StringBuffer str3 = new StringBuffer("이영현");
		System.out.println("str3 = " + System.identityHashCode(str3));
		str3.append(str2).append("메롱");
		// str3.append("메롱");
		System.out.println("str3 = " + System.identityHashCode(str3));
		System.out.println(str3);
		System.out.println("str1 == str3 = " + (str1.equals(str3)));
		System.out.println("str1 == str3 = " + (str1.toString().equals(str3.toString())));
		System.out.println(str1.equals(str3));
	}
	
	
	
}
