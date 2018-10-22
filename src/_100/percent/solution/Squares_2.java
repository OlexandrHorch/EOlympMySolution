package _100_percent_solution;
/*
Квадрати-2 100%
https://www.e-olymp.com/uk/problems/146
*/
import java.util.Scanner;

public class Squares_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersOperations = input.nextInt();
        double figureArea = 100;
        double blackFigureArea = 0;

        for (int operation = numbersOperations; operation >= 1; operation--) {
            figureArea = figureArea / 4;
            blackFigureArea += figureArea * 2;
        }

        System.out.println(String.format("%.5f", blackFigureArea));
    }
}
