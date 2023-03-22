package ch01;

public class MainTest1 {

	/*
	 * 람다식(Lamda Expression) 함수형 프로그래밍 방식 : 자바8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라고 한다.
	 * 함수형 프로그래밍이란(Functional Programming, FP) : 말 그대로 함수를 기반으로하는 프로그래밍 입력 방식이고, 매개
	 * 변수로 전달받는 입력외에 외부자료 또는 데이터(변수라던지)를 사용하지 않아 여러 자료가 동시에 수행되는 병렬 처리 가능한 코딩 방식이다.
	 * 함수형 프로그램은 순수 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(Side Effect)을 주지 않도록 구현하는 방식이다.
	 */

	// 익명함수 -> 컴파일러가 타입 추론이 가능하기 때문에 코드를 줄여서 사용할 수 있는 개념으로 발전되었다.
	// 람다 표현식 -> 매개변수다음 화살표 함수 ()->{};
	// ()->{System.out.print("반가워 람다")};
	// x라는 값이 있다고 가정하자 화살표함수를통해 x를 구현부로 넘길 수 있다.
	// (x) ->{System.out.print(x+"<<<");}
	// 매개변수가 하나인 녀석은 괄호 생략 가능
	// x -> {};
	// 뒤에녀석도 생략 가능
	// x -> System.out.prin();
	// 전제조건
	// 람다식을 사용하기 위해서 반드시 선행되어야할 조건
	// 인터페이스가 먼저 만들어져 있어야한다.

	public static void main(String[] args) {

		// 1. 인터페이스가 있다.
		// 2. 어떻게 구현될지 식을 재정의한다. (람다 표현식으로)

		// int add(int x, int y);
		IAdd IAdd = (x, y) -> {
			return x + y;
		};
		System.out.println(IAdd.calc(10, 10));
		// 식을 간소화해서 간단하게 처리 가능

		// 람다표현식 만들기
		// 1. 인터페이스 먼저 정의 되어야 한다.

		// 람다식 재정의 하기
		IPrinter p = (a, b) -> {
			System.out.println(a + ":" + b);
		};
		// 람다식 활용하기
		p.myPrint("홍길동", "DDD");
		
		IPrinter2 print2 = () -> {return "반가워 람다";};
		String temp = print2.print();
		System.out.println(temp);
		
		// 람다식을 실행하기 위한 선행 조건
		// 1. 인터페이스가 있어야 한다.
		// 2. 인터페이 안에는 반드시 하나의 추상 메서드가 존재 해야한다.
		// 3. 1번과 2번 조건을 만족한다면 우리가 필요한 식을 정의할 수 있다.
		// 4. 3번에서 람다식을 정의하였다면 식을 정의할 때 사용한 인터페이스 타입을
		// 이용하고 그 안에 추상메서드 이름을 사용해서 호출해서 사용할 수 있다.
		
		System.out.println(IAdd.calc(10, 10));

	}

}

// 주의점
// 함수형 인터페이스라고한다. 인터페이스 안에 추상메서드는 반드시 한개여야 한다.
interface IPrinter {
	void myPrint(String str, String str2);
	
}

interface IPrinter2 {
	String print();

}