package _100.percent.solution;
/*
Гарбузова каша 100%
https://www.e-olymp.com/uk/problems/260
*/
import java.util.Scanner;

public class PumpkinPorridge {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int numberPumpkin = inputData.nextInt();
        int[] arrayPumpkin = new int[numberPumpkin];

        // Input arrayPupils
        for (int p = 0; p < numberPumpkin; p++) {
            arrayPumpkin[p] = Integer.parseInt(inputData.next());
        }

        // Sorting
        int temp = 0;
        for (int i = 0; i < arrayPumpkin.length; i++) {
            for (int j = 1; j < ( arrayPumpkin.length - i ); j++) {
                if (arrayPumpkin[j - 1] < arrayPumpkin[j]) {
                    temp = arrayPumpkin[j - 1];
                    arrayPumpkin[j - 1] = arrayPumpkin[j];
                    arrayPumpkin[j] = temp;
                }
            }
        }

        // Output result
        for (int i = 0; i < arrayPumpkin.length; i++) {
            System.out.print(arrayPumpkin[i] + " ");
        }
    }
}