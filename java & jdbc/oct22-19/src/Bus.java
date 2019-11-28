public class Bus {

	int seats;
	String color;

	Bus(int seats , String color){
		this.seats = seats;
		this.color = color;
	}

	Bus(){
		this(40);	//this() statement;
	}

	Bus(int seats){
		this(seats, "red");
	}
	
	void Print() {
		System.out.println("Welcome to " +color+ " bus , bus seat capacity is " +seats);
	}
	public static void main(String[] args) {
		
		Bus b1 = new Bus();
		b1.Print();
		
		Bus b2 = new Bus(50);
		b2.Print();
		
		Bus b3 = new Bus(60 ,"Green");
		b3.Print();
	}
}

