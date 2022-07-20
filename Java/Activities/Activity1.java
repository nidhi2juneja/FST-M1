package Activities;

public class Activity1 {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.make = 2014;
		bmw.color = "Black";
		bmw.transmission = "Manual";
    
        //Using Car class method
		bmw.displayCharacteristics();
		bmw.accelarate();
		bmw.brake();

	}

}
