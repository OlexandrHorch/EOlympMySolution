package _100.percent.solution;
/*
 * Пора року 100%
 * https://www.e-olymp.com/uk/problems/923
 */

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }
    }
}