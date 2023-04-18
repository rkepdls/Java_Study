package ch03.sec01;

public class flow {

	public static void main(String[] args) {
		
		final byte max = 127;
		final byte min = -128;          // 기호상수
		final String RED = "#ff0000";   // max min는 if에 묶어야 적용된다
		byte i = 17;
		System.out.println(i);
		
		i = 127;
		System.out.println(i);
		
		i = -128;
		System.out.println(i);
		
		

	}

}
