package p3;

public class SpotLights {
	
	String firstPress  ="White";
	String secondPress = "Yellow";
	String thirdPress  = "blue";
	
	
	void   switchingLight(String p1) {
		firstPress = p1;
		System.out.println("First Time " + p1);
	}
	
	void switchingLight() {
		
		System.out.println(secondPress);
	}
	
	void switchingLight(String p1 ,String p2) {
		thirdPress = p2;
		System.out.println("Third Time" + p2);
	}

}
