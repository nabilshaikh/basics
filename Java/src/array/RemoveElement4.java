package array;

import java.util.Arrays;

public class RemoveElement4 {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};
		int selectindex = 2;
		//System.out.println("len is : " +array.length);
		System.out.println("old: " + Arrays.toString(array));
		for (int i = selectindex; i<array.length-1; i++){
			array[i] = array[i+1];
		}
		System.out.println("new: " + Arrays.toString(array));
		
	}

}
