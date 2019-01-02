package _76_to_99_percent_solution;
/*
 * Добуток масиву крім самого себе 85%
 * https://www.e-olymp.com/uk/problems/937
 */

import java.util.Scanner;

public class ProductArrayWithoutThemself_937 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] arrayIn = new int[size];
        for (int i = 0; i < size; i++) {
            arrayIn[i] = input.nextInt();
        }

        int[] arrayOut = new int[size];
        for (int j = 0; j < size; j++) {
            arrayOut[j] = 1;
            for (int i = 0; i < size; i++) {
                if (i != j) {
                    arrayOut[j] = arrayOut[j] * arrayIn[i];
                }
            }
        }

        for (int j = 0; j < size; j++) {
            System.out.print(arrayOut[j] + " ");
        }
    }
}

/*
Добуток масиву крім самого себе
Дано масив in з n цілих чисел. Побудуйте масив out такий, що outi дорівнює добутку всіх елементів масива in крім ini.
Розв'яжіть задачу за O(n) і з константною складністю пам'яті.

Вхідні дані
Перший рядок містить число n (1 < n ≤ 106). Другий рядок містить n цілих чисел, кожне з яких по модулю не більше 100.

Вихідні дані
Виведіть масив out. Відомо, що всі вихідні числа по модулю не більші 2 *109.

Вхідні дані #1
4
1 2 3 4
Вихідні дані #1
24 12 8 6
*/