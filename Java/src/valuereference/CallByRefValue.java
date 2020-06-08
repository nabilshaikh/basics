package valuereference;

public class CallByRefValue {
	
	 int p; 
	 int q;
	 
	public static void main(String[] args) {
		
		CallByRefValue obj = new CallByRefValue();
		int x = 10; int y = 20; 
		System.out.println("original value of x: "+x); 
		System.out.println("original value of y: "+y); 
		obj.Sum(x,  y); 
		System.out.println("After modifying value of x: "+ x); // Remain unchanged in case of call by value 
		System.out.println("After modifying value of y: "+ y); 
		System.out.println("*********Call by reference*******************/"); 
		obj.p = 50; obj.q = 60; 
		System.out.println("original value of p: "+ obj.p); 
		System.out.println("original value of q: "+ obj.q); 
		obj.test(obj); 
		System.out.println("After modifying value of p: "+obj.p); 
		System.out.println("After modifying value of q: "+obj.q); 
		
	} 
	
	public void Sum(int x, int y)
	{   //Call by value method    
		x=x+10; // here x and y is local to Sum() method 
		y=y+10; //Not same one declared in main() method		
	} 
	public void test(CallByRefValue t)
	{ 	//Call by reference
		t.p = t.p+10; 
		t.q = t.q+10;
	}

}
