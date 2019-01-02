package in.stage.of.resolution;
/*
 * Поставка содової води ___%
 * https://www.e-olymp.com/uk/problems/542
 */

import java.util.Scanner;

public class SupplySodaWater_542 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bottles = input.nextInt();
        int newBottles = input.nextInt();
        int bottlesForBuy = input.nextInt();

        int bottlesForDrink = 0;
        int sumBottlesForDrink = 0;

        while (( bottles + newBottles ) >= bottlesForBuy) {
            newBottles = bottles + newBottles + bottlesForDrink;
            bottles = 0;
            bottlesForDrink = (newBottles + bottlesForDrink) / bottlesForBuy;
            sumBottlesForDrink += newBottles / bottlesForBuy;
            newBottles = bottlesForDrink + (newBottles % bottlesForBuy);
            bottlesForDrink = 0;
        }

        System.out.println(sumBottlesForDrink);
    }
}

/*
Поставка содової води
Тім дуже полюбляє содову воду, іннколи він нею ніяк не може напитися.
Ще більш прикрим є той факт, що у нього постійно бракує грошей.
Тому єдиним легальним способом їх отримання є продаж порожніх пляшок з-під соди.
Іноді на додаток до його особисто випитих пляшок додаються ті, які Тім іноді знаходить на вулиці.
Одного дня Тіма настільки замучила спрага, що він вирішив пити до тих пір поки міг собі це дозволити.

Вхідні дані
Три цілі невід'ємні числа e, f, c, де:
e (e < 1000) - кількість порожніх пляшок, які є у Тіма на початку дня,
f (f < 1000) - кількість порожніх пляшок, знайдених протягом дня, і
c (1 < c < 2000) - кількість порожніх пляшок, необхідних для покупки нової пляшки.

Вихідні дані
Скільки пляшок содової води зможе випити Тім, коли його замучила спрага?

Вхідні дані #1
9 0 3
Вихідні дані #1
4

Вхідні дані #2
5 5 2
Вихідні дані #2
9
*/


/*
import java.util.Scanner;

public class SupplySodaWater_542 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bottles = input.nextInt();
        int newBottles = input.nextInt();
        int bottlesForBuy = input.nextInt();

        int bottlesForDrink = 0;
        int sumBottlesForDrink = 0;

        while (( bottles + newBottles ) >= bottlesForBuy) {
            newBottles = bottles + newBottles + bottlesForDrink;
            bottles = 0;
            System.out.println("bottles = " + bottles + "\t | newBottles = " + newBottles + "\t | bottlesForBuy = " + bottlesForBuy);
            bottlesForDrink = (newBottles + bottlesForDrink) / bottlesForBuy;

            sumBottlesForDrink += newBottles / bottlesForBuy;
            System.out.println("newBottles = " + newBottles + "\t | bottlesForDrink = " + bottlesForDrink + "\t | sumBottlesForDrink = " + sumBottlesForDrink);

            newBottles = bottlesForDrink + (newBottles % bottlesForBuy);
            bottlesForDrink = 0;
            System.out.println("newBottles = " + newBottles + "\n******************************************************************************\n");
        }

        System.out.println(sumBottlesForDrink);
    }
}
*/