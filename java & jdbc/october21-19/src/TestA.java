
public class TestA {
	public static void main(String[] args) {

		Pen p = new Pen();

		p.cost = 100;
		p.brand = "Parker";
		p.color = "Black";

		System.out.println("cost is " +p.cost);
		System.out.println("brand is " +p.brand);
		System.out.println("color is " +p.color);

		p.write();

		System.out.println("***********************************");

		Van v = new Van();

		v.cost = 500000;
		v.color = "White";
		v.move();

		System.out.println("cost of van is "+v.cost);
		System.out.println("color of van is "+v.color);

		Van v1 = new Van();

		v1.cost = 300000;
		v1.color = "Royal Blue";

		System.out.println("cost of van is "+v1.cost);
		System.out.println("color of van is " +v1.color);


		v.move();
		
		System.out.println("***********************************");

	
		
		
	}
}
