package in.stage.of.resolution;
/*
 * Сила криптографії ___%
 * https://www.e-olymp.com/uk/problems/1205
 */

import java.util.Scanner;

public class PowerOfCryptography_1205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long p = input.nextInt();

        int z = (int) Math.pow(p, 1.0 / n);
        System.out.print(z);
    }
}

/*
Сила криптографії
За заданими цілими значеннями n ≥ 1 і p ≥ 1 необхідно обчислити prb1205, додатній n-ий корінь числа p.
Відомо, що завжди існує таке ціле k, що kn = p.

Вхідні дані
Задано два числа n та p (1 ≤ n ≤ 300, 1 ≤ p ≤ 10100). Відомо, що завжди існує таке ціле k (1 ≤ k ≤ 109), що kn = p.

Вихідні дані
Вивести значення, тобто таке k, що kn = p.

Вхідні дані #1
2 16
Вихідні дані #1
4

Вхідні дані #2
3 27
Вихідні дані #2
3

Вхідні дані #3
7 4357186184021382204544
Вихідні дані #3
1234
 */