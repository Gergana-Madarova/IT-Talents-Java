/*
Да се състави програма, която по въведени
координати на 2 позиции от шахматната дъска извежда отговор
дали квадратчетата на тези позиции са оцветени в еднакъв или
различен цвят. Шахматната дъска е квадратна. Въвеждат се две
двойки числа от интервала [1..8].
– Пример: 2 2 3 2
– Изход: Позициите са с различен цвят
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете двойка числа [1..8]:");
        String firstNumbers = scanner.nextLine();
        System.out.println("Въведете следваща двойка числа [1..8]:");
        String secondNumbers = scanner.nextLine();

        int firstNumber1 = firstNumbers.charAt(0);
        int firstNumber2 = firstNumbers.charAt(2);
        int secondNumber1 = secondNumbers.charAt(0);
        int secondNumber2 = secondNumbers.charAt(2);

        boolean isBlack1 = (firstNumber1 % 2 == 0 && firstNumber2 % 2 == 0) || (firstNumber1 % 2 != 0 && firstNumber2 % 2 != 0);
        boolean isBlack2 = (secondNumber1 % 2 == 0 && secondNumber2 % 2 == 0) || (secondNumber1 % 2 != 0 && secondNumber2 % 2 != 0);

        if ((isBlack1 && isBlack2) || (!isBlack1 && !isBlack2)){
            System.out.println("Позициите са с еднакъв цвят");
        } else {
            System.out.println("Позициите са с различен цвят");
        }
    }
}
