package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;                             // while문의 조건식을 위한 변수 선언
		int speed = 0;
		
		while(run) {
		System.out.println("-----------------------");
		System.out.println("1. 증속 | 2. 감속 | 3. 중지");  // 메뉴 생성
		System.out.println("-----------------------");
		System.out.print("선택: ");
		
		String strNum = scanner.nextLine();             // 키보드에서 입력한 내용을 읽음
		
		if(strNum.equals("1")) {
			speed++;
			System.out.println("현재 속도 = " + speed);
		} else if(strNum.equals("2")) {
			speed--;
			System.out.println("현재 속도 = " + speed);
		} else if(strNum.equals("3")) {
			run = false;                                // while문의 조건식을 false로 만듦
		}
	}

		System.out.println("프로그램 종료");
	}

}
