package ch11.sec02.exam02;

public class ExceotionalHandlingExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 글래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		System.out.println();
		try {
			Class.forName("Java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
