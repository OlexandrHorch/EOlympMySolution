package in.stage.of.resolution;
/*
 * Периметр та площа трикутника ___%
 * https://www.e-olymp.com/uk/problems/925
 */

import java.util.Scanner;

public class PerimeterAndAreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] coordinates = new double[6];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = input.nextDouble();
        }


        double perimeter = 0;
        double area = 0;
        double result = 0;
        System.out.printf("%.4f", result);
    }
}

// http://www.mathros.net.ua/ploshha-trykutnyka-zadanogo-koordynatamy-svoih-vershyn.html
/*
Периметр та площа трикутника
Задано дійсні числа x1, y1, x2, y2, x3, y3, значення яких відповідають координатам вершин трикутника.
Визначити периметр та площу трикутника.

Вхідні дані
У єдиному рядку через пропуск задано координати вершин трикутника:
6 чисел x1, y1, x2, y2, x3, y3, значення яких не перевищують за модулем 100.

Вихідні дані
В єдиному рядку вивести периметр та площу трикутника, обчислену з точністю до 4-х знаків після десяткової крапки.

Ліміт часу 1 секунд     Ліміт використання пам'яті 122.17 MiB

Вхідні дані
3 2 7 6.5 10 1
Вихідні дані
19.3568 17.7500
*/