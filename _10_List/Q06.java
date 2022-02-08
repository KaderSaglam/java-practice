package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
    	  int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};//sorudaki arrayi olusturduk
          List<Integer> tekrarsiz = new ArrayList<>(); // kac tane silecegimizi bilmedigimiz icin list olusturduk


          for (Integer s : arr) {// farkli sayilari list e atiyouz
              if (!tekrarsiz.contains(s)) {// arrayin icindeki elemanlari liste atiyoruz
                  tekrarsiz.add(s);
              
	}
	
}

	System.out.println("list : "+tekrarsiz);	 //bu bizim tekrarsiz list
	
	Collections.sort(tekrarsiz);// ama soru bizden array istiyor
	
	int yeniArr[]=new int[tekrarsiz.size()];//yeni array ousturuyoruz boyutu list lerden olan
	
	for (int i = 0; i < yeniArr.length; i++) {
		yeniArr[i]=tekrarsiz.get(i);
		
	}
	System.out.println("array : "+Arrays.toString(yeniArr));
	
	}
}


