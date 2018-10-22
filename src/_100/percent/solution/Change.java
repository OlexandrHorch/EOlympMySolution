package in.stage.of.resolution;
/*
Обмін ___%
https://www.e-olymp.com/uk/problems/407
*/

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantityTests = input.nextInt();
        int[] testsArray = new int[quantityTests];
        for (int test = 0; test < quantityTests; test++) {
            testsArray[test] = input.nextInt();
        }

        for (int test = 0; test < testsArray.length; test++) {
            String[] flowers = {"G", "C", "V"};
            for (int day = 0; day < testsArray[test]; day++) {
                String tempFlower = "";
                tempFlower = flowers[2];
                flowers[2] = flowers[1];
                flowers[1] = tempFlower;

                tempFlower = flowers[0];
                flowers[0] = flowers[1];
                flowers[1] = tempFlower;
            }
            System.out.println(flowers[0] + flowers[1] + flowers[2]);
        }
    }
}