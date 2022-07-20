package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
        	// Creating a text file using the File class with name newfile.txt
            File file = new File("src/file.txt");
            // Creating file using createNewFile method
            boolean fStatus = file.createNewFile();
            
            // Verifying if file is created or not
            
            if(fStatus == true) {
                System.out.println("New file is created successfully!");
            } else {
                System.out.println("File is either not created or already present");
            }
            
            // Writing some text in the above text file
            FileWriter fw=new FileWriter("src/file.txt");
            fw.write("This is the first content");
            fw.close();
            
            // Get the file object using FileUtils.getFile() method
            File fileUtil = FileUtils.getFile("src/file.txt");
            //Reading the file using readFileToString().
            System.out.println("Available data in the file is " + FileUtils.readFileToString(fileUtil, "UTF8"));

            //Creating a directory named resources using File class
            File destDir = new File("resources");
            // Copy the text file into above resources directory using the copyFileToDirectory() method
            FileUtils.copyFileToDirectory(file, destDir);

            //Getting this file from above new resources directory
            File newFile = FileUtils.getFile(destDir, "file.txt");
            //Reading data from this file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Printing the data in the new file
            System.out.println("Data available in new file: " + newFileData);
            
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}