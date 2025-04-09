package aqajava.hw12;

import static aqajava.hw12.DataCSVMethods.csvReader;
import static aqajava.hw12.DataCSVMethods.csvWriter;

public class DataCSVApp {
    public static void main(String[] args) {
        String csvFile = "data.csv"; // Name of the CSV file
        String[] headers = {"Value 1", "Value 2", "Value 3"}; // CSV headers
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}};

        DataCSV myCsvFile = new DataCSV(csvFile, headers, data);

        // write data into the file
        csvWriter(myCsvFile);

        // read the file
        csvReader(myCsvFile);
    }
}