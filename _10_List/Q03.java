package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list olusturunuz ve bu listedeki tum sayilarin karesinin
   toplamini bulunuz. Sonucu ekrana  yazdriniz
  
    */
List<Integer> list=new ArrayList<>();
Scanner scan=new Scanner(System.in);
int sayi=5;
while (sayi!=0) {
	System.out.println("lutfen sayi giriniz");
	 sayi=scan.nextInt();
	list.add(sayi);
	
}
list.remove(list.size()-1); // islemden cýktýk

System.out.println("isleminiz bitti");
System.out.println("girdiginiz sayilar"+list);

List<Integer> list1=new ArrayList<>();
int toplam=0;
for (Integer w : list) {
	toplam=w*w;
	list1.add(toplam);
	
	
}
System.out.println("girdiðiniz sayilarin kareleri "+list1);
int toplamSayilar=0;
for (Integer a : list1) {
	toplam+=a;
	
	
	
}

System.out.println("kareler toplami "+ toplam);

}}