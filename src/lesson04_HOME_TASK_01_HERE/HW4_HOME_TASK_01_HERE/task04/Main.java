/* В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую
и выводящую на экран сумму цифр числа n (n – вводит пользователь).
*/
package lesson04_HOME_TASK_01_HERE.HW4_HOME_TASK_01_HERE.task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scan.nextInt();
        int sum = n % 10 + n / 10;
        System.out.println(sum);
    }
}