package _51_to_75_percent.solution;
/*
Знижки 70%
https://www.e-olymp.com/uk/problems/7337
*/
import java.util.Scanner;
public class Discounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int minPrice = 0;
        int maxPrice = 0;

        if (a<b && a<c) {
            minPrice = a;
        } else if (b<a && b<c) {
            minPrice = b;
        } else if (c<a && c<b) {
            minPrice = c;
        }

        if (a>b && a>c) {
            maxPrice = a;
        } else if (b>a && b>c) {
            maxPrice = b;
        } else if (c>a && c>b) {
            maxPrice = c;
        }

        System.out.println(minPrice + maxPrice);
    }
}