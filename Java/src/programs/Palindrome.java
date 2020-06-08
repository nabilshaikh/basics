package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		// First method
		String rev ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		String num = sc.nextLine();
		for (int i = num.length()-1; i >=0 ; i--) {
			rev += num.charAt(i);
		}
		System.out.println(rev);
		if (num.equals(rev))
			System.out.println("It is pallindrome");
		else
			System.out.println("Not a pallindrome");
		
		
		//Second Method		
		String num1 = "343";
		String rev1 = "" ;
		char[] ch = num1.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			rev1 += ch[i];
		}
		System.out.println(rev1);
		if (num1.equals(rev1))
			System.out.println("It is pallindrome");
		else
			System.out.println("Not a pallindrome");
	}

}
