package in.stage.of.resolution;
/*
 * Кількість іграшок ___%
 * https://www.e-olymp.com/uk/problems/927
 */

import java.util.Scanner;

public class NumberOfToys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        float[][] array = new float[size][2];

        for (int i = 0; i < size; i++) {
            array[i][0] = Float.parseFloat(input.next());
            array[i][1] = Float.parseFloat(input.next());
        }

        int result = 0;
        for (int i = 0; i < size; i++) {
            if (array[i][1] < 50) {
                result += array[i][0];
            }
        }

        System.out.println(result);
    }
}

/*
Кількість іграшок
Задано кількість видів іграшок в магазині, кількість іграшок кожного виду та вартість іграшки кожного виду.
Визначити кількість іграшок, вартість яких менша за 50 грн.

Вхідні дані
У першому рядку задано кількість наявних у прейскуранті видів іграшок n (0 ≤ n ≤ 1000).
У наступних n рядках задано по 2 числа через пропуск:
спочатку кількість іграшок a (0 ≤ a ≤ 1000) чергового виду та їх ціна b (0 < b ≤ 10000) в грн.

Вихідні дані
Вивести кількість іграшок, вартість яких менша за 50 грн.

Вхідні дані #1
3
2 100.00
5 23.00
10 22.50
Вихідні дані #1
15
*/