package _51_to_75_percent_solution;
/*
Скільки до Нового Року? 58%
https://www.e-olymp.com/uk/problems/7366
*/
import java.util.Scanner;

public class ToNewYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int daysToNewYear = seconds/86400;
        int hoursToNewYear = (seconds-daysToNewYear*86400)/3600;
        int minutesToNewYear = (seconds-hoursToNewYear*3600)/60;
        int secondsToNewYear = seconds-minutesToNewYear*60-hoursToNewYear*3600-daysToNewYear*86400;

        System.out.println(daysToNewYear+ " " +hoursToNewYear+ " "+ minutesToNewYear+ " " +secondsToNewYear);
    }
}