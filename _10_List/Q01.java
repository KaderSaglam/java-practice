package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde "a" harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
    	
    	
    	List<String> list1=new ArrayList(List.of("Ali","Veli","Ayse","Fatma","Omer"));
    
    	System.out.println(list1);
    	List<String> list2=new ArrayList();
    	
    	
    	
    for (String each : list1) {
    	if (!each.toLowerCase().contains("a")) {
    		list2.add(each);
			
		} 
		
	}
    System.out.println(list2);	
    }
}
