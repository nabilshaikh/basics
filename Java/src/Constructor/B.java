package Constructor;

public class B extends A{
	
	public B() {
		
		System.out.println("Inside child constructor");
	}
	
	public static void main (String args[])
	{
		B b = new B();
	}

}
