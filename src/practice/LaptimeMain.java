package practice;

public class LaptimeMain {

	public static void main(String[] args) {
		Laptime lapt= new Laptime();
		
		lapt.driver();
		lapt.driverName();
		for(int i=0;i<lapt.driver.length;i++) {
			System.out.println(lapt.driver[i]);
		}
	}

}
