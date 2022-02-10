 package _14_encapsulation;

 
 
 
 /*1- fieldlarý(encapsulated) model(String), renk(String), motor(int), yil (int)
 olan Araba  isimli bir class cretae ediniz.*/
 
 
public class Car {
	
	
	private String model= null;
	private String renk="Kirmizi";
	private	int motor=0;
	private int yil=0;
	
	Car(){
		
	}
	
	Car(String model, String renk, int motor, int yil){
		this.model=model;
		this.renk=renk;
		//this.motor=motor;
		//this.yil=yil;
		setYil(yil);
		setMotor(motor);
		
//		 5- araclarýn motor gücünü 100 beygir ve üstü olmasý ve yýlýný hatalý veri girisine karsi kontrol ediniz.
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		
		if (motor<100) {
			System.out.println("motorun 100 beygir ve ustu olmasý gerekir ");
			
			
		} else {
			System.out.println("motoru iyiymis");
			this.motor = motor;
		}

		
		
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		if (yil<0) {System.out.println("negatif sayi girdiniz");
		this.yil = (-1)*yil;
			
		} else {this.yil = yil;

		}
		
	}
	

}
