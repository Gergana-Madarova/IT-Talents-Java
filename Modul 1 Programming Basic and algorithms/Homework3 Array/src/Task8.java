/*
Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
 */

import java.util.Scanner;

public class Task8 {
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

        //намиране на най-дългата редица от еднакви поредни елементи
        boolean isSame = false;
        int indexCurr = -1;
        int index = -1;
        int count = 0;
        int countMax = -1;

        for (int i = 0; i < lenghtArr - 1; i++) {
            if (array1[i] == array1[i + 1]) {
                if (isSame == false) {
                    indexCurr = i;
                    isSame = true;
                }
                count++;

                if (count > countMax) {
                    countMax = count;
                    index = indexCurr;
                }
                continue;
            }

            isSame = false;
            count = 0;
        }

        //Извеждане на резултата
        for (int i = index; i < index + countMax + 1; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
