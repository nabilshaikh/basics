package array;

public class DuplicateString8 {

	public static void main(String[] args) {
		String[] names = {"john","john","nabil","jon","j"};
		for(int i=0; i<names.length-1;i++){
			for (int j=i+1; j<names.length; j++){
				if(names[i]==names[j]){
					System.out.println(names[j]);
				}
			}
		}
	}
}
