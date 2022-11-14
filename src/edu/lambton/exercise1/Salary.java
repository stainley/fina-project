package edu.lambton.exercise1;

import java.io.*;
import java.util.Scanner;

public class Salary {
    private static final double TAX_26 = 0.26;
    private static final double TAX_18 = 0.18;

    String calculateSalary(String company, double salary) {
        double salaryTaxApplied;
        double taxDeducted = 0.0;
        if (salary >= 85000) {
            taxDeducted = (salary * TAX_26);
            salaryTaxApplied =  salary - taxDeducted;
        } else if (salary >= 60000 && salary < 850000) {
            taxDeducted = (salary * TAX_18);
            salaryTaxApplied = salary - taxDeducted;
        } else {
            salaryTaxApplied = salary;
        }

        String monthly = String.format("%.2f", salaryTaxApplied / 12);
        String bi_weekly = String.format("%.2f", (salaryTaxApplied/12)/2);

        String data = "\n" +  company + ",$" + salary + ",$" + monthly + ", $" + bi_weekly + ",$" + taxDeducted;

        return data;
    }

    void calculateSalaryFromFile() throws FileNotFoundException {
       BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader("data/Salary.txt"));
            line = br.readLine();
            String[] salaries = line.split(",");
            String companyName = "";
            for (String salaryFromFile: salaries) {
                System.out.print("Comany name: ");
                Scanner scanner = new Scanner(System.in);
                companyName = scanner.nextLine();
                String result = calculateSalary(companyName,  Double.parseDouble(salaryFromFile));
                writeToSalary(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToSalary(String salaries) {
        PrintWriter printWriter = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("data/processed.txt", true));
            bw.write(salaries);
            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
