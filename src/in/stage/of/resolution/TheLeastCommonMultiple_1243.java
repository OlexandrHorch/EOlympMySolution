package in.stage.of.resolution;
/*
 * Найменше спільне кратне ___%
 * https://www.e-olymp.com/uk/problems/1243
 */

import java.util.Scanner;

public class TheLeastCommonMultiple_1243 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfTests = input.nextInt();
        int[][] array = new int[numberOfTests][100];

        for (int i = 0; i < numberOfTests; i++) {
            System.out.print("Test " + i + " ");
            array[i][0] = Integer.parseInt(input.next());
            array[i][1] = 0;
            for (int j = 2; j <= array[i][0] + 1; j++) {
                array[i][j] = Integer.parseInt(input.next());
            }
        }


        for (int i = 0; i < numberOfTests; i++) {
            System.out.print("Test#" + i + " елементів " + array[i][0] + " => ");
            for (int j = 1; j <= array[i][0] + 1; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }





    }
}
/*
Найменше спільне кратне
Найменшим спільним кратним (НСК) множини натуральних чисел називається таке найменше натуральне число,
яке ділиться на кожне число в цій множині. Наприклад, НСК чисел 5, 7 та 15 дорівнює 105.

Вам слід знайти НСК m заданих чисел.

Вхідні дані
Перший рядок містить кількість тестів.
Кожний тест складається з одного рядка та містить числа mn1 n2 n3 ... nm, де m (1 ≤ m ≤ 100) - кількість чисел у множині,
n1 ... nm - самі числа.
Усі числа натуральні та знаходяться в межах 32-бітового цілого.

Вихідні дані
Для кожного тесту в окремому рядку вивести відповідне значення НСК.
Усі числа що виводяться знаходяться в межах 32-бітового цілого.

Вхідні дані #1
2
3 5 7 15
6 4 10296 936 1287 792 1

Вихідні дані #1
105
10296
*/