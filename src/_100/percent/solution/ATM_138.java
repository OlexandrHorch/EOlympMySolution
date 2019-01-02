package _100.percent.solution;
/*
 * Банкомат 100%
 * https://www.e-olymp.com/uk/problems/138
 */

import java.util.Scanner;

public class ATM_138 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeric = input.nextInt();
        int numberBills = 0;

        if (numeric % 10 != 0) {
            System.out.println(-1);
        } else if (numeric > 0) {
            numberBills += numeric / 500;
            numeric = numeric % 500;

            numberBills += numeric / 200;
            numeric = numeric % 200;

            numberBills += numeric / 100;
            numeric = numeric % 100;

            numberBills += numeric / 50;
            numeric = numeric % 50;

            numberBills += numeric / 20;
            numeric = numeric % 20;

            numberBills += numeric / 10;
            numeric = numeric % 10;

            System.out.println(numberBills);
        }
    }
}

/*
Банкомат
Банкомат містить в достатній кількості купюри номіналом 10, 20, 50, 100, 200 і 500 гривень.
Знайти найменшу кількість купюр, якою можна видати суму в n гривень, або вивести -1, якщо вказану суму видати не можна.

Вхідні дані
Одне число n (1≤n≤1000000).

Вихідні дані
Найменша кількість купюр, якою можна видати n гривень.

Вхідні дані
770
Вихідні дані
4
*/