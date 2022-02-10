package _14_encapsulation;

public class Araba {
private	String model;
private		String renk;
private	int motor;
private		int yil;
	//bu verileri kapsulleyecegiz
	//defaul kendi packagena ulasýr
public Araba() {
    
    
}

public Araba(String model, String renk, int motor, int yil) {
    this.model=model;
    this.renk=renk;
//  this.motor=motor;
//  this.yil=yil;
    setYil(yil);
    setMotor(motor);
    
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
    if(motor>=100) {
    this.motor = motor;
    System.out.println("Agam tekerine tiras degmesin");
    }else {
        System.out.println("Agam eglenir 100un altinda beygir gucu olmazz");
    }
}
public int getYil() {
    return yil;
}
public void setYil(int yil) {
    
    if (yil<=0) {
        System.out.println("Negatif yil giremezsiniz.Bu tarihlerde bu model uretilmemisti");
        this.yil =(-1)* yil;
        
    }else {
        this.yil=yil;
    }
        
    
    
    
}




}

