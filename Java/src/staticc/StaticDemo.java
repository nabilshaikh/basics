package staticc;

public class StaticDemo {
	
	public static void main(String[] args) {
		Emp navin = new Emp();
		navin.eid = 4;
		navin.salary = 4000;
		Emp.ceo = "Larry";
		
		Emp dhoni = new Emp();
		dhoni.eid = 5;
		dhoni.salary = 5000;
		Emp.ceo = "john";	
		
		navin.show();
		dhoni.show();
	}

}
