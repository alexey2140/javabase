/* Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно
сколько цифр будет в числе).
*/
package lesson07_HOME_TASK_02_HERE.HW7_HOME_TASK_02_HERE.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");

        for (String s : scan.nextLine().split(" ")) {
            sum = sum + Integer.parseInt(s);
        }
        System.out.println("Сумма введенных чисел равна: " + sum);
    }
}