package ch05.sec09;

public class ArrTest_02 {

	public static void main(String[] args) {
		int count = 0;
		int[] arr = new int[6];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				arr[count] = j;
				count++;
			}
		}

	}

}
