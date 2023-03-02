/*
Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат.
 */

public class Task12 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            if ((i / 100 == (i / 10) % 10) || (i / 100 == i % 10) || ((i / 10) % 10 == i % 10)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
