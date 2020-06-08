package array;

import java.util.Arrays;

public class Pracs {

	public static void main(String[] args) {
		System.out.println("-----contains specific value along with index-----");
		int[] array = {1,2,3,4,5};
		boolean found = false;
		int input = 2;
		int index = 0;
		int value = 0;
		for(int i=0; i<array.length && !found; i++){
			found = array[i]==input;
			index = i;
			value = array[i];
		}
		System.out.println(found ? "Found " +value+ " at index " +index++ : "Not found");
		
		System.out.println("-----copy element(s)-----");
		int[] destination = new int[10];
		for(int i=0; i<array.length; i++){
			destination[i] = array[i];
		}
		System.out.println(Arrays.toString(destination));
		
		System.out.println("-----remove element(s)-----");
		int indextoremove = 1;
		for (int i=indextoremove; i<array.length-1; i++){
			array[i] = array[i+1];
		}
		System.out.println("new element " +Arrays.toString(array));
		
		System.out.println("-----reverse element(s)-----");
		for (int i=array.length-1; i>=0; i--){
			System.out.print(i);
		}
		
		System.out.println("-----max & min-----");
		int max = array[0];
		int min = array[0];
		for (int i=1; i<array.length; i++){
			if(array[i]>max){
				max = array[i];
			}
			if(array[i]<min){
				min = array[i];
			}
		}
		System.out.println("max: "+max+ " & min: " +min);
	}

}
