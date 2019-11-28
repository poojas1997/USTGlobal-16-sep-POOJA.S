
public class Toyota  implements Automobile, AutomobileWithAbs{

	public int gear() {
		System.out.println("gear() method of toyota");
		return 20;
	}
	
	public void gps() {
		System.out.println("gps() method of toyota");
	}
	
	public void abs() {
		System.out.println("abs() method of toyota");
	}
}
