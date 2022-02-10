package _14_encapsulation;

public class ArabaMain {

	public static void main(String[] args) {
		Araba honda=new Araba(); // const.parametresiz honda obje create edildi
		//	honda.setModel("civic");
	   //     honda.setMotor(-300);
		//	honda.setYil(2021);
		//	honda.getModel();
		//	System.out.println(honda.getYil());
			Araba volvo = new Araba("Xc90", "beyaz", 15, 2020);
			Araba ww = new Araba("Passat", "siyah", 1600, 2021);
			
			System.out.println("Sectiginiz arac Volvo "+ volvo.getYil()+" "+volvo.getRenk()+" "+volvo.getMotor());
			System.out.println("Sectiginiz arac ww "+ ww.getYil()+" "+ww.getRenk()+" "+ww.getMotor());
		
	}

}
