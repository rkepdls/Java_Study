package ch03.sec11;

public class Tese01 {

	public static void main(String[] args) {
		
		String a = "abc";              // 문자열은 컴퓨터가 배열로 인식
		String b = new String("abc");  // new 는 별도의 메모리 공간을 만들어라 하는 의미
		
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		
	
		
	}

}
