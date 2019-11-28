
public class Student1 {
	public static void main(String[] args) {
		
		Student.clgname = "Ghousia College Of Engineering";
		
		Student s = new Student();
		s.usn = 55;
		s.name = "Pooja S";
		
		System.out.println("Collge name is "+Student.clgname);
		System.out.println("Name of student is "+s.name);
		System.out.println("USN is "+s.usn);
		
		s.read();
		
	}

}
