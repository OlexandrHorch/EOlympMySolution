package _100.percent.solution;
/*
 * Піраміда з символів 100%
 * https://www.e-olymp.com/uk/problems/1119
 */

import java.util.Scanner;

public class PyramidOfCharacters_1119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = input.next();
        int height = input.nextInt();

        int levelWidth = 1;
        int space = height - 1;


        int countLetter = 0;
        for (int l = 0; l < height; l++) {
            countLetter += height + l;
        }
        System.out.println(countLetter);


        for (int level = 1; level <= height; level++) {
            for (int i = space; i > 0; i--) {
                System.out.print(" ");
            }
            space--;

            for (int j = levelWidth; j > 0; j--) {
                System.out.print(letter);
            }
            levelWidth += 2;

            System.out.println();
        }
    }
}

/*
Піраміда з символів
Вася хоче надрукувати на принтері піраміду з якогось символу висотою h.
Напишіть програму, яка допоможе йому у цьому, не забуваючи, що програма повинна бути "економічнои вигідною",
тобто друкувати найменшу кількість символів.
Приклади пірамід наведено у прикладах вхідних та вихідних даних.
Для кращого унаочнення пропуски, що друкуються, замінено на крапки.

Вхідні дані
У єдиному рядку задано спочатку символ, при допомозі якого повинна друкуватись піраміда,
а потім через пропуск і натуральне число, яке задає висоту піраміди h (h ≤ 50).

Вихідні дані
У першому рядку виведіть загальну кількість надрукованих "друкованих" символів а нижче саму піраміду.

Вхідні дані #1
A 3
Вихідні дані #1
12
  A
 AAA
AAAAA

Вхідні дані #2
M 9
Вихідні дані #2
117
        M
       MMM
      MMMMM
     MMMMMMM
    MMMMMMMMM
   MMMMMMMMMMM
  MMMMMMMMMMMMM
 MMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMM
*/