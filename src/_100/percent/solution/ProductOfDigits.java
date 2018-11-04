package in.stage.of.resolution;
/*
* Добуток цифр 100%
* https://www.e-olymp.com/uk/problems/906
*/

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();

        int a = digit / 100;
        int b = digit / 10 % 10;
        int c = ( digit % 100 ) % 10;

        System.out.println(a * b * c);
    }
}