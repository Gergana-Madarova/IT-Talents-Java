/*
Да се състави програма, която да отгатне колко е
студено/топло по въведената температура t в градус Целзий.
Температурните интервали са:
– под -20 - ледено студено;
– между 0 и -20 - студено;
– между 15 и 0 - хладно;
– между 25 и 15 - топло;
– над 25 – горещо.
– Входни данни: цяло число от интервала [-100..100].
– Пример: 12
– Изход: хладно
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете градуси по Целзий (цяло число от -100 до 100):");
        int degrees = scanner.nextInt();

        if (degrees >= -100 && degrees <= 100) {
            if (degrees <= -20) {
                System.out.println("ледено студено");
            } else if (degrees <= 0 && degrees > -20) {
                System.out.println("студено");
            } else if (degrees <= 15 && degrees > 0) {
                System.out.println("хладно");
            } else if (degrees <= 25 && degrees > 15) {
                System.out.println("топло");
            } else if (degrees > 25) {
                System.out.println("горещо");
            }
        } else {
            System.out.println("Моля, въведете коректни данни!");
        }
    }
}
