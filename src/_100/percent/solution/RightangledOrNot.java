package in.stage.of.resolution;
/*
 * Прямокутний чи ні? 100%
 * https://www.e-olymp.com/uk/problems/915
 */

import java.util.Arrays;
import java.util.Scanner;

public class RightangledOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.next());
        }

        Arrays.sort(array);

        if (Math.pow(array[2], 2) == Math.pow(array[0], 2) + Math.pow(array[1], 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}