package string;

public class Striing {

	public static void main(String[] args) {
		try {
			String a = null;
			System.out.println(a.length());
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello");
		}
	}

}
