package _100.percent.solution;
/*
 * Подвоєний мінімальний 100%
 * https://www.e-olymp.com/uk/problems/917
 */
import java.util.Arrays;
import java.util.Scanner;

public class DoubleMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        double[] array = new double[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(input.next());
        }

        Arrays.sort(array);
        System.out.printf("%.2f\n", array[0] * 2);
    }
}