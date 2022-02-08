package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tum elemanlari bir
     //listeye kopyalayan ve harf sirasina gore yazdiran bir METHOD yazinizz.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

String  Array[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

yeniList(Array);

	}

	public static void yeniList(String[][] Array) {
		List<String>list1=new ArrayList <>();
		
		for (int kat = 0; kat < Array.length; kat++) {
			for (int daire = 0; daire < Array[kat].length; daire++) {
				list1.add(Array[kat][daire]);
				
			}
			
		}	
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}

}
