/*
Въведете 2 различни цели числа от конзолата. Запишете
тяхната сума, разлика, произведение, остатък от деление и
целочислено деление в отделни променливи и разпечатайте тези
резултати в конзолата. Опитайте същото с числа с плаваща запетая.
*/
// Вариант с числа с плаваща запетая

import java.util.Scanner;

public class Task2Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А:");
        double a = scanner.nextDouble();
        System.out.println("Въведете B:");
        double b = scanner.nextDouble();

        double sum = a + b;
        double diff = Math.abs(a - b);
        double product = a * b;

        double remainderA = 0;
        double remainderB = 0;
        double devisionA = 0;
        double devisionB = 0;
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
        //with TypeCasting
        if (b == 0) {
            System.out.println("На 0 не се дели, следователно не може да се раздели на второто число");
        } else {
            System.out.println("Остатъкът от делението от първото число на второто число е: " + (int) remainderA);
            System.out.println("Частното от целочислено деление от първото число на второто число е: " + (int) devisionA);
        }

        if (a == 0) {
            System.out.println("На 0 не се дели, следователно не може да се раздели на първото число");
        } else {
            System.out.println("Остатъкът от делението от второто число на първото число е: " + (int) remainderB);
            System.out.println("Частното от целочислено деление от второто число на първото число е: " + (int) devisionB);
        }
    }
}