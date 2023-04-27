package ch09.sec07.exam01;

public class Car {
	//필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {

		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다. ");
		}
	};

	//메소드 (필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
			
	//메소드(로컬 변수 사용)
	public void run2() {
		//로컬 변수에 익명 자식 객체 대입. 클래스가 선언하고 닫았기에 중괄호 마지막에 ; 추가
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	//메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}