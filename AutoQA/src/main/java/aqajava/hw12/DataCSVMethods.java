package aqajava.hw12;

import java.io.*;

public class DataCSVMethods {
    // save data to a CSV file
    public static void csvWriter(DataCSV file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.getCsvFile()))) {
            // write headers
            writer.write(String.join(";", file.getHeaders()));
            writer.newLine();
            // write data
            for (int[] row : file.getData()) {
                // int to str
                String[] strRow = new String[row.length];
                for (int i = 0; i < row.length; i++) {
                    strRow[i] = String.valueOf(row[i]);
                }
                // define delimiter
                writer.write(String.join(";", strRow));
                writer.newLine();
            }
            System.out.printf("CSV file %s successfully created.\n", file.getCsvFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // load data from a CSV file
    public static void csvReader(DataCSV file) {
        StringBuilder result = new StringBuilder();
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file.getCsvFile()))) {
            int count;
            while ((count = inputStream.read()) != -1) {
                result.append((char) count);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
}