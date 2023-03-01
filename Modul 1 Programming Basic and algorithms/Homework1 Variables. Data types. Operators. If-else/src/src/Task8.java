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

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете цяло четирицифрено число [1000...9999]:");
        String number = scanner.nextLine();

        //предполагаме, че входа е коректен
        char firstNumber = number.charAt(0);
        char lastNumber = number.charAt(3);

        String number1 = "" + (firstNumber - 48) + (lastNumber - 48);
        int number1Int = Integer.parseInt(number1);

        char secondNumber = number.charAt(1);
        char thirdNumber = number.charAt(2);

        String number2 = "" + (secondNumber - 48) + (thirdNumber - 48);
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
