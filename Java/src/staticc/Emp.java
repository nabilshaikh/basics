package staticc;

public class Emp {
	
	int eid;
	int salary;
	static String ceo;
	
	static {      // static block will get called only once
				// static block will get executed before constructor bcoz class loads first and bcoz of sequence
		        // if we have multiple static block then only it will follow sequence
		
		ceo = "Larry";
		System.out.println("in static method");
	}
	 
	Emp(){		// constructor will get called 2 times
		eid = 1;
		salary = 1000;
		System.out.println("in emp constructor");
	}
	
	public void show() {
		System.out.println(eid +" : "+salary +" : " + ceo);
	}

}

/*
Remember - Static var are the variables that will remain same for all objects
	       Non-static variables are variables which are different for all objects
*/