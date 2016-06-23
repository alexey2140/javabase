/* Создать программу, проверяющую и сообщающую на экран, является ли целое число, записанное в переменную n,
чётным либо нечётным (n – вводит пользователь).
*/
package lesson04_HOME_TASK_01_HERE.HW4_HOME_TASK_01_HERE.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число:");
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                n = Integer.parseInt(scan.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Четное");
                } else {
                    System.out.println("Нечетное");
                }
            } else {
                System.out.println("Вы ввели символ, а не число");
                break; //Как сделать что бы при вводе символа вместо числа программа снова была готова к проверке ввода?
            }          //Если не сделать break; то при вводе символа идет бесконечный вывод "Вы ввели символ, а не число".
        }
    }
}