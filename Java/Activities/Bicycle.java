package Activities;

public class Bicycle implements BicycleParts, BicycleOperations {

	    public int gears;
	    public int currentSpeed;

	    //Initializing values of gears and currentSpeed in a constructor
	    public Bicycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }

	    //Apply Brake method
	    public void applyBrake(int valueToBeDecremented) {
	        currentSpeed -= valueToBeDecremented;
	        System.out.println("Final current speed after decrement: " + currentSpeed);
	    }

	    // Speed Up method
	    public void speedUp(int valueToBeIncremented) {
	        currentSpeed += valueToBeIncremented;
	        System.out.println("Final current speed after increment: " + currentSpeed);
	    }

	    //Method to print the number of gears and the currentSpeed of the bicycle.
	    public String bicycleDesc() {
	        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	    }

}
