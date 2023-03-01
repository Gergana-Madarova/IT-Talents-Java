/*
Въведете 2 различни цели числа от конзолата. Запишете
тяхната сума, разлика, произведение, остатък от деление и
целочислено деление в отделни променливи и разпечатайте тези
резултати в конзолата. Опитайте същото с числа с плаваща запетая.
*/
// Вариант с цели числа

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете цяло число А:");
        int a = scanner.nextInt();
        System.out.println("Въведете цяло число B:");
        int b = scanner.nextInt();

        int sum = a + b;
        int diff = Math.abs(a - b);
        int product = a * b;
        //a:b=c (ост. r) => a=bc+r, където 0 ≤ |r| ≤ |b|
        int remainderA = 0;
        int remainderB = 0;
        int devisionA = 0;
        int devisionB = 0;

        if (b != 0) {
            remainderA = a % b;
            devisionA = a / b;
        }
        if (a != 0) {
            remainderB = b % a;
            devisionB = b / a;
        }

        System.out.println("Сумата на двете числа е: " + sum);
        System.out.println("Разликата на двете числа е: " + diff);
        System.out.println("Произведението на двете числа е: " + product);

        if (b == 0) {
            System.out.println("На 0 не се дели, следователно не може да се раздели на второто число");
        } else {
            System.out.println("Остатъкът от делението от първото число на второто число е: " + remainderA);
            System.out.println("Частното от целочислено деление от първото число на второто число е: " + devisionA);
        }

        if (a == 0) {
            System.out.println("На 0 не се дели, следователно не може да се раздели на първото число");
        } else {
            System.out.println("Остатъкът от делението от второто число на първото число е: " + remainderB);
            System.out.println("Частното от целочислено деление от второто число на първото число е: " + devisionB);
        }
    }
}