package inheritanceSingle;


public class Main {
	
	public static void main(String args[]) {
		
		/*	   Outcome:
		 *     Base: b1() & b2()
		 *     Child: b1() & c1()
		 *      
		 * */
		System.out.println("--------Base to Base--------");
		
		Single_Inh_Base b1 = new Single_Inh_Base(); //Base
		b1.b1();
		b1.b2();		
		
		System.out.println("--------Child to Base--------");
		Single_Inh_Base b2 = new Single_Inh_Child(); // upcasting --> base
		b2.b1(); //method overriding (runtime polymorphism / dynamic polymorphism)
		b2.b2(); // base
		
		//Single_Inh_Child c1 = new Single_Inh_Base(); //downcasting - Invalid
		System.out.println("--------Base to Child--------");
		Single_Inh_Child downcast= (Single_Inh_Child)b2;
		downcast.b1(); //method overriding (runtime polymorphism / dynamic polymorphism)
		downcast.b2();
		downcast.c1();
		
		System.out.println("--------Child to Child--------");
		Single_Inh_Child c2 = new Single_Inh_Child(); // base + child
		c2.b1(); //method overriding (runtime polymorphism / dynamic polymorphism)
		c2.b2(); //base
		c2.c1(); //child		
		
	}

}
