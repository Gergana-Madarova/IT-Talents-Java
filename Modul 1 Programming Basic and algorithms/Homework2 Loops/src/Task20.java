/*
Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
Пример:
1 2 3 4 5 6 7 8 9 0
2 3 4 5 6 7 8 9 0 1
3 4 5 6 7 8 9 0 1 2
4 5 6 7 8 9 0 1 2 3
5 6 7 8 9 0 1 2 3 4
6 7 8 9 0 1 2 3 4 5
7 8 9 0 1 2 3 4 5 6
8 9 0 1 2 3 4 5 6 7
9 0 1 2 3 4 5 6 7 8
0 1 2 3 4 5 6 7 8 9
 */

public class Task20 {
    public static void main(String[] args) {
        int sum = 45;

        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if ((col + row - 1) > 10) {
                    System.out.print((col + row - 1) % 10 + " ");
                } else {
                    System.out.print((col + row - 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
