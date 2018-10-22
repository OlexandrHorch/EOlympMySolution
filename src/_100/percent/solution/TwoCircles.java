package in.stage.of.resolution;
/*
Два кола ___%
https://www.e-olymp.com/uk/problems/4
*/
import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = Double.parseDouble(input.next());
        double y1 = Double.parseDouble(input.next());
        double r1 = Double.parseDouble(input.next());
        double x2 = Double.parseDouble(input.next());
        double y2 = Double.parseDouble(input.next());
        double r2 = Double.parseDouble(input.next());

        double distanceBetweenCenters = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (r1 == r2 && x1 == x2 && y1 == y2) {
            System.out.println(-1);
        } else if (distanceBetweenCenters == r1 + r2 || r1 == r2 + distanceBetweenCenters || r2 == r1 + distanceBetweenCenters) {
            System.out.println(1);
        } else if (distanceBetweenCenters > r1 + r2 || r1 > r2 + distanceBetweenCenters || r2 > r1 + distanceBetweenCenters) {
            System.out.println(0);
        } else {
            System.out.println(2);
        }
    }
}