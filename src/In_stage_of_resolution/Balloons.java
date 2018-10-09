package In_stage_of_resolution;
/*
Кульки
https://www.e-olymp.com/uk/problems/113
*/
import java.util.Scanner;

public class Balloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість кульок"); //ВИДАЛИТИ для перевірки
        int arraySize = scanner.nextInt();
        int [] array = new int [arraySize];

        System.out.println("Введіть колір кожної кульки"); //ВИДАЛИТИ для перевірки
        for (int elArray = 0; elArray < arraySize; elArray++) {
            array [elArray] = scanner.nextInt();
        }

        // визначити кількість однакових елементів масиву

        // визначити елемент який дублюється найбільше

        // визначети кількість елементів які не дублюється найбільше
    }
}
