/*
Трябва да се напълни цистерна с вода. Имате 2 кофи с
вместимост 2 и 3 литра и ги ползвате едновременно. Да се
състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество
вода, но могат инцидентно да се ползват по една.
– Входни данни: естествено число от интервала [10..9999].
Пример: 107
– Изход: 21 пъти по 2 литра, 21 пъти по 3 литра, допълнително
кофа от 2 литра
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете цяло число [10-9999]:");
        int number = scanner.nextInt();

        int result = number / 5;

        if (number >= 10 && number <= 9999) {
            if (number % 5 == 0) {
                System.out.println(result + " пъти по 2 литра, " + result + " пъти по 3 литра");
            } else {
                int remainder = number % 5;
                if (remainder == 2 || remainder == 3) {
                    System.out.println(result + " пъти по 2 литра, " + result + " пъти по 3 литра, допълнително кофа от " + remainder + " литра.");
                } else if (remainder == 1) {
                    System.out.println((result - 1) + " пъти по 2 литра, " + (result - 1) + " пъти по 3 литра, допълнително 2 кофи от по 3 литра.");
                } else if (remainder == 4) {
                    System.out.println(result + " пъти по 2 литра, " + result + " пъти по 3 литра, допълнително 2 кофи от по 2 литра.");
                }
            }
        } else {
            System.out.println("Въведете цяло число в интервала [10-9999]");
        }
    }
}
