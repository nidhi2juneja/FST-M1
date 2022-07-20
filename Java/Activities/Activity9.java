package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //Creating a String Arraylist with name as myList
        ArrayList<String> myList = new ArrayList<String>();
        //Adding 5 names/items to the myList using add() method
        myList.add("Burger");
        myList.add("Pizza");
        myList.add("Samosa");
        myList.add("Biryani");
        myList.add("Pav Bhaji");
        
        System.out.println("Printing all of the items:");
        // for each loop
        for(String item:myList){
            System.out.println(item);
        }
        
        // Printing 3rd element in the Arraylist
        System.out.println("Third element in the Arraylist is: " + myList.get(2));
        
        // Checking if a name exists in the ArrayList.
        System.out.println("Is Orange available in the Arraylist: " + myList.contains("Orange"));
        
        // Printing number of items in the ArrayList
        System.out.println("Size of ArrayList: " + myList.size());
        
        // Removing an item from the Arraylist and printing the size() of the Arraylist again.
        myList.remove("Burger");
        System.out.println("Updated Size of the ArrayList: " + myList.size());
    }
}