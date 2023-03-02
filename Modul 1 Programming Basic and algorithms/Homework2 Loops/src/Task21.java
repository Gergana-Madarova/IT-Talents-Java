/*
Дадено е наредено тесте карти.
Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика.
Да се създаде програма, чрез която се въвежда N - число от
интервала [1..51] и се извеждат въведения номер карта и
останалите по-големи карти от тестето.
Пример: 47.
Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
пика
 */

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число N [1..51]:");
        int n = scanner.nextInt();

        for (int i = n - 1; i < 52; i++) {
            int cardNum = i / 4;
            int color = (i + 1) % 4;

            switch (cardNum) {
                case 0:
                    System.out.print(2);
                    break;
                case 1:
                    System.out.print(3);
                    break;
                case 2:
                    System.out.print(4);
                    break;
                case 3:
                    System.out.print(5);
                    break;
                case 4:
                    System.out.print(6);
                    break;
                case 5:
                    System.out.print(7);
                    break;
                case 6:
                    System.out.print(8);
                    break;
                case 7:
                    System.out.print(9);
                    break;
                case 8:
                    System.out.print(10);
                    break;
                case 9:
                    System.out.print("вале");
                    break;
                case 10:
                    System.out.print("дама");
                    break;
                case 11:
                    System.out.print("поп");
                    break;
                case 12:
                    System.out.print("асо");
                    break;
            }

            switch (color) {
                case 1:
                    System.out.println(", спатия");
                    break;
                case 2:
                    System.out.println(", каро");
                    break;
                case 3:
                    System.out.println(", купа");
                    break;
                case 0:
                    System.out.println(", пика");
                    break;
            }
        }
    }
}


