package in.stage.of.resolution;
/*
 * Яка чверть? 56%
 * https://www.e-olymp.com/uk/problems/918
 */
import java.util.Scanner;

public class WhatQuarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = Integer.parseInt(input.next());
        int y = Integer.parseInt(input.next());

        if (x == 0 || y == 0) {
            System.out.println(0);
        } else if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}