package ch01;

// 어택터 패턴

public class TencoAdapter implements Electronic220v{
	
	Electronic110v electronic110v;

	@Override
	public void connect() {
		System.out.println("110v연결");
	}


}
