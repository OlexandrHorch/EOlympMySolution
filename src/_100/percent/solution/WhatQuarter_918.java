package _100.percent.solution;
/*
 * Яка чверть? 100%
 * https://www.e-olymp.com/uk/problems/918
 */

import java.util.Scanner;

public class WhatQuarter_918 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float x = Float.parseFloat(input.next());
        float y = Float.parseFloat(input.next());

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

/*
Яка чверть?
Задано точку з координатами х та у. Визначити, в якій координатній чверті вона розміщена.

Вхідні дані
У єдиному рядку через пропуск задано 2 дійсні числа - координати точки, значення координат по модулю не перевищують 100.

Вихідні дані
Єдине число - номер відповідної чверті, або 0, якщо однозначно визначити чверть неможливо.

Вхідні дані
12 31
Вихідні дані
1
*/