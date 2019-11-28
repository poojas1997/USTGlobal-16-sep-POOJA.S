
public class FinalGen {

	public static void main(String[] args) {
		
		FirstGen f = new FirstGen();
		f.call();
		f.msg();
		
		System.out.println("**********************");
		
		SecGen s = new SecGen();
		s.call();
		s.games();
		s.msg();
		
		System.out.println("**************************");
		
		ThirdGen t = new ThirdGen();
		t.call();
		t.camera();
		t.msg();
		t.games();
	}
}
