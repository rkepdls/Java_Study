package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		//ok버튼 객체 생성
		Button btnOk = new Button();
		
		//ok버튼 객체에 람다식 주입
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		//ok버튼 클릭하기
		btnOk.click();
		
		//cancle 버튼 객체에 람다식 주입
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		//cancel버튼 클릭하기
		btnCancel.click();
	}
}
