package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir ogretmenden girmek istedigi kadar notu alinizz, ve
        // ortalamayi gecen ogrrenci sayisini bulunuz.
    	
    	//1.scanner
    	//2.do while
    	//3 list
    	//4 ortalama degeri hesapla
    	//5 sayac
    	List<Integer> listNotlar= new ArrayList();
    	
    	Scanner scan=new Scanner(System.in);
    	String devam="";// bunu yazmamizin sebebi while sarti olusturmak icin
    	int not=0;
    	do {
    		
    		System.out.println("not giriniz...");
    		not=scan.nextInt();
    			System.out.println("devam etmek icin e ye basýn\n  etmezseniz h ye basiniz");
    		devam=scan.next();
    		listNotlar.add(not);
		} while (devam.equalsIgnoreCase("e"));
    // ortalama hesapla
    	int toplam=0;
    	for (int i = 0; i <listNotlar.size(); i++) {
    		toplam+=listNotlar.get(i);
			
		}
System.out.println(listNotlar); 
double ortalama=toplam/listNotlar.size();
int sayac=0;
for (int i = 0; i < listNotlar.size(); i++) {
	listNotlar.get(i);
	if (listNotlar.get(i)>ortalama) {
		sayac++;
		
	}
	
}
System.out.println("ortalamayi gecen ogrenci sayisi "+ sayac);
    }
}
