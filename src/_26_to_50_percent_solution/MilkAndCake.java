package _26_to_50_percent_solution;
/*
Молоко та пиріжок 45%
https://www.e-olymp.com/uk/problems/7365
*/
import java.util.Scanner;

public class MilkAndCake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPupils = input.nextInt();
        int [] arrayPupils = new int [numberOfPupils];
        double milkForOne = 0.2;
        double milkInPackage = 0.9;
        int cakeForOne = 1;
        double milkForAll = 0;
        int milkPackagesForOrder = 0;
        int cakesForOrder = 0;

        // Input arrayPupils
        for (int p = 0; p < numberOfPupils; p++) {
            arrayPupils [p] = Integer.parseInt(input.next());
        }

        // Determination of additional quantity milk and cakes
        for (int p = 0; p < numberOfPupils; p++) {
            if (arrayPupils [p] < 30) {
                milkForAll += milkForOne;
                cakesForOrder += cakeForOne;
            }
        }

        // Determine number of additional milk packages
        if (milkForAll > 0) {
            milkPackagesForOrder +=1;
            for (double milk = milkForAll; milk > 0.9; milk -= milkInPackage) {
                milkPackagesForOrder += 1;
            }
        }

        System.out.println(milkPackagesForOrder+ " " +cakesForOrder);
    }
}
