package _100.percent.solution;
/*
Торт 100%
https://www.e-olymp.com/uk/problems/774
*/
import java.util.Scanner;

public class Pie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = Integer.parseInt(input.next());
        int width = Integer.parseInt(input.next());
        int length = Integer.parseInt(input.next());

        double rectangleDiagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        if (radius >= rectangleDiagonal / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}