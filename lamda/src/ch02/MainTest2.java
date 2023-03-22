package ch02;

public class MainTest2 {

	public static void main(String[] args) {

//		new Thread().start();
		// 러너블은 인터페이스임
		// 이걸 익명 구현클래스로 만들기
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("i : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

		// 위코드와 아래코드는 같다. 타입추론이 가능하다.
		System.out.println("------------------------");
		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}).start();
	}

}
