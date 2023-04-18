package ch04.sec05;

import java.util.Scanner;

public class LoginTest01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cnt = 0;
		
		do {
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			if(id.equals("ezen")) {
				break;
			} else {
				System.out.println("아이디를 확인해주세요.");
				System.exit(0);
			} 
		} while(true);
		
		
		do {
			System.out.print("비밀번호: ");
			String pw = scanner.nextLine();
			if(pw.equals("12345")) {
				System.out.println("OK");
				break;
			} else {
				System.out.println("비밀번호를 확인해주세요.");
				cnt++;
			}
			if (cnt == 3) {
				System.out.println("Get Out!");
				break;
			} 
		} while(true);

	}

}
