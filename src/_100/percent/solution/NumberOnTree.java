package in.stage.of.resolution;
/*
 * Номер на 3 ___%
 * https://www.e-olymp.com/uk/problems/919
 */

import java.util.Scanner;

public class NumberOnTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        double[] array = new double[arraySize];
        int numberOfNumeric = 0;
        double sumOfNumeric = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(input.next());
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && ( i + 1 ) % 3 == 0) {
                numberOfNumeric += 1;
                sumOfNumeric += array[i];
            }
        }

        System.out.printf("%d %.2f\n", numberOfNumeric, sumOfNumeric);
    }
}