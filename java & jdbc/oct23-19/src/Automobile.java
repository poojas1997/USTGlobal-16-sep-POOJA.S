
public interface Automobile {

	int left = 10;	//by default it is public , static & final.
	public static final int right = 20;
	
	public int gear();		// by default it is abstract.
	public void gps();
	
	public static void add() {
		
	}
	
	public default void sum() {
		
	}
}
