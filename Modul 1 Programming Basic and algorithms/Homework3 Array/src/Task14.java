/*
Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2

 */

import java.util.Scanner;

public class Task14 {
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
        int count = 0;

        for (int i = 0; i < lenghtArr; i++) {
            array[i] = scanner.nextDouble();
            if (array[i] >= -2.99 && array[i] <= 2.99) {
                count++;
            }
        }

        double[] array2 = new double[count];
        int index = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] >= -2.99 && array[j] <= 2.99) {
                array2[index] = array[j];
                index++;
            }
        }

        //Отпечатване на резултата
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
