package in.stage.of.resolution;
/*
 * Середня зарплата ___%
 * https://www.e-olymp.com/uk/problems/568
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AverageSalary_568 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> salaryArray = new ArrayList<Float>();

        for (int i = 1000; i > 0; i--) {
            salaryArray.add(input.nextFloat());
        }

        int numberOfEmployees = 0;
        float allSalary = 0;
        for (int j = 0; j < salaryArray.size(); j++) {
            if (salaryArray.get(j) > 0) {
                allSalary += salaryArray.get(j);
                numberOfEmployees++;
            }
        }

        float averageSalary = allSalary / numberOfEmployees;

        System.out.printf("%.2f", averageSalary);
    }
}

/*
Середня зарплата
На деякому підприємстві працює деяка кількість працівників, але не менше двох: директора і головного бухгалтера.
Відомо також, що кількість працюючих не перевищує 1000.
Знаючи заробітну плату кожного працівника визначити середню зарплату на підприємстві.

Вхідні дані
Заробітні плати працівників (не обов’язково в одному рядку) в гривнах.

Вихідні дані
Середня зарплата на підприємстві в гривнах з точністю 2 знаки після десяткової крапки.

Вхідні дані
100.50 300.50
Вихідні дані
200.50
*/


/*
        Scanner inputData = new Scanner(System.in);
        String salary = inputData.nextLine();

        String[] strSalaryArray = salary.split("[ ]");

        float[] salaryArray = new float[strSalaryArray.length];
        for (int i = 0; i < strSalaryArray.length; i++) {
            salaryArray[i] = Float.parseFloat(strSalaryArray[i]);
        }

        float sumAllSalary = 0;
        for (int i = 0; i < salaryArray.length; i++) {
            sumAllSalary += salaryArray[i];
            System.out.println(salaryArray[i]);
        }

        float averageSalary = sumAllSalary / salaryArray.length;

        System.out.printf("%.2f", averageSalary);
*/