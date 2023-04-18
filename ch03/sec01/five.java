package ch03.sec01;

public class five {

	public static void main(String[] args) {
		//1부터 100의 범위에서 5의 배수만 출력, % 를 사용할 것
		
		for (int i=0; i<=100; i++)
			if(i%5==0 && i!=0)
				System.out.println(i);
		

	}

}

