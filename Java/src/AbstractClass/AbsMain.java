package AbstractClass;

public class AbsMain {
	
	public static void main(String args[]) {
		
		ConcreteClass cc = new ConcreteClass(); //contains methods from base & cc
		AbsBase ab = new ConcreteClass(); //only base methods
		ab.company();
		
		
		
	}

}
