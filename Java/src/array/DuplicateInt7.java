package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInt7 {
	
	public static void main (String args[]){
		int[] array = {1,2,3,2,4,5,6,2,8,5};
		for(int i=0; i<array.length-1;i++){
			for(int j=i+1; j<array.length; j++){
				if(array[i]==array[j] && i!=j){
					System.out.println(array[j]);
				}
			}
		}
	}
}
