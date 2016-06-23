/* Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены
последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
*/
package lesson07_HOME_TASK_02_HERE.HW7_HOME_TASK_02_HERE.task02;

public class Main {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 11, fib;

        for (int i = 0; i < c; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");
        }
    }
}