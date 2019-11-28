public class Employee2 {

	String name;
	int eid;
	long Aadharno;

	Employee2(String name , int eid , long Aadharno){
		this.name =  name;
		this.eid = eid;				//this keyword;
		this.Aadharno = Aadharno;
	}

	Employee2(String name ,  int eid){
		this.name = name;
		this.eid = eid;
	}


	Employee2(int eid  ,  String name){
		this.eid = eid;
		this.name = name;
	}
	void Print() {
		System.out.println("Hi " +name+ " Welcome to UST Global company");
		System.out.println("your id = " +eid);

	}

	public static void main(String[] args) {

		Employee2 e1 = new Employee2(  65 , "sahana");
		e1.Print();

		Employee2 e2 = new Employee2("Pooja" , 100 , 456765676236l);
		e2.Print();

		Employee2 e3 = new Employee2("Divya" , 50);
		e3.Print();
	}
}
