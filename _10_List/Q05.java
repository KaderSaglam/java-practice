package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 6 elemanli bir dizinin
        // sadece tek elemanlarini ayri diziye bir metodda atayarak
        // main de yazdiriniz.

    	Scanner scan=new Scanner(System.in);
    	int arr[]=new int[6];
    	
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println("sayi gir");
    		arr[i]=scan.nextInt();
    		
			
		}
    	System.out.println(tekEleman(arr));

    }

	private static List<Integer> tekEleman(int[] arr) {
		
		List<Integer> list=new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==1) {
				list.add(arr[i]);
			}
			
		}
		return list;
	}


}
