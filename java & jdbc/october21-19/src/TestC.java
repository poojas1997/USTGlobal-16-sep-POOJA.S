
public class TestC {

	public static void main(String[] args) {

		Person p = new Person();

		p.name = "Pooja";
		p.age = 22;
		Person.color = "White";

		System.out.println("Name of Person is " +p.name);
		System.out.println("Color of person is " +Person.color);
		System.out.println("Age of Person is " +p.age);

		p.eat();
		Person.Sleep();
		p.walk();

		System.out.println("**************************************");
		
		Person p1 = new Person();

		
		
		p1.name = "Haseeb";
		p1.age = 28;
		Person.color = "White";

		System.out.println("Name of Person is " +p1.name);
		System.out.println("Color of person is " +Person.color);
		System.out.println("Age of Person is " +p1.age);

		p.eat();
		Person.Sleep();
		p.walk();
	}
}
