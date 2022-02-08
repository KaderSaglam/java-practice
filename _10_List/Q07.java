package _10_List;

public class Q07 {

	public static void main(String[] args) {
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

		
		int arr1[] = { 1, 2, 3, 7, 4, 3, 2, 1 };
		boolean simetrik=false;
		
		 for (int i = 0; i < arr1.length/2; i++) {
			 
			 if (arr1[i]==arr1[arr1.length-1-i]) {
				simetrik=true;
			} else {
				simetrik=false;
				break;

			}
			
		}
System.out.println(simetrik);
	}

}
