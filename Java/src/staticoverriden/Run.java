package staticoverriden;

public class Run {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.voidParent();
		Child c = new Child();
		c.voidParent();

	}

}
