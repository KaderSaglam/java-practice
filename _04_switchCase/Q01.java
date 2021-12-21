package _04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		// 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 arası - C   3. 60(dahil) ile 80 arası - B  4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Notunuzu giriniz : ");
		int not = scan.nextInt();
		String   note=scan.nextLine();
		
		if(not>=0 && not<50) {
			//not = 0;
			note="kaldın";
		}else if(not>=50 && not<60){
			//not = 50;
			note="ucuz yırttın";
		}else if(not>=60 && not<80){
		//	not = 60;
			note="başarılı";
		}else if(not>=80 && not<=100){
			//not = 80;
			note="gayet başarılı";
		}

		switch(note) {
		
			case "kaldın":
				System.out.println("D");
				break;
			case "ucuz yırttın":
				System.out.println("C");
				break;
			case "başarılı":
				System.out.println("B");
				break;
			case "gayet başarılı":
				System.out.println("A");
				break;
		    default:
		    	System.out.println("Gecerli not giriniz");
		    	break;
		}
	}
}
