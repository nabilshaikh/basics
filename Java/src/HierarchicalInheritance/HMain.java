package HierarchicalInheritance;


public class HMain {
	
public static void main (String args[]) {
		
		HChild3 child3 = new HChild3();// base & child3		
		HChild2 child2 = new HChild2(); //base & child2	
		HChild1 child1 = new HChild1(); // base & child1
		
		HBase base = new HBase(); // only base methods
		HBase base1 = new HChild1(); // only base methods
		HBase base2 = new HChild2(); // only base methods
		
	}

}
