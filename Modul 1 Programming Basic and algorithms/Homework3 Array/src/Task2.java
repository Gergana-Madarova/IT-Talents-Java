/*
Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред.
Последно, да се изведе новия масив на екрана.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене на големината на масивите
        System.out.println("Моля, въведете големина на масива:");
        int lenghtArr = scanner.nextInt();

        while (lenghtArr <= 0) {
            System.out.println("Моля, въведете цяло положително число:");
            lenghtArr = scanner.nextInt();
        }

        //въвеждане на стойности в масивите
        System.out.println("Моля, въведете " + lenghtArr + " числа:");
        int[] array = new int[lenghtArr];
        int[] array2 = new int[lenghtArr];

        for (int i = 0; i < lenghtArr; i++) {
            array[i] = scanner.nextInt();
        }

        int lenghtNewArr = lenghtArr % 2 == 0 ? lenghtArr / 2 : (lenghtArr / 2) + 1;

        for (int i = 0; i < lenghtNewArr; i++) {
            array2[i] = array[i];
            array2[lenghtArr - 1 - i] = array[i];
        }

        //извеждане на резултата
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
