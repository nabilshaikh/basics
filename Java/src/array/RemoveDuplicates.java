package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static Set<String> convertStringArrayToSet(String[] array){
		
		Set<String> set = new HashSet<String>();
		for(String t: array){
			set.add(t);
		}
		return set;		
	}
	
	public static void main(String[] args) {
		
		String[] stringarray = {"a","b","c", "d","a", "e", "a"};
		System.out.println("Original: " +Arrays.toString(stringarray));
		Set<String> stringset = convertStringArrayToSet(stringarray);
		System.out.println("After removing duplicate: " +stringset);
	}	
}
