/* Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь).
*/
package HW4.task05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, a1 = 0, b, b1 = 0, closer = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        a = scan.nextInt();
        System.out.println("Введите второе число");
        b = scan.nextInt();

        if (a < 10) {
            a1 = 10 - a;
        } else if (a > 10) {
            a1 = a - 10;
        }

        if (b < 10) {
            b1 = 10 - b;
        } else if (b > 10) {
            b1 = b - 10;
        }

        if (a1 < b1) {
            closer = a;
        } else if (a1 > b1) {
            closer = b;
        }
        System.out.println("Число " + closer + " ближе к 10");
    }
}