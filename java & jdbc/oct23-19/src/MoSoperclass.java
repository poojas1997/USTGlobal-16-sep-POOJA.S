
public class MoSoperclass {
	
	public void count() {
		System.out.println("count() of SuperClass");
	}

}

 class MoSubclass extends MoSoperclass{
	public void add() {
		System.out.println("add() of Subclass");
	}
	
	public void count() {
		System.out.println("count() of SubClass");
	}
}
