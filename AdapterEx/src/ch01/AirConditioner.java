package ch01;

public class AirConditioner implements Electronic220v{

	@Override
	public void connect() {
		System.out.println("에어컨 콘솔 연결 on");
	}
	
	// 전기를 연결하다라는 메서드를 만들거임
	// 똑같은 기능이니까 표준 만들 수 있겠다 -> 인터페이스

}
