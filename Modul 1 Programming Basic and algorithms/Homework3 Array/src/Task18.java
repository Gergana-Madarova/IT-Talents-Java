/*
Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11
 */

import java.util.Scanner;

public class Task18 {
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

        double[] array1 = new double[lenghtArr1];

        for (int i = 0; i < lenghtArr1; i++) {
            array1[i] = scanner.nextDouble();
        }

        //Четене на втория масив
        System.out.println("Моля, въведете големина на втория масив:");
        int lenghtArr2 = scanner.nextInt();

        while (lenghtArr2 <= 0) {
            System.out.println("Моля, въведете цяло положително число:");
            lenghtArr2 = scanner.nextInt();
        }

        System.out.println("Моля, въведете " + lenghtArr2 + " числа:");

        double[] array2 = new double[lenghtArr2];

        for (int i = 0; i < lenghtArr2; i++) {
            array2[i] = scanner.nextDouble();
        }

        //ако първите два масива са с различна големина, режем по-голямия,
        //за да сравняваме стойности на съществуващи индекси
        int lenghtArr3 = array1.length < array2.length ? array1.length : array2.length;
        double[] array3 = new double[lenghtArr3];

        for (int i = 0; i < lenghtArr3; i++) {
            array3[i] = array1[i] > array2[i] ? array1[i] : array2[i];
        }

        //извеждане на резултата
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < lenghtArr3; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
