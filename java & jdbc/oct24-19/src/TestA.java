
public class TestA {

	static int a;
	int b;
	static {
		a = 10;
		System.out.println("static block 1");		//Static block
	}
	
	TestA(){
		System.out.println("TestA() constructor");
	}
	
	public static void main(String[] args) {
		TestA t = new TestA();
		System.out.println("a value "+a);
	}
	
	static {
		a = 20;
		System.out.println("static block 2");		//Static block
	}
	

	static {
		a = 30;
		System.out.println("static block 3");		//Static block
	}
}
