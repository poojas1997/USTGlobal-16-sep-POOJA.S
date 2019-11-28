public class Constructor {
	
	Constructor() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("main Started....");
		Constructor C =	new Constructor(); 
		System.out.println("main Ended....");
	}
}
