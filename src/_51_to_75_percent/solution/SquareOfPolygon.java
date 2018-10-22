package _51_to_75_percent.solution;
/*
Площа многокутника 75%
https://www.e-olymp.com/uk/problems/851
*/

import java.util.Scanner;

public class SquareOfPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantitySides = input.nextInt();
        int[][] sidesArray = new int[quantitySides][2];
        for (int pointIndex = 0; pointIndex < sidesArray.length; pointIndex++) {
            sidesArray[pointIndex][0] = Integer.parseInt(input.next());
            sidesArray[pointIndex][1] = Integer.parseInt(input.next());
        }

        int[][] sidesArray2 = new int[quantitySides + 1][2];
        System.arraycopy(sidesArray, 0, sidesArray2, 0, sidesArray.length);
        sidesArray2[quantitySides][0] = sidesArray[0][0];
        sidesArray2[quantitySides][1] = sidesArray[0][1];

        double i = 0;
        for (int pointIndex = 0; pointIndex + 1 < sidesArray2.length; pointIndex++) {
            i += ( sidesArray2[pointIndex][0] * sidesArray2[pointIndex + 1][1] - sidesArray2[pointIndex + 1][0] * sidesArray2[pointIndex][1] );
        }
        double squareOfPolygon = Math.abs(i / 2);

        System.out.println(squareOfPolygon);
    }
}


/*
import java.util.Scanner;

public class SquareOfPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantitySides = input.nextInt();
        int[][] sidesArray = new int[quantitySides][2];
        for (int pointIndex = 0; pointIndex < sidesArray.length; pointIndex++) {
            System.out.println("pointIndex = " + pointIndex);
            sidesArray[pointIndex][0] = Integer.parseInt(input.next());
            sidesArray[pointIndex][1] = Integer.parseInt(input.next());
        }

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        int[][] sidesArray2 = new int[quantitySides + 1][2];
        System.arraycopy(sidesArray, 0, sidesArray2, 0, sidesArray.length);
        sidesArray2[quantitySides][0] = sidesArray[0][0];
        sidesArray2[quantitySides][1] = sidesArray[0][1];

        for (int pointIndex = 0; pointIndex < sidesArray2.length; pointIndex++) {
            System.out.println("індекс " + pointIndex + " = " + sidesArray2[pointIndex][0] + " та " + sidesArray2[pointIndex][1]);
        }

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        double i = 0;
        for (int pointIndex = 0; pointIndex + 1 < sidesArray2.length; pointIndex++) {
            System.out.print("індекс " + pointIndex + "\t" + "індекс+1 " + ( pointIndex + 1 ) + "  \t");
            i += ( sidesArray2[pointIndex][0] * sidesArray2[pointIndex + 1][1] - sidesArray2[pointIndex + 1][0] * sidesArray2[pointIndex][1] );
            System.out.print("результат обчислень = " +
                    ( sidesArray2[pointIndex][0] * sidesArray2[pointIndex + 1][1] - sidesArray2[pointIndex + 1][0] * sidesArray2[pointIndex][1] ) + "\t\t");
            System.out.println("сума обчислень = " + i);
        }
        double squareOfPolygon = Math.abs(i / 2);

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("полоща многокутника = " + squareOfPolygon);
    }
}
*/