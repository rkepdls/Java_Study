package ch11.sec05;

public class ThrowsExample2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
}
