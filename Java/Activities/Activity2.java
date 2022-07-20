package activities;
import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
      
        int[] num_of_arrays = {10, 77, 10, 54, -11, 10};
        System.out.println("Value of array is " + Arrays.toString(num_of_arrays));
        
        int numToBeSearched = 10;
        int sumOfNumbers = 30;

        System.out.println("Result: " + result(num_of_arrays, numToBeSearched, sumOfNumbers));
    }

    public static boolean result(int[] nums, int numSearched, int sumFixed) {
        int sum_temporary = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == numSearched) {
                
            	sum_temporary += numSearched;
            }

            if (sum_temporary > sumFixed) {
                break;
            }
        }

        return sum_temporary == sumFixed;
    }
}