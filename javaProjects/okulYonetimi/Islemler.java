package javaProjects.okulYonetimi;

/*
	BÄ°R OKUL YÃ–NETÄ°M PLATFORMU KODALYINIZ.

	1.	Bu programda, Ã–ÄŸrenci ve Ã–ÄŸretmen KayÄ±tlarÄ± ile ilgili iÅŸlemler yapÄ±labilmelidir.
		KayÄ±tlarda ÅŸu bilgiler olabilmelidir.

		Ã–ÄŸretmen: Ad-Soyad,  kimlik No, yaÅŸ, bÃ¶lÃ¼m, ve sicil No bilgileri iÃ§ermelidir.
		Ã–ÄŸrenci: Ad-Soyad,  kimlik No, yaÅŸ, numara, sÄ±nÄ±f bilgileri iÃ§ermelidir.

	2.	Program baÅŸladÄ±ÄŸÄ±nda KullanÄ±cÄ±ya, Ã–ÄŸretmen ve Ã–ÄŸrenci iÅŸlemlerini seÃ§ebilmesi iÃ§in
		AÅŸaÄŸÄ±daki gibi bir menÃ¼ gÃ¶sterilsin.

	====================================
	 Ã–Ä�RENCÄ° VE Ã–Ä�RETMEN YÃ–NETÄ°M PANELÄ°
	====================================
	 1- Ã–Ä�RENCÄ° Ä°Å�LEMLERÄ°
	 2- Ã–Ä�RETMEN Ä°Å�LEMLERÄ°
	 Q- Ã‡IKIÅ�

	3.	SeÃ§ilen KiÅŸi tÃ¼rÃ¼ne gÃ¶re aÅŸaÄŸÄ±daki iÅŸlemleri gÃ¶steren bir alt menÃ¼ daha gÃ¶sterilsin.

	============= Ä°Å�LEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LÄ°STELEME
		 4-SÄ°LME
		 5-ANA MENÃœ
		 Q-Ã‡IKIÅ�

	SEÃ‡Ä°MÄ°NÄ°Z:

	4.	Ä°ÅŸlemler menÃ¼sÃ¼nde seÃ§ilen iÅŸleme gÃ¶re bir Ã¶nceki menÃ¼de seÃ§ilen KiÅŸi tÃ¼rÃ¼ ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tÃ¼m kiÅŸileri listeleme gibi iÅŸlemler yapÄ±labilmelidir.
		Bunun yanÄ±nda bir Ã¼st menÃ¼ye dÃ¶nme veya Ã§Ä±kÄ±ÅŸ iÅŸlemleri de yapÄ±labilmelidir.

 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    List<Kisi> ogrenciList = new ArrayList<Kisi>();
    List<Kisi> ogretmenList = new ArrayList<Kisi>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void anaMenu() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");

        String secim = scan.next().toUpperCase();


        switch (secim) {

            case "1":
                kisiTuru = "OGRENCÄ°";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatali giris yaptiniz !!!");
                anaMenu();
                break;

        }

    }

    private static void cikis() {
        System.out.println("uygulamayi kullandiginiz iÃ§in thanks bro  :)");
    }

    private static void islemMenusu() {
        System.out.println("3. SeÃ§ilen KiÅŸi tÃ¼rÃ¼ne gÃ¶re aÅŸaÄŸÄ±daki iÅŸlemleri gÃ¶steren bir alt menÃ¼ daha gÃ¶sterilsin.\r\n"
                + "============= Ä°Å�LEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LÄ°STELEME\r\n"
                + "     4-SÄ°LME\r\n"
                + "     0-Ã‡IKIÅ�");

        System.out.println("islem tercihinizi giriniz : ");
        int islemTercihi = scan.nextInt();
        switch (islemTercihi) {
            case 0:
                anaMenu();
                break;
            case 1:
                ekleme();
                islemMenusu();
                break;
            case 2:
                //  arama();
                islemMenusu();
                break;
            case 3:
                //   listeleme();
                islemMenusu();
                break;
            case 4:
                //  silme();
                islemMenusu();
                break;
            default:
                System.out.println("hatali giris yaptiniz :( ");
                islemMenusu();
                break;


        }
    }

    private static void ekleme() {

    }


}
