package w3resources.array;

public class DuplicateIntValues {

	public static void main(String[] args) {
		int[] array = {2,4,5,2,5,7,5};
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i]==array[j] && (i != j)) {
					System.out.println("duplicate: " +array[j]);
				}
			}
		}
	}

}
