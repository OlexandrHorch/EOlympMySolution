package _100.percent.solution;
/*
Кульки 100%
https://www.e-olymp.com/uk/problems/113
*/
import java.util.Arrays;
import java.util.Scanner;

public class Balloons_113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] allBalloons = new int[arraySize];

        for (int indexAllBalloons = 0; indexAllBalloons < arraySize; indexAllBalloons++) {
            allBalloons[indexAllBalloons] = Integer.parseInt(scanner.next());
        }

        int[] sameBalloons = new int[9];

        for (int indexAllBalloons = 0; indexAllBalloons < arraySize; indexAllBalloons++) {
            if (allBalloons[indexAllBalloons] == 1) {
                sameBalloons[0]++;
            } else if (allBalloons[indexAllBalloons] == 2) {
                sameBalloons[1]++;
            } else if (allBalloons[indexAllBalloons] == 3) {
                sameBalloons[2]++;
            } else if (allBalloons[indexAllBalloons] == 4) {
                sameBalloons[3]++;
            } else if (allBalloons[indexAllBalloons] == 5) {
                sameBalloons[4]++;
            } else if (allBalloons[indexAllBalloons] == 6) {
                sameBalloons[5]++;
            } else if (allBalloons[indexAllBalloons] == 7) {
                sameBalloons[6]++;
            } else if (allBalloons[indexAllBalloons] == 8) {
                sameBalloons[7]++;
            } else if (allBalloons[indexAllBalloons] == 9) {
                sameBalloons[8]++;
            }
        }

        Arrays.sort(sameBalloons);

        System.out.println(allBalloons.length - sameBalloons[8]);
    }
}

/*
Кульки
У продавця повітряних кульок є n кульок. Кожна з них має деякий колір.
Але зовсім недавно Три Товстуни видали наказ, який дозволяє торгувати кульками тільки якогось одного кольору.
Щоб не порушувати закон, але при цьому і не втратити прибуток, продавець вирішив перефарбувати деякі із своїх кульок.
Напишіть програму для визначення мінімальної кількості перефарбувань.

Вхідні дані
В першому рядку задано кількість кульок n (1 ≤ n ≤ 100000).
Другий рядок містить n цілих чисел, в межах від 1 до 9, що визначає колір кульок
(1 - синій, 2 - зелений, 3 - голубий, 4 - червоний, 5 - рожевий, 6 - жовтий, 7 - сірий, 8 - чорний, 9 - білий).

Вихідні дані
Виведіть мінімальну кількість кульок, які необхідно перефарбувати, щоб всі кульки були одного кольору.

Вхідні дані #1
4
3 1 2 1

Вихідні дані #1
2
*/