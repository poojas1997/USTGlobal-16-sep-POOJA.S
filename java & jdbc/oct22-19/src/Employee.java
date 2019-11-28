public class Employee {
	String name;
	int eid;

	public Employee(String ename , int eeid) {
		name = ename;
		eid = eeid;
	}
	
	void printDetails() {
		System.out.println("Employee name is " +name);
		System.out.println("Employee id is " +eid);
		System.out.println("__________________________");
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Pooja" , 55);
		e1.printDetails();
		Employee e2 = new Employee("Haseeb" , 25);
		e2.printDetails();
		Employee e3 = new Employee("Halima" , 22);
		e3.printDetails();
		
	}
}
