package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); // ssn. 까지 작성했을 때 초록색 >> method
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
			break;                                  // 7번째 숫자(char(6))에 따라 남녀 구분
		}
			

	}

}
