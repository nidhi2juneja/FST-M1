package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) { 
    	// Created a map named colours with keys as Integer and values as String
        HashMap<Integer, String> colours = new HashMap<Integer, String>();
        // Adding 5 random colours to the map and printing the map
        colours.put(1, "Pink");
        colours.put(2, "Red");
        colours.put(3, "Grey");
        colours.put(4, "Brown");
        colours.put(5, "Green");

        // Printing the Map
        System.out.println("The Initial map: " + colours);
        
        // Removing one colour using remove method
        colours.remove(2);
        
        // Checking the map if the colour green exists using the containsValue() method
        if(colours.containsValue("Green")) {
            System.out.println("Green colour exists in the Map");
        } else {
            System.out.println("Green colour does not exist in the Map");
        }
        
        // Printing the size of the Map using size method
        System.out.println("Final key value pairs in the Map is: " + colours.size());
    }
}