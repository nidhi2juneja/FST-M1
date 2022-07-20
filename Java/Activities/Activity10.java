package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
    	// Creating a hashset named hs of String
        HashSet<String> hs = new HashSet<String>();
        // Adding 6 objects to hs HashSet using add method
        hs.add("Namita");
        hs.add("Nalini");
        hs.add("Himani");
        hs.add("Payal");
        hs.add("Mohini");
        hs.add("Priya");
        
        //Printing the hs HashSet
        System.out.println("Initial hashSet: " + hs);
        
        //Printing the size of the HashSet using size function
        System.out.println("Size of the initial hashSet: " + hs.size());
        
        //Removing an element using remove function
        System.out.println(hs.remove("Mohini") + " removed from hs Hashset");
        
        //Removing an element that is not present in the Set
        if(hs.remove("Nalini")) {
        	System.out.println("Nalini is removed from the Set");
        } else {
        	System.out.println("Nalini is not present in the Set");
        }
        
        //Checking if an item is present in the set or not using contains function
        System.out.println("Verifying if Himani is present in set : " + hs.contains("Himani"));
        
        //Printing the updated HashSet
        System.out.println("Updated and final HashSet: " + hs);
    }
}
