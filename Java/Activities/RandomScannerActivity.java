package Activities;

import java.util.*;

public class RandomScannerActivity {

    public static void main(String[] args) {
    	// Using Scanner class to accept numbers from console
        Scanner scan = new Scanner(System.in);
        // Creating an Empty ArrayList having Integer values
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Creating an object of the Random class
        Random indexGen = new Random();
        
        System.out.print("Enter some random integers");
        System.out.println("(Enter some non-integer values to terminate): ");

        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        int ind = indexGen.nextInt(nums.length);
        System.out.println("Value of the index generated: " + ind);
        System.out.println("Specific value in the array at the generated index: " + nums[ind]);

        scan.close();
    }
}