package MultipleInheritance;


public class MultipleImplemented implements MultipleChild {

	@Override
	public void b1() {
		System.out.println("Base1");
		
	}

	@Override
	public void b2() {
		System.out.println("Base2");
		
	}

	@Override
	public void child() {
		System.out.println("Child");
		
	}
	
	public void extra() {
		System.out.println("Extra method");
	}

}
