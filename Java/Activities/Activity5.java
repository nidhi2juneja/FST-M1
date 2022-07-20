package Activities;

abstract class Book {
	// Title of type String
    String title = "Engineer";
    // Abstract method
    abstract void setTitle(String s);
    // Complete/Concrete method
    String getTitle() {
        return title;
    }
}

// MyBook class extending Book class
class MyBook extends Book {
    // Defining the Abstract setTitle() method from Book class
    public void setTitle(String strn) {
        title = strn;
    }
}

public class Activity5 {

	public static void main(String[] args) {
        //Object creation for MyBook class
        Book newBook = new MyBook();
        // Setting title using setTitle method
        newBook.setTitle(newBook.title);
        System.out.println("The new book title is: " + newBook.getTitle());

	}

}
