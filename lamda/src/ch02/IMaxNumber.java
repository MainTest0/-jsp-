package ch02;

@FunctionalInterface		// 얘 선언하면 제약이 걸려서 신입 개발자가 와서 건드릴려고 해도 못건드림
public interface IMaxNumber {
	
	// 두 수중 큰 수를 반환하는 인터페이스
	int getMax(int a, int b);
}
