package Activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {

	// Global var FILE_NAME
    private static final String FILE_NAME = "TestSheet.xlsx";

    public static void main(String[] args) {

    	// Created object for XSSFWorkbook class
        XSSFWorkbook workbook = new XSSFWorkbook();
        // Created an object for the XSSFSheet class
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        
        // Creating data that we can insert in excel sheet
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

        // Initializing row number index value
        int rowNum = 0;
        System.out.println("Excel is being created");

        // for loop for inserting data into each cell
        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
        	// Creating FileOutputStream object and passed FILE_NAME global var
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            // Used workbook.write() method to write data to the excel sheet
            workbook.write(outputStream);
            workbook.close();
        } 
        // Created FileNotFoundException and IOException catch block exceptions
        catch (FileNotFoundException f) {
            f.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}