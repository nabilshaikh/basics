package array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {3,5,4,1,2,6,9,9,9,9,0,8,7,10};
		int temp = 0;
		for(int i=0; i<array.length;i++){
			for(int j=i+1; j<array.length;j++){
				if (array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
