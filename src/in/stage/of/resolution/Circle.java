package in.stage.of.resolution;
/*
 * Кільце ___%
 * https://www.e-olymp.com/uk/problems/924
 */

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double square = input.nextDouble();     // ???
        double radiusOut = input.nextDouble();  // ???

        System.out.println("square = " + square + "\nradius = " + radiusOut);

        double radiusIn = 0;
        System.out.printf("%.2f", radiusIn);
    }
}

/*
Кільце
prb924 Задано площу кільця й радіус зовнішнього кола. Визначити радіус внутрішнього кола.

Вхідні дані
Задано два дійсних числа: площа кільця і радіус зовнішнього кола, шо не перевищує 100.

Вихідні дані
Вивести радіус внутрішнього кола з 2 десятковими знаками.

Ліміт часу 1 секунд
Ліміт використання пам'яті 122.17 MiB
Вхідні дані #1
50.2655 5
Вихідні дані #1
3.00
*/