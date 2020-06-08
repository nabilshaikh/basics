package inheritanceMultilevel;

public class MMain {
	
	public static void main (String args[]) {
/*		MChild2 child2 = new MChild2(); //all classes & methods
		MChild1 child1 = new MChild1(); // all Base & child1 methods	
		
		MBase base = new MBase(); // only base methods
		MBase base1 = new MChild1(); // only base methods
		MBase base2 = new MChild2(); // only base methods
*/		
	/*	MBase mbase = new MBase(); //Base
		
		MChild1 mchild1 = new MChild1(); //Base + Child1
		MBase mbase1 = new MChild1(); //Base		
		
		MChild2 mchild2 = new MChild2(); //Base + Child1 + Child2
		MBase mbase2 = new MChild2(); //Base
		
		MChild1 mchild3 = new MChild2(); //Base + Child1
		
		MChild2 mchild4 = (MChild2)mchild3;
		mchild4.b1();*/
		
		// MBase MChild1 MChild2
		System.out.println("--------Base to Base--------");
		MBase b2b = new MBase();
		b2b.b1();
		b2b.b2();
		
		System.out.println("--------child1 to Base--------");
		/*MBase c2b = MChild1();
		c2b.b1();
		c2b.b2();
		c2b.*/
		
		
	}
	

}
