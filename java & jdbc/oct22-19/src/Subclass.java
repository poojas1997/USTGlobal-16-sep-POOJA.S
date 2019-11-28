
public class Subclass extends Superclass{
	String s = "Sub class variable";

	Subclass(){
		super();
		System.out.println("Sub class constructor");
	}

	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*************************");
		super.superClassMethod();
		superClassMethod();
	}
}