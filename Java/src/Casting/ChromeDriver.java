package Casting;

public class ChromeDriver extends WebDriver{
	
	/*void calling() {
		System.out.println("Samsung calling...");
	}*/
	
	void camera() {
		System.out.println("Samsung has Camera");
	}
	
	
	public static void main (String args[]) {
		
		ChromeDriver s = new ChromeDriver();
		System.out.println(s);
		s.calling();
		s.camera();	

		
		
		WebDriver m = new ChromeDriver();		
		m.calling();
		
		WebDriver n = new WebDriver();
		n.calling();
		
	}
	

}
