package _100.percent.solution;
/*
 * День народження 100%
 * https://www.e-olymp.com/uk/problems/1159
 */

import java.util.Scanner;

public class Birthday_1159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();

        int[] arrayMonth = new int[12];
        for (int m = 1; m <= 12; m++) {
            arrayMonth[m - 1] = m * 31;
        } // month * 31

        float[] arrayDay = new float[12];
        for (int i = 0; i < 12; i++) {
            arrayDay[i] = (float) ( sum - arrayMonth[i] ) / 12;
        } // (sum - month * 31) / 12

        int monthIndex = 0;
        int day = 0;
        for (int i = 0; i < 12; i++) {
            if (arrayDay[i] % 1 == 0) {
                day = (int) arrayDay[i];
                monthIndex = i;
            }
        }
        int month = arrayMonth[monthIndex] / 31;

        if (day < 10 && month < 10) {
            System.out.println("0" + day + "/0" + month);
        } else if (day >= 10 && month < 10) {
            System.out.println(day + "/0" + month);
        } else if (day < 10 && month >= 10) {
            System.out.println("0" + day + "/" + month);
        } else if (day >= 10 && month >= 10) {
            System.out.println(day + "/" + month);
        }
    }
}

/*
День народження
Вася подивився виступ Девіда Коперфілда і вирішив вразити своїх однокласників власними фокусами.
Ось один з них: Вася пропонує однокласнику помножити число дати його народження на 12,
а номер місяця - на 31 и повідомити йому суму обох добутків, після чого швидко називає його дату народження.
Оскільки до Васі почала вишуковуватись черга і він втомився, він просить Вас написати програму,
яка буде показувати цей фокус замість нього.

Вхідні дані
Єдине число - отримана сума Васиним однокласником.

Вихідні дані
Єдиний рядок - день і месяц народження однокласника Васі у форматі "ДД / ММ".

Вхідні дані #1
170
Вихідні дані #1
09/02
*/