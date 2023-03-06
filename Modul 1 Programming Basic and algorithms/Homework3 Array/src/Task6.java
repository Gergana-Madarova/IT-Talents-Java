/*
Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене на първи масив
        System.out.println("Моля, въведете големина на първия масив:");
        int lenghtArr1 = scanner.nextInt();

        while (lenghtArr1 <= 0) {
            System.out.println("Моля, въведете цяло положително число:");
            lenghtArr1 = scanner.nextInt();
        }

        System.out.println("Моля, въведете " + lenghtArr1 + " числа:");

        int[] array1 = new int[lenghtArr1];

        for (int i = 0; i < lenghtArr1; i++) {
            array1[i] = scanner.nextInt();
        }

        //Четене на втория масив
        System.out.println("Моля, въведете големина на втория масив:");
        int lenghtArr2 = scanner.nextInt();

        while (lenghtArr2 <= 0) {
            System.out.println("Моля, въведете цяло положително число:");
            lenghtArr2 = scanner.nextInt();
        }

        System.out.println("Моля, въведете " + lenghtArr2 + " числа:");

        int[] array2 = new int[lenghtArr2];

        for (int i = 0; i < lenghtArr2; i++) {
            array2[i] = scanner.nextInt();
        }

        //Сравняване на двата масива и извеждане на резултат
        String output = lenghtArr1 != lenghtArr2 ? "Масивите са с различен размер" : "Масивите са с еднакъв размер";
        System.out.println(output);
        boolean isSame = true;

        if (lenghtArr1 == lenghtArr2) {
            for (int i = 0; i < lenghtArr1; i++) {
                if (array1[i] != array2[i]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                System.out.println("Масивите са с еднакви стойности.");
            } else {
                System.out.println("Масивите са с различни стойности.");
            }
        }
    }
}