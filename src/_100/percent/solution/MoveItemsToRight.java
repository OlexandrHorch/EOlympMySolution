package _100.percent.solution;
/*
 * Зсунь елементи праворуч 100%
 * https://www.e-olymp.com/uk/problems/922
 */

import java.util.Scanner;

public class MoveItemsToRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int[] newArray = new int[size];
        for (int j = 0; j < size - 1; j++) {
            newArray[j + 1] = array[j];
        }
        newArray[0] = array[size - 1];

        for (int x = 0; x < size; x++) {
            System.out.print(newArray[x] + " ");
        }
    }
}

/*
Зсунь елементи праворуч
Задано масив цілих чисел довжини n. Зсунути елементи масиву циклічно праворуч на 1 крок.

Вхідні дані
У першому рядку задано кількість елементів масиву n (n ≤ 100).
У другому рядку задано самі елементи масиву, значення кожного з яких за модулем не перевищує 100.

Вихідні дані
В єдиному рядку вивести n чисел - нові значення елементів масиву.

Ліміт часу 1 секунд
Ліміт використання пам'яті 128 MiB

Вхідні дані #1
4
1 2 3 4
Вихідні дані #1
4 1 2 3
*/