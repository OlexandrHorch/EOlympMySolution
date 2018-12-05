package in.stage.of.resolution;
/*
 * Сума найбільшого та найменшого ___%
 * https://www.e-olymp.com/uk/problems/928
 */

import java.util.Arrays;
import java.util.Scanner;

public class AmountLargestAndLeast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[0] + array[size - 1]);
    }
}

/*
Сума найбільшого та найменшого
Задано масив цілих чисел. Визначити суму найменшого та найбільшого елементів масиву.

Вхідні дані
У першому рядку задано кількість елементів масиву n (n ≤ 100).
У другому рядку задано n елементів масиву, значення кожного з яких за модулем не перевищує 100.

Вихідні дані
Вивести суму найменшого та найбільшого елементів масиву.

Ліміт часу 1 секунд
Ліміт використання пам'яті 122.17 MiB
Вхідні дані #1
4
1 2 3 4
Вихідні дані #1
5
*/