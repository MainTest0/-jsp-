package ch02;

public class MainTest1 {

	public static void main(String[] args) {

//		JButton button = new JButton();
		// 아래 코드랑 같은 형식

		IMaxNumber maxInt = new IMaxNumber() {
			@Override
			public int getMax(int a, int b) {
				if (a < b) {
					return a;
				}
				return b;
			}
		};
		
		IMaxNumber lamdaMaxInt = (x, y) -> {return x > y ? x : y;};
		System.out.println(lamdaMaxInt.getMax(50, 100));
		
		

	}// end of main

}// end of class

// 원래 우리가 썼던 방법
class MaxNumber implements IMaxNumber{

	@Override
	public int getMax(int a, int b) {
		
		return 0;
	}
	
	
}