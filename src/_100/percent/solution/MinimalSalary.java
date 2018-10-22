package _100_percent_solution;
/*
Мінімальна зарплата 100%
https://www.e-olymp.com/uk/problems/352
*/
import java.util.Locale;
import java.util.Scanner;

public class MinimalSalary {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String salary = inputData.nextLine();

        String[] strSalaryArray = salary.split("[ ]");

        float[] salaryArray = new float[strSalaryArray.length];
        for (int i = 0; i < strSalaryArray.length; i++) {
            salaryArray[i] = Float.parseFloat(strSalaryArray[i]);
        }

        float minSalary = salaryArray[0];
        for (int i = 1; i < salaryArray.length; i++) {
            if (minSalary > salaryArray[i]) {
                minSalary = salaryArray[i];
            }
        }

        System.out.println(String.format(Locale.US, "%.2f", minSalary));
    }
}