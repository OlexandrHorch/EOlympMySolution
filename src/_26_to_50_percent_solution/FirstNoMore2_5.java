package _26_to_50_percent_solution;
/*
 * Перший не більший за 2,5 30%
 * https://www.e-olymp.com/uk/problems/907
 */

import java.util.Arrays;
import java.util.Scanner;

public class FirstNoMore2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        double[] array = new double[arraySize];
        int index = 0;
        double numeric = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(input.next());
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 2.5) {
                index = i;
                numeric = array[i];
                break;
            }
        }

        Arrays.sort(array);
        if (array[0] <= 2.5) {
            System.out.printf("%d %.2f\n", index, numeric);
        } else {
            System.out.println("Not Found");
        }
    }
}