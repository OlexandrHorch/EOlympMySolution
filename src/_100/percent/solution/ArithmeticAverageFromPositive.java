package _100.percent.solution;
/*
 * Середнє арифметичне додатних 100%
 * https://www.e-olymp.com/uk/problems/910
 */

import java.util.Scanner;

public class ArithmeticAverageFromPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantityOfNumbers = input.nextInt();

        double[] numbers = new double[quantityOfNumbers];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(input.next());
        }

        double sumOfPositiveNumbers = 0;
        int quantityOfPositiveNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumOfPositiveNumbers += numbers[i];
                quantityOfPositiveNumbers += 1;
            }
        }

        if (quantityOfPositiveNumbers == 0) {
            System.out.println("Not Found");
        } else {
            System.out.print(String.format("%.2f", sumOfPositiveNumbers / quantityOfPositiveNumbers));
        }
    }
}