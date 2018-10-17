package _100_percent_solution;
/*
Максимальна зарплата 100%
https://www.e-olymp.com/uk/problems/357
*/
import java.util.Locale;
import java.util.Scanner;

public class MaximumSalary {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String salary = inputData.nextLine();

        String[] strSalaryArray = salary.split("[ ]");

        float[] salaryArray = new float[strSalaryArray.length];

        for (int i = 0; i < strSalaryArray.length; i++) {
            salaryArray[i] = Float.parseFloat(strSalaryArray[i]);
        }

        float maxSalary = salaryArray[0];
        for (int i = 1; i < salaryArray.length; i++) {
            if (maxSalary < salaryArray[i]) {
                maxSalary = salaryArray[i];
            }
        }

        System.out.println(String.format(Locale.US, "%.2f", maxSalary));
    }
}