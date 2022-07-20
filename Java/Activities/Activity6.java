package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// Creating an object of the Plane class and setting the max passengers value to
		// 10
		Plane plane = new Plane(10);
		// Adding passengers in the list using onboard method created
		plane.onboard("Nidhi");
		plane.onboard("Nalini");
		plane.onboard("Namita");
		plane.onboard("Himani");
		// Plane is taking off
		System.out.println("Plane is taking off at mentioned time: " + plane.takeOff());
		// Printing the list of people those were on boarded
		System.out.println("List of People those were on-boarded in the plane: " + plane.getPassengers());
		// Adding sleep time to pause the execution for 5 seconds
		Thread.sleep(5000);
		// Landing of plane
		plane.land();
		// Plane is landing
		System.out.println("Plans landing time is: " + plane.getLastTimeLanded());
	}
}
