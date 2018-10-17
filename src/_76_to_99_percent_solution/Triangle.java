package In_stage_of_resolution;
/*
Трикутник 80%
https://www.e-olymp.com/uk/problems/653
*/

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = Integer.parseInt(input.next());
        int B = Integer.parseInt(input.next());
        int C = Integer.parseInt(input.next());

        double a = ( Math.acos(( Math.pow(A, 2) + Math.pow(B, 2) - Math.pow(C, 2) ) / ( 2 * A * B )) ) * 180 / Math.PI;
        double b = ( Math.acos(( Math.pow(B, 2) + Math.pow(C, 2) - Math.pow(A, 2) ) / ( 2 * B * C )) ) * 180 / Math.PI;
        double c = ( Math.acos(( Math.pow(A, 2) + Math.pow(C, 2) - Math.pow(B, 2) ) / ( 2 * A * C )) ) * 180 / Math.PI;

        if (A + B <= C || A + C <= B || B + C <= A) {
            System.out.println("IMPOSSIBLE");
        }
        if (a < 90 && b < 90 && c < 90) {
            System.out.println("ACUTE");
        }
        if (a > 90 || b > 90 || c > 90) {
            System.out.println("OBTUSE");
        }
        if (a == 90 || b == 90 || c == 90) {
            System.out.println("RIGHT");
        }
    }
}