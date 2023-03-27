package ch01;

public class Cleaner implements Electronic220v{

	@Override
	public void connect() {
		
		System.out.println("청소기 연결 220v");
		
	}	
	// 전기를 연결하다라는 메서드를 만들거임

}
