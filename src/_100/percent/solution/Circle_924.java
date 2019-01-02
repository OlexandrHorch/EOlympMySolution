package in.stage.of.resolution;
/*
 * Кільце ___%
 * https://www.e-olymp.com/uk/problems/924
 */

import java.util.Scanner;

public class Circle_924 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double squareCircle = input.nextDouble();
        double radiusOut = input.nextDouble();

        double squareOut = Math.PI * Math.pow(radiusOut, 2);
        double difference = squareOut - squareCircle;
        double radiusIn = Math.sqrt(difference / Math.PI);

        System.out.printf("%.2f", radiusIn);
    }
}

/*
Кільце
Задано площу кільця й радіус зовнішнього кола. Визначити радіус внутрішнього кола.

Вхідні дані
Задано два дійсних числа: площа кільця і радіус зовнішнього кола, шо не перевищує 100.

Вихідні дані
Вивести радіус внутрішнього кола з 2 десятковими знаками.

Вхідні дані #1
50.2655 5
Вихідні дані #1
3.00
*/