package ch01;

public class MyHouse {

	public static void main(String[] args) {

		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		HairDriyer hairDriyer = new HairDriyer();
		TencoAdapter adapter = new TencoAdapter();
		connect(airConditioner);
		connect(cleaner);
		// 220v만 사용가능 100v를 사용하고 싶으면 애
	}// end of main

	// 전기 콘센트
	// MyHouse static 전기 콘센트
	public static void connect(Electronic220v electronic220v) {
		electronic220v.connect();
		
	}
	
}// end of class

