package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printlength(String data) {
	int result = data.length();
	System.out.println("문자 수: "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printlength("ThisIsjava");
		printlength(null);
		System.out.println("[프로그램 종료]");
	}
}
