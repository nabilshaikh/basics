package array;

public class FindIndex {
	
	public static void findIndex(int[] my_array, int input) {
        
        for (int i=0; i<my_array.length; i++){
        	if (my_array[i] == input){
        		System.out.println(i);
        	}
        }
        //return -1;
    }
	
    public static void main(String[] args) {
      int[] my_array = {1,2,3,4,5,6,7,8};
      //System.out.println(findIndex(my_array, 2));
      //System.out.println(findIndex(my_array, 5));
      findIndex(my_array, 5);
       }
}
