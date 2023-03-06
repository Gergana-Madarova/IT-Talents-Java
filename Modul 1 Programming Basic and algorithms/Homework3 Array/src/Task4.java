/*
Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]
 */

import java.util.Scanner;

public class Task4 {
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

        for (int i = 0; i < lenghtArr; i++) {
            array[i] = scanner.nextInt();
        }

        //проверка, дали е огледален
        boolean isMirror = true;

        for (int i = 0; i < array.length; i++) {
            if (array[lenghtArr - 1 - i] != array[i]) {
                isMirror = false;
                break;
            }
        }

        //извеждане на резултата
        if (isMirror) {
            System.out.println("Масивът е огледален");
        } else {
            System.out.println("Масивът НЕ е огледален.");
        }
    }
}
