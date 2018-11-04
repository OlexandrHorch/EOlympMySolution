package in.stage.of.resolution;
/*
 * Який трикутник? ___%
 * https://www.e-olymp.com/uk/problems/905
 */

import java.util.Scanner;

public class WhatTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.next());
        }

        if (array[0] == array[1] && array[0] == array[2]) {
            System.out.println(1);
        } else if (array[0] != array[1] && array[1] != array[2] && array[2] != array[0]) {
            System.out.println(3);
        } else {
            System.out.println(2);
        }
    }
}