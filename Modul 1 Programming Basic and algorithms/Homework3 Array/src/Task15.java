/*
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене на големината на масивите
        System.out.println("Моля, въведете големина на масива:");
        int lenghtArr = scanner.nextInt();

        while (lenghtArr <= 0) {
            System.out.println("Моля, въведете цяло положително число:");
            lenghtArr = scanner.nextInt();
        }

        //въвеждане на стойности в масива
        System.out.println("Моля, въведете " + lenghtArr + " числа:");
        double[] array = new double[lenghtArr];

        for (int i = 0; i < lenghtArr; i++) {
            array[i] = scanner.nextDouble();
        }

        //намираме 3-те най-големи числа
        double[] array2 = new double[3];
        double max = Math.abs(array[0]);
        int index = 0;

        for (int j = 0; j < array2.length; j++) {
            for (int i = 1; i < array.length; i++) {
                if (Math.abs(array[i]) >= max) {
                    max = Math.abs(array[i]);
                    index = i;
                }
            }
            array2[j] = max;
            //по-добре ли е да запазя оригиналния масив и да променям стойностите на негово копие?
            array[index] = 0;
            max = Double.MIN_VALUE;
        }

        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + " ");
        }
    }
}