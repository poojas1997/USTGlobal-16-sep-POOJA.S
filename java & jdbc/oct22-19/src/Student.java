public class Student {
	String name;
	int classname;
	char section;
	int rollno;
	double percentage;

	void date() {
		System.out.println("Date() method");
	}

	public Student(String name , int classname , char section , int rollno , double percentage) {
		this.name = name;
		this.classname = classname;
		this.section = section;
		this.rollno = rollno;
		this.percentage = percentage;
		this.date();
	}

	void printOutput() {
		System.out.println("Name = " +name);
		System.out.println("Class = " +classname);
		System.out.println("Section = " +section);
		System.out.println("Roll no = " +rollno);
		System.out.println("Percentage = " +percentage);
		System.out.println("____________________________");
	}

	public static void main(String[] args) {



		Student s1 = new Student("Pooja" , 6 , 'A' , 55 , 82.15);
		s1.printOutput();

		Student s2 = new Student("Puneeth" , 10 , 'A' , 60 , 89.75);
		s2.printOutput();

		Student s3 = new Student("Priya" , 2 , 'B' , 57 , 85);
		s3.printOutput();

		Student s4 = new Student("Halima" , 7 , 'C' , 43 , 95.23);
		s4.printOutput();

		Student s5 = new Student("Haseeb" , 8, 'D' , 32 , 92.36);
		s5.printOutput();

		Student s6 = new Student("Amulya" , 4 , 'A' , 10 , 81.56);
		s6.printOutput();

		Student s7 = new Student("Bhargav" , 1  , 'A' , 15 , 92.56);
		s7.printOutput();

		Student s8 = new Student("Rachana" ,9 , 'B' , 65 , 87.15);
		s8.printOutput();

		Student s9 = new Student("Sinchana" , 8 , 'D' , 85 , 78.6);
		s9.printOutput();

		Student s10 = new Student("Sumukh" , 10 , 'C' , 78 , 91.35);
		s10.printOutput();
	}
}
