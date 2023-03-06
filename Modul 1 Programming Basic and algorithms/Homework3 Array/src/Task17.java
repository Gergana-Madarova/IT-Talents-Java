/*
Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене на масив
        System.out.println("Моля, въведете големина на масив:");
        int lenghtArr1 = scanner.nextInt();

        while (lenghtArr1 <= 0) {
            System.out.println("Моля, въведете цяло положително число:");
            lenghtArr1 = scanner.nextInt();
        }

        System.out.println("Моля, въведете " + lenghtArr1 + " числа:");

        int[] array1 = new int[lenghtArr1];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        boolean isZigzag = true;

        for (int i = 1; i < array1.length - 1; i++) {
            boolean greaterThanNeighbours = array1[i - 1] < array1[i] && array1[i] > array1[i + 1];
            boolean smallerThanNeighbours = array1[i - 1] > array1[i] && array1[i] < array1[i + 1];
            if (!(greaterThanNeighbours || smallerThanNeighbours)) {
                isZigzag = false;
                break;
            }
        }

        if (isZigzag) {
            System.out.println("Изпълнява изискванията за зигзагообразна нагоре редица");
        } else {
            System.out.println("Не изпълнява изискванията за зигзагообразна нагоре редица");
        }
    }
}
