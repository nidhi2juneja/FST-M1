package Activities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {

        // Creating an object for the CSVReader class and passing the filepath
        CSVReader reader = new CSVReader(new FileReader("src/main/resources/sample.csv"));

        // Reading the content using readAll() method
        List<String[]> list = reader.readAll();
        // Using size() method to count the number of rows in the CSV file
        System.out.println("Total rows: " + list.size());

        // Creating an iterator to iterate through the list and and printing all of the rows of the file
        Iterator<String[]> itr = list.iterator();

        while(itr.hasNext()) {
            String[] str = itr.next();

            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");
        }

        reader.close();
    }
}