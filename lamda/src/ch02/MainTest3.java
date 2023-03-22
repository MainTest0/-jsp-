package ch02;

public class MainTest3 {

	public static void main(String[] args) {

		IMaxNumber maxNum = new IMaxNumber() {

			@Override
			public int getMax(int a, int b) {

				return a;

			}
		};
		
		maxNum = (x, y) -> {
			return x > y ? x : y;
		};

		System.out.println(maxNum.getMax(10, 30));

		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println("i : " +i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		System.out.println("+=========================");

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

	}// end of main

}// end of class
