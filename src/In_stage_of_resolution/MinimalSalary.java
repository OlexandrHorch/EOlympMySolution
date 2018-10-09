package In_stage_of_resolution;
/*
Мінімальна зарплата __%
https://www.e-olymp.com/uk/problems/352
*/
import java.util.Scanner;

public class MinimalSalary {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        float[] arraySalary = new float[5]; // Як визначити довжину масиву?

        for (int i = 0; i < arraySalary.length; i++) {
            arraySalary[i] = Float.parseFloat(inputData.next());
        }

        // Sorting
        float temp = 0;
        for (int i = 0; i < arraySalary.length; i++) {
            for (int j = 1; j < ( arraySalary.length - i ); j++) {
                if (arraySalary[j - 1] < arraySalary[j]) {
                    temp = arraySalary[j - 1];
                    arraySalary[j - 1] = arraySalary[j];
                    arraySalary[j] = temp;
                }
            }
        }

        System.out.println(String.format("%.2f", arraySalary[0]));
    }
}
