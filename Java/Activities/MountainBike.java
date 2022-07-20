package activities;

public class MountainBike extends Bicycle {

	//The MountainBike class having another property seatHeight
    public int seatHeight;

    //Constructor for MountainBike class
    public MountainBike(int gears, int currentSpeed, int seatStHeight) {
        //Calling Bicycle base class constructor
        super(gears, currentSpeed);
        seatHeight = seatStHeight;
    }

    // setHeight method for the MountainBike class for adding a new value for the seatHeight variable
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Overriding the bicycleDesc of Bicycle class in MountainBike class
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}
