package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		// 기본 정수값을 래퍼클래스로 감쌌다		
		Integer num = new Integer(20);		// 박싱

		// 자동 언박싱 ( 오토 언박싱)
		int n = num;
		
		// 원래 이렇게까지 써야 언박싱 됨
		int n1 = num.intValue();
		
		System.out.println("============================");
		
		// 자동 박싱
		Integer num2 = 30;
		
		// 자동 언박싱
		int result = num2;
		
		
		
	}// end of main

}// end of class
