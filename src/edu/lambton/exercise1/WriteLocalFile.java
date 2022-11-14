package edu.lambton.exercise1;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteLocalFile {

    private final String fileName;
    private final String data;

    public WriteLocalFile(String fileName, String data) {
        this.fileName = fileName;
        this.data = data;
    }

    public void writeFile() {

        PrintWriter printToFile = null;
        try {

            printToFile = new PrintWriter(fileName);
            printToFile.println(data);
            printToFile.flush();

        } catch (IOException e) {
            System.err.println("An error occurred!!!!");
            throw new RuntimeException(e);
        } finally {
            printToFile.close();
        }
    }
}
