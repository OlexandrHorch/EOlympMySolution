package in.stage.of.resolution;
/*
 * Рівень навчальних досягнень ___%
 * https://www.e-olymp.com/uk/problems/902
 */
import java.util.Scanner;

public class LevelEducationalAchievements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mark = input.nextInt();

        if (mark >= 1 && mark <= 3) {
            System.out.println("Initial");
        } else if (mark >= 4 && mark <= 6) {
            System.out.println("Average");
        } else if (mark >= 7 && mark <= 9) {
            System.out.println("Sufficient");
        } else if (mark >= 10 && mark <= 12) {
            System.out.println("High");
        }
    }
}