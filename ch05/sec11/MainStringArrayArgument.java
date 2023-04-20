package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=3) {                          // 입력된 데이터 개수가 두개가 아닐 경우
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);                            // 프로그램 강제 종료
		}
		
		String strNum1 = args[0];                      // n번째 데이터 얻기
		String strNum2 = args[1];
		String strNum3 = args[2];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);          // 문자열을 정수로 변환
		int num3 = Integer.parseInt(strNum3);
		
		int result = num1 + num2 + num3;
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);

	}

}
