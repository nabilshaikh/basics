package interfacee;

public interface Animal {
	
	public void sound();
	
	public default void base1() {
		System.out.println("inside interface1");
	}
	
	public default void base2() {
		System.out.println("inside interface2");
	}

}
