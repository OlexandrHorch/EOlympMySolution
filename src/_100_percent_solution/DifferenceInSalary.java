package _100_percent_solution;
/*
Різниця в зарплаті 100%
https://www.e-olymp.com/uk/problems/362
*/
import java.util.Locale;
import java.util.Scanner;

public class DifferenceInSalary {
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

        float maxSalary = salaryArray[0];
        for (int i = 1; i < salaryArray.length; i++) {
            if (maxSalary < salaryArray[i]) {
                maxSalary = salaryArray[i];
            }
        }

        float differenceInSalary = maxSalary - minSalary;

        System.out.println(String.format(Locale.US, "%.2f", differenceInSalary));
    }
}