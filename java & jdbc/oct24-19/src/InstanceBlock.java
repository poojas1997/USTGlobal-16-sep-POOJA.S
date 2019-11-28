
public class InstanceBlock {

	static int a;
	int b;
	 {
		a = 10;
		b = 20;
		System.out.println(" non static block 1");		// non Static block
	}
	

	
	public static void main(String[] args) {
		
		System.out.println("main started....");
		
		InstanceBlock i  = new InstanceBlock();
		InstanceBlock i1  = new InstanceBlock();


		System.out.println("a value "+a);
		System.out.println("main ends....");
	}
	
	 {
		a = 20;
		System.out.println(" non static block 2");		// non Static block
	}
	

	 {
		a = 30;
		System.out.println(" non static block 3");		// non Static block
	}
}


