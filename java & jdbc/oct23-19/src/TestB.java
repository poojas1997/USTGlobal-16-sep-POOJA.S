
final public class TestB extends Student {
	
	void add() {

	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Pooja" , 13 , 123);
		s1.printDetails();
		
		Student s2 = new Student("Sahana" , 65 , 123);
		s2.printDetails("Sana");
		
		TestB t = new TestB();
		t.printDetails("Haseeb");
	}
}
