package aqajava.hw12;

public class DataCSV {
    private String[] headers;
    private int[][] data;
    private String csvFile;

    public DataCSV(String csvFile, String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
        this.csvFile = csvFile;
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }

    public String getCsvFile() {
        return csvFile;
    }
}