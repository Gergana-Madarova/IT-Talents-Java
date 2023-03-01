/*
Високосни години са всички години кратни на 4 с
изключения столетията, но без столетия кратни на 400, т.е. 1900
не е високосна, но 1600 и 2000 са високосни.Съставете програма,
която по дадени ден, месец и година, отпечатва следващата дата.
– Входни данни: три числа за ден, месец, година.
– Пример: 28, 2, 2021
– Изход: 1,3,2021
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете ден от месеца [1..31]:");
        int day = scanner.nextInt();
        System.out.println("Въведете месец [1..12]:");
        int month = scanner.nextInt();
        System.out.println("Въведете година:");
        int year = scanner.nextInt();

        //приемаме, че входа не е невалиден
        boolean isLeapYear = false;

        if ((year % 100 == 0) && (year % 400 == 0)) {
            isLeapYear = true;
        } else if ((year % 100 != 0) && (year % 4 == 0)) {
            isLeapYear = true;
        }

        if (day == 31) {
            if ((month <= 7) && (month % 2 != 0)) {
                day = 1;
                month++;
            } else if ((month >= 8) && (month % 2 == 0)) {
                day = 1;
                if (month == 12) {
                    month = 1;
                    year++;
                } else {
                    month++;
                }
            }
        } else if (day == 30) {
            if (((month <= 7) && (month % 2 == 0)) || ((month >= 8) && (month % 2 != 0))) {
                day = 1;
                month++;
            }
        } else if (((isLeapYear && day == 29) || (!isLeapYear && day == 28)) && month == 2) {
            day = 1;
            month++;
        } else {
            day++;
        }

        System.out.println(day + ", " + month + ", " + year);
    }
}
