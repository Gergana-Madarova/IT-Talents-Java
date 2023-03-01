/*
Въведено е трицифрено естествено число от вида
abc.Трябва да се провери дали:
– ако a = b = c, Изход: цифрите са равни;
– ако a>b>c, Изход: цифрите са във възходящ ред;
– ако a<b<c, Изход: цифрите са в низходящ ред;
– и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото.
– Пример: 345
– Изход: възходящ ред.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете цяло трицифрено число [100...999]:");
        int number = scanner.nextInt();

        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;

        if (a==b && a==c){
            System.out.println("цифрите са равни");
        } else if (a > b && b > c) {
            System.out.println("цифрите са в низходящ ред");
        } else if (a < b && b < c) {
            System.out.println("цифрите са във възходящ ред");
        } else {
            System.out.println("цифрите са ненаредени, за описания случай");
        }
    }
}
