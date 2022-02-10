package _14_encapsulation;

public class CarMain {

	public static void main(String[] args) {
		Car passat=new Car();
		
		passat.getModel();
		System.out.println(passat.getModel());
		System.out.println(passat.getRenk());
		
		// 4- Ýki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
		
		Car bmw =new Car("fddt6" , "Beyaz", 20 , -2021 );
//String model, String renk, int motor, int yil
		
		Car audi=new Car("000t6" , "Siyah", 1999 , 2020 );
		
System.out.println("bmw modeli : "+ bmw.getModel()+ " rengi : "+ bmw.getRenk()+" motoru : "+ bmw.getMotor()+" yili "+ bmw.getYil());
System.out.println("audi modeli : "+ audi.getModel()+ " rengi : "+ audi.getRenk()+" motoru : "+ audi.getMotor()+" yili "+ audi.getYil());


//	 5- araclarýn motor gücünü 100 beygir ve üstü olmasý ve yýlýný hatalý veri girisine karsi kontrol ediniz.


	}

}
