package ch01;

public class MainTest2 {

	public static void main(String[] args) {

		String str = "-128";
		String str2 = "10.5";
		String str3 = "true";
		// 문자열 데이터 타입에서 기본 데이터 타입으로 변환하는 방법을 알아야한다.
		// 래퍼클래스란 개념을 알고 있으면 된다.
		
		// 문자를 형변환 하기
		// 10을 2진수로 1010인데 4비트라서 byte에 들어가짐
		// -128~127까지 들어가짐
		byte b = Byte.parseByte(str);
		System.out.println(str);
		
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		float f = Float.parseFloat(str2);
		System.out.println(f);
		
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
		System.out.println(!bool);

		
		int num = 10;
		// 자동 언박싱
		Integer n1 = num;
		System.out.println(n1);
		Integer num2 = 20;
		int n2 = num2;
		System.out.println(n2);
		
		
	}// end of class

}// end of main
