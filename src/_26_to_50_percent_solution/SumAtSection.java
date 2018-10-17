package In_stage_of_resolution;
/*
Сума на відрізку 43%
https://www.e-olymp.com/uk/problems/682
*/

import java.util.Scanner;

public class SumAtSection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Array of numbers
        int numberNumbers = input.nextInt();
        int[] numbersArray = new int[numberNumbers];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(input.next());
        }

// Array of requests
        int numberRequests = input.nextInt();
        int[][] arrayRequests = new int[numberRequests][2];

        for (int requestNumber = 0; requestNumber < numberRequests; requestNumber++) {
            arrayRequests[requestNumber][0] = Integer.parseInt(input.next());
            arrayRequests[requestNumber][1] = Integer.parseInt(input.next());
        }

// Array of results
        int[] arrayResults = new int[numberRequests];
        for (int i = 0; i < arrayRequests.length; i++) {
            for (int requestElement = arrayRequests[i][0]; requestElement <= arrayRequests[i][1]; requestElement++) {
                arrayResults[i] += numbersArray[requestElement - 1];
            }
        }


// Output
        for (int i = 0; i < arrayResults.length; i++) {
            System.out.println(arrayResults[i]);
        }
    }
}