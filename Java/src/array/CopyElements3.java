package array;

import java.util.Arrays;

public class CopyElements3 {

	public static void main(String[] args) {
		
		int[] source = {1,2,3,4,5};
		int[] destination = new int[10];
		
		for (int i=0; i<source.length; i++){
			destination[i] = source[i];
		}
		System.out.println("source: " + Arrays.toString(source));
		System.out.println("destination: " + Arrays.toString(destination));

	}

}
