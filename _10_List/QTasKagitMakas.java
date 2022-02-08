package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QTasKagitMakas {

    public static void main(String[] args) {
    	
        // tas >makas
        // makas >kagit
        //kagit >tas
    	
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("tas icin 1 \n kagit icin -2\n makas icin-3");
    	
    	

 
    	
     List<Integer> oyun= new ArrayList<>();
  oyun.add(scan.nextInt());
     System.out.println(oyun);
         int bilgisayar=(int) (Math.random()*3);
         
         
         if (bilgisayar>oyun.get(0)) {
			System.out.println("bilgisayarın girdigi sayi : "+ bilgisayar+ "kullanicinin girdigi sayi :"+ oyun.get(0));
			System.out.println( "bilgisayar kazandi");
         
		} else if(bilgisayar<oyun.get(0)) {
			System.out.println("bilgisayarın girdigi sayi : "+ bilgisayar+ "kullanicinin girdigi sayi : "+ oyun.get(0));
			System.out.println( "kullanici  kazandi");
		}
		else if(bilgisayar==oyun.get(0)){
			System.out.println("bilgisayarın girdigi sayi : "+ bilgisayar+ "kullanicinin girdigi sayi :"+ oyun.get(0));
			System.out.println( "berabere");
		}
		else System.out.println("yanlis girdin"); 
       




scan.close();

    }

}
