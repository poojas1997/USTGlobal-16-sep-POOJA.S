public class Person {
	String name;
	int age;

	public Person(String pname , int page) {	//Parameterized Constructor
		name = pname;
		age = page;
	}
	
	void printDetails() {
		System.out.println("Person name is " +name);
		System.out.println("Person age is " +age);
		System.out.println("__________________________");
	}

	public static void main(String[] args) {
		Person p1 = new Person("Puneeth" , 22);
		p1.printDetails();
		Person p2 = new Person("Sathya" , 55);
		p2.printDetails();
		Person p3 = new Person("Indira" , 49);
		p3.printDetails();
	}

}
