package _100.percent.solution;
/*
 * Висоти трикутника 100%
 * https://www.e-olymp.com/uk/problems/934
 */

import java.util.Scanner;

public class HeightsOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float p = ( a + b + c ) / 2;

        float ha = (float) ( 2 * Math.sqrt(p * ( p - a ) * ( p - b ) * ( p - c )) / a );
        float hb = (float) ( 2 * Math.sqrt(p * ( p - a ) * ( p - b ) * ( p - c )) / b );
        float hc = (float) ( 2 * Math.sqrt(p * ( p - a ) * ( p - b ) * ( p - c )) / c );

        System.out.printf("%.2f %.2f %.2f", ha, hb, hc);
    }
}

/*
// помилка в умові числа!!!

Висоти трикутника
Обчислити висоти трикутника зі сторонами a, b, c.

Вхідні дані
У єдиному рядку через пропуск три натуральні числа - сторони трикутника: a, b, c. Всі вхідні дані не перевищують 100.

Вихідні дані
Висоти, опущені до відповідних сторін через пропуск: ha, hb, hc. Результат вивести з точністю 2 цифри після десяткової крапки.

Ліміт часу 1 секунда
Ліміт використання пам'яті 128 MiB
Вхідні дані #1
3 4 5
Вихідні дані #1
4.00 3.00 2.40
*/