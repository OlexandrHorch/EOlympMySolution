package _100.percent.solution;
/*
Кульки 100%
https://www.e-olymp.com/uk/problems/113
*/
import java.util.Arrays;
import java.util.Scanner;

public class Balloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] allBalloons = new int[arraySize];

        for (int indexAllBalloons = 0; indexAllBalloons < arraySize; indexAllBalloons++) {
            allBalloons[indexAllBalloons] = Integer.parseInt(scanner.next());
        }

        int[] sameBalloons = new int[9];

        for (int indexAllBalloons = 0; indexAllBalloons < arraySize; indexAllBalloons++) {
            if (allBalloons[indexAllBalloons] == 1) {
                sameBalloons[0]++;
            } else if (allBalloons[indexAllBalloons] == 2) {
                sameBalloons[1]++;
            } else if (allBalloons[indexAllBalloons] == 3) {
                sameBalloons[2]++;
            } else if (allBalloons[indexAllBalloons] == 4) {
                sameBalloons[3]++;
            } else if (allBalloons[indexAllBalloons] == 5) {
                sameBalloons[4]++;
            } else if (allBalloons[indexAllBalloons] == 6) {
                sameBalloons[5]++;
            } else if (allBalloons[indexAllBalloons] == 7) {
                sameBalloons[6]++;
            } else if (allBalloons[indexAllBalloons] == 8) {
                sameBalloons[7]++;
            } else if (allBalloons[indexAllBalloons] == 9) {
                sameBalloons[8]++;
            }
        }

        Arrays.sort(sameBalloons);

        System.out.println(allBalloons.length - sameBalloons[8]);
    }
}