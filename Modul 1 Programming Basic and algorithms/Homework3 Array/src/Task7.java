/*
Напишете програма, която първо чете масив
и после създава нов масив със същия размер по следния начин:
стойността на всеки елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив.
Първият и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене на масив
        System.out.println("Моля, въведете големина на масива:");
        int lenghtArr = scanner.nextInt();

        while (lenghtArr <= 0) {
            System.out.println("Моля, въведете цяло положително число:");
            lenghtArr = scanner.nextInt();
        }

        System.out.println("Моля, въведете " + lenghtArr + " числа:");

        int[] array1 = new int[lenghtArr];

        for (int i = 0; i < lenghtArr; i++) {
            array1[i] = scanner.nextInt();
        }

        //създаване на нов масив със същия размер
        int[] array2 = new int[lenghtArr];

        for (int i = 0; i < lenghtArr; i++) {
            if (i == 0 || i == lenghtArr - 1) {
                array2[i] = array1[i];
            } else {
                int sum = array1[i - 1] + array1[i + 1];
                array2[i] = sum;
            }
        }

        //Извеждане на получения масив.
        for (int i = 0; i < lenghtArr; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
