package _100.percent.solution;
/*
 * Збільшити на 2 100%
 * https://www.e-olymp.com/uk/problems/904
 */
import java.util.Scanner;

public class EnlargeDy2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrayElementsQuantity = input.nextInt();

        int[] array = new int[arrayElementsQuantity];

        for (int el = 0; el < array.length; el++) {
            array[el] = Integer.parseInt(input.next());
        }

        for (int el = 0; el < array.length; el++) {
            if (array[el] >= 0){
                array[el] +=2;
            }
        }

        for (int el = 0; el < array.length; el++) {
            System.out.print(array[el] + " ");
        }
    }
}