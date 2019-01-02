package in.stage.of.resolution;
/*
 * Послідовність ___%
 * https://www.e-olymp.com/uk/problems/575
 */

import java.util.Scanner;

public class Sequence_575 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int position = 0;

        if (k >= 1 && k <= 3) {
            position = k;
        } else {
            position = 3+((k-3)*3);
        }

        System.out.println(position);
    }
}

/*
Послідовність
Вася захопився винайденням нових послідовностей та їх дослідженням.
Цього разу він написав на дошці послідовність: 1 2 3 2 3 4 3 4 5 4 5 6 5 6 7 ...
Після цього Васю зацікавило питання, а на якому місці у ній вперше зустрінеться число k?
Напишіть програму, яка дає відповідь на його питання.

Вхідні дані
Вводиться натуральне число k (1 ≤ k≤ 100).

Вихідні дані
Виведіть одне число – шукану позицію, у якій вперше зустрілось число k. Члени послідовності нумеруються з одиниці.

Вхідні дані
Sample 1
1
Sample 2
2
Sample 3
4

Вихідні дані
Sample 1
1
Sample 2
2
Sample 3
6
*/