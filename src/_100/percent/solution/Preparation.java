package _100.percent.solution;
/*
Підготовка 100%
https://www.e-olymp.com/uk/problems/775
*/

import java.util.Arrays;
import java.util.Scanner;

public class Preparation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantityCollection = Integer.parseInt(input.next());
        int quantityTasksInOlympiad = Integer.parseInt(input.next());
        int quantityOlympiad = Integer.parseInt(input.next());

        int[] quantityTasksInCollection = new int[quantityCollection];
        for (int collection = 0; collection < quantityCollection; collection++) {
            quantityTasksInCollection[collection] = Integer.parseInt(input.next());
        }

        Arrays.sort(quantityTasksInCollection);

        int minQuantityCollection = 0;
        int leftToSolveTasks = quantityTasksInOlympiad * quantityOlympiad;

        int collection = quantityCollection - 1;

        while (leftToSolveTasks >= 1) {
            minQuantityCollection += 1;
            leftToSolveTasks -= quantityTasksInCollection[collection];
            collection -= 1;
        }

        System.out.println(minQuantityCollection);
    }
}

/*
import java.util.Arrays;
import java.util.Scanner;

public class Preparation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantityCollection = Integer.parseInt(input.next());
        int quantityTasksInOlympiad = Integer.parseInt(input.next());
        int quantityOlympiad = Integer.parseInt(input.next());

        int[] quantityTasksInCollection = new int[quantityCollection];
        for (int collection = 0; collection < quantityCollection; collection++) {
            quantityTasksInCollection[collection] = Integer.parseInt(input.next());
        }

        Arrays.sort(quantityTasksInCollection);
        for (int i = 0; i < quantityTasksInCollection.length; i++) {
            System.out.print(i + "=" + quantityTasksInCollection[i] + " | ");
        }

        int minQuantityCollection = 0;
        int leftToSolveTasks = quantityTasksInOlympiad * quantityOlympiad;
        System.out.println("\nк-ть задач = " + leftToSolveTasks);

        int collection = quantityCollection - 1;

        while (leftToSolveTasks >= 1) {
            System.out.print("інд.кол. = " + collection + "\tзнач.кол. = " + quantityTasksInCollection[collection] + "\t");

            minQuantityCollection += 1;
            System.out.print("мін.к.зб. = " + minQuantityCollection + "\t");

            leftToSolveTasks -= quantityTasksInCollection[collection];
            System.out.println("залишилося виконати задач = " + leftToSolveTasks);

            collection -= 1; // наступна збірка
        }

        System.out.println("\nмінімальна кількість збірників = " + minQuantityCollection);
    }
}
*/