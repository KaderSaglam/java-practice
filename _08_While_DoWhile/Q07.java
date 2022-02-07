package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner scan = new Scanner(System.in);
        String str = "";


        do {
        	System.out.println("string giriniz");
            str = scan.nextLine();
            if (str.equalsIgnoreCase("x")) break; // break : dongu k�r�yor

            System.out.println("program basliyorr");
        } while (!str.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");

    }
}
