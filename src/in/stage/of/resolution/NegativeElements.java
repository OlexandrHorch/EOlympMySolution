package in.stage.of.resolution;
/*
 * Від`ємні елементи ___%
 * https://www.e-olymp.com/uk/problems/921
 */

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
            System.out.println(i + " = " + array[i]);
        }

        int numb = 0;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                numb++;
                sum += array[i];
            }
        }

        System.out.printf("%d %.2f", numb, sum);
    }
}

/*
Від`ємні елементи
Задано послідовність дійсних чисел, пронумерованих від 1 до n.
Визначити суму та кількість від’ємних елементів послідовності.

Вхідні дані
У першому рядку задано кількість елементів послідовності n (n ≤ 100).
У наступному рядку задано n дійсних чисел - самі елементи послідовності, значення яких не перевищують за модулем 100.

Вихідні дані
В єдиному рядку вивести кількість шуканих чисел та їх суму з точністю до двох десяткових знаків.

Ліміт часу 1 секунд
Ліміт використання пам'яті 128 MiB

Вхідні дані #1
5
6 -7.5 2.1 -2.0 0

Вихідні дані #1
2 -9.50
*/