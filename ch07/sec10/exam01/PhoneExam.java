package ch07.sec10.exam01;

public class PhoneExam {

	public static void main(String[] args) {
		//Phone phone = new Phone();   << 이걸 사용하지 않는다
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
