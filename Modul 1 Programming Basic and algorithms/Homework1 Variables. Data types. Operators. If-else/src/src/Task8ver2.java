/*
Да се състави програма, която чете от конзолата 4-
цифренo естествено число от интервала [1000.. 9999]. От това
число се формират 2 нови 2-цифрени числа. Първото число се
формира от 1-та и 4-та цифра на въведеното число. Второто число
се формира от 2-рa - 3-та цифра на въведеното число. Като
резултат да се изведе дали 1-то ново число e по-малко, равно или
по-голямо от 2-то число.
– Пример: 3332 Изход: по-малко (32<33)
– Пример: 1144 Изход: равни (14=14)
– Пример: 9875 Изход: по-голямо (95>87)
 */

import java.util.Scanner;

public class Task8ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете цяло четирицифрено число [1000...9999]:");
        int number = scanner.nextInt();

        int a = number / 1000;
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;

        String number1 = "" + a + d;
        String number2 = "" + b + c;

        int number1Int = Integer.parseInt(number1);
        int number2Int = Integer.parseInt(number2);

        if (number1Int > number2Int) {
            System.out.println("по-голямо (" + number1Int + ">" + number2Int + ")");
        } else if (number1Int < number2Int) {
            System.out.println("по-малко (" + number1Int + "<" + number2Int + ")");
        } else {
            System.out.println("равни (" + number1Int + "=" + number2Int + ")");
        }
    }
}
