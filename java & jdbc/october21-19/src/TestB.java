
public class TestB {
	public static void main(String[] args) {
		
		Cow c = new Cow();

		c.name = "Gowri";
		c.color = "Black & White";

		System.out.println("Name of cow is "+c.name);
		System.out.println("color of cow is "+c.color);

		c.eat();
		c.sleep();

		System.out.println("*************************");
		
		Cow c1 = new Cow();
		
		c1.name = "Thunga";
		c1.color = "black";
		
		System.out.println("Name of cow is "+c1.name);
		System.out.println("color of cow is "+c1.color);
		
		c1.eat();
		c1.sleep();
	}
}
