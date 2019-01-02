package _100.percent.solution;
/*
 * Книга 100%
 * https://www.e-olymp.com/uk/problems/577
 */

import java.util.Scanner;

public class Book_577 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberDigits = input.nextInt();
        int numberPages = 0;

        if (numberDigits >= 2887) {
            numberPages += 999 + ( ( numberDigits - 2886 ) / 4 );
        } else if (numberDigits >= 187) {
            numberPages += 99 + ( ( numberDigits - 186 ) / 3 );
        } else if (numberDigits >= 7) {
            numberPages += 9 + ( ( numberDigits - 6 ) / 2 );
        } else {
            numberPages += 3 + numberDigits;
        }

        System.out.println(numberPages);
    }
}

/*
Книга
Крім слідкування за офісом з вікна свого будинку, влітку Василько читав книжку.
Щоб читати було не так нудно, він попутно рахував кількість цифр, які потрібно для нумерації всіх сторінок у книжці.
В результатеі він отримав N цифр.

Вася пом`ятає, що на перших трьох сторінках книжки номери не стоять, а пронумеровані сторінки починаються з 4-ї
(при цьому на цій 4-й сторінці стоїть номер 4, на наступній — 5, і так далі).

Тепер Василька цікавить питання, скільки ж всього сторінок було у прочитаній ним книжці.

Вхідні дані
Вводиться одне натуральне число N (1 ≤ N≤ 10000) — кількість цифр, які було використано для нумерації сторінок книжки.

Вихідні дані
Виведіть кількість сторінок в книжці. Гарантується, що Василько не помилився в підрахунках, і відповідь завжди існує.

Вхідні дані
Sample 1
1
Sample 2
2
Sample 3
3
Sample 4
10

Вихідні дані
Sample 1
4
Sample 2
5
Sample 3
6
Sample 4
11
*/