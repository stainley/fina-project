package edu.lambton.exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLocalFile {

    public String readFile(String fileName) {

        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader(fileName));
            String dataFromFile = bufferedReader.readLine();

            return dataFromFile;
        } catch (IOException ioException) {
            System.err.println("An error has occurred " + ioException.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error closing file");
            }
        }
        return null;
    }

    public List<Double> readFromCSVFile(String csvFile) {
        List<Double> result = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;



        try {
            fileReader = new FileReader(csvFile);
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) {

                String dataFromFile = bufferedReader.readLine();

                String[] split = dataFromFile.split(",");
                Double sum = Double.parseDouble(split[0]) + Double.parseDouble(split[1]);
                result.add(sum);
            }

        } catch (IOException ioException) {
            System.err.println("An error has occurred " + ioException.getMessage());
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.err.println("Error closing file");
            }
        }
        return result;
    }
}
