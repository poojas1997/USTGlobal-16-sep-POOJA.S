
public class TestCalci {
	public static void main(String[] args) {
		
		Calculator C = new Calculator();
		C.add();
		C.mul();
		
		System.out.println("***********************************");
		
		
		ScientificCalculator sc = new ScientificCalculator();
		sc.add();
		sc.mul();
		sc.Sin();
		sc.Cos();
		
	}

}
