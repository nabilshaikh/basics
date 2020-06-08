package array;

public class IfinsideFor2 {

	public static void main(String[] args) {
		
		System.out.println("---------1----------");
		
		String[] a={"cloud","tiger","lion"};
	    String input="cloudd";
	    for(int i=0;i<a.length;i++){
	        if(input.equals(a[i])){
	            System.out.println("exists");
	        }
	        else{
	            System.out.println("Not in the option");
	        }
	    }
	    
	    System.out.println("---------2----------");
	    
	    folLoopLabel : for(int i=0;i<a.length;i++){  
	         if(input.equals(a[i])){  
	             System.out.println("exists");  
	               break folLoopLabel;
	         }  
	         else{  
	             System.out.println("Not in the option");  
	         }  
	     }
	    
	    System.out.println("---------3. using input string----------");
	    boolean found = false;
	    for (int i = 0; !found && i < a.length; i++)
	    {
	       found = a[i].equals(input);
	    }
	    System.out.println(found ? "Found" : "Not in  this array");
	    
	    
	    
	    System.out.println("----------OR using input array----------");
	    int[] intarray = {1,2,3,4,5};
		int userinput = 5;
		boolean found1 = false;
		for (int i=0; i<intarray.length && !found1; i++){
			found1 = intarray[i]== userinput;			
		}
		System.out.println(found1 ? "Found" : "not found");
		
		
		int[] array = {1,2,3,4,5};
		int userkainput = 2; 
		int index = -1;
		for (int i = 0; index < 0 && i < array.length; i++)
		{
		   if (array[i]==(userkainput))
		   {
		      index = i;
		   }
		}
		System.out.println(index >= 0 ? "Found at " + index : "Not in  this array");
		
	    int[] intarr = {1,2,3,4,5};
	    boolean found2 = false;
	    int userinput2 = 2;
	    int index2 = -1;
		for (int i=0; !found && i<intarr.length; i++){
			found = intarr[i] == userinput2;
			index2 = i;
		}
		System.out.println(found ? " Found at index " + index2 ++ : "Not found");
		
	}
	
	
	
	

}
