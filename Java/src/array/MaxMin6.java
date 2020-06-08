package array;

public class MaxMin6 {

	public static int max(int[] arraymax){
		int max = arraymax[0];
		for (int i=1; i<arraymax.length; i++){
			if (arraymax[i] > max){
				max = arraymax[i];
			}
		}
		return max;
	}
	
	public static int min(int[] arraymin){
		int min = arraymin[0];
		for (int i=1; i<arraymin.length; i++){
			if (arraymin[i] < min){
				min = arraymin[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] array = {1,6,3,4,5}; 
		System.out.println(max(array));
		System.out.println(min(array));
	}

}
