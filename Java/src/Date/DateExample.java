package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
		
		public static void main(String[] args) {  
		    Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
		    String strDate= formatter.format(date);  
		    System.out.println(strDate);  
		}
}


