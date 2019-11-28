public class Btm1 {
	public static void main(String[] args) {
		Btm b = new Btm();
		b.swipe();
		
		int count = b.getCount();
		System.out.println("Count is "+count);
		
		int totalcount = b.getTotalcount();
		System.out.println("Total count is "+totalcount);
	}
}