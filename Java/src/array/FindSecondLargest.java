package array;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		// 1st method
		int[] array = {4,5,3,1,2,16};
		System.out.println("Unsorted" + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted" + Arrays.toString(array));
		
		int len = array.length;
		System.out.println("Second largest is " +array[len-2]);
		
		// 2nd method
		
		int[] array1 = {4,6,1,2,5,3};
		int first, second;
		for(int i=0; i<array1.length;i++){
			
		/*	if(array.length<2){
				System.out.println("enter value should be greater than 2");
			}*/
			
			first=second= Integer.MIN_VALUE;
			if(array1[i] > first){
				second = first;
				first = array1[i];
			}
			else if(array1[i] > second && array1[i] != first){
				second = array1[i];
			}
			System.out.println(second);
		}
		

		
	}

}
