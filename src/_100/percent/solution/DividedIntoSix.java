package _100.percent.solution;
/*
 * Ті, що діляться на 6 100%
 * https://www.e-olymp.com/uk/problems/908
 */

import java.util.Scanner;

public class DividedIntoSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        int numberOfNumeric = 0;
        int sumOfNumeric = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.next());
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 6 == 0 && array[i] > 0) {
                numberOfNumeric += 1;
                sumOfNumeric += array[i];
            }
        }

        System.out.println(numberOfNumeric + " " + sumOfNumeric);
    }
}