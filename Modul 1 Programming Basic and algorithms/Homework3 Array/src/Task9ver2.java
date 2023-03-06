/*
Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.
 */

//Без използване на допълнителен масив

import java.util.Scanner;

public class Task9ver2 {
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

        //обръщане на елементите на масива
        for (int i = 0; i < array1.length / 2; i++) {
            int num = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = num;
        }

        //извеждане на резултата
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}