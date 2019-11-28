
public class Mobile {
public static void main(String[] args) {
	
	Android a = new Android();
	a.HomeScreen();
	
	System.out.println("============");
	
	Samsung s = new Samsung();
	s.HomeScreen();
	
	System.out.println("============");
	
	Oneplus o = new Oneplus();
	o.HomeScreen();
	System.out.println("=============");
	
	Redmi r = new Redmi();
	r.HomeScreen();
}
}
