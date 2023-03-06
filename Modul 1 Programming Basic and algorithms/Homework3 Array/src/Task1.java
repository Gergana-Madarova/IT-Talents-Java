// Да се прочете масив и да се намери най-малкото число кратно на 3 от масива.

import java.util.Scanner;

public class Task1 {
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

        int[] array = new int[lenghtArr];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //намиране на най-малкото число кратно на 3 от масива
        int min = Integer.MAX_VALUE;
        //System.out.println(min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] < min) {
                min = array[i];
            }
        }

        //извеждане на резултата
        System.out.println("най-малкото число кратно на 3 е " + min);
    }
}
