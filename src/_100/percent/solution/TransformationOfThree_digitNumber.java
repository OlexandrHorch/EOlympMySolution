package _100.percent.solution;
/*
 * Перестановка цифр трицифрового 100%
 * https://www.e-olymp.com/uk/problems/943
 */

import java.util.Scanner;

public class TransformationOfThree_digitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int a = number / 100;
        int b = ( number / 10 ) % 10;
        int c = ( number % 100 ) % 10;

        System.out.println(c * 100 + b * 10 + a);
    }
}

/*
Перестановка цифр трицифрового
У заданому трицифровому натуральному числі поміняти першу та останню цифри місцями.

Вхідні дані
Одне натуральне трицифрове число n (100 ≤ n ≤ 999).

Вихідні дані
Вивести число, отримане в результаті вказаного обміну.

Вхідні дані #1
198
Вихідні дані #1
891
*/