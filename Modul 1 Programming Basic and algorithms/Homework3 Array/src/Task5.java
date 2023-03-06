/*
Напишете програма, която създава масив с 10 елемента и
инициализира всеки от елементите със стойност, равна на индекса на
елемента, умножен по 3.
Да се изведат елементите на екрана.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i * 3;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
