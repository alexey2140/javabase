/* Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с клавиатуры).
Результат должен быть: 2,3,5,7 ...
*/
package lesson07.HW7.task09;

import java.util.Scanner;

public class Main { // in progress
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}