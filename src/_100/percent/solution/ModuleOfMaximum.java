package in.stage.of.resolution;
/*
 * Модуль максимального 100%
 * https://www.e-olymp.com/uk/problems/914
 */

import java.util.Arrays;
import java.util.Scanner;

public class ModuleOfMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        double[] array = new double[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(input.next());
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(array[i]);
        }

        Arrays.sort(array);
        double result = array[arraySize - 1];
        System.out.printf("%.2f\n", result);
    }
}