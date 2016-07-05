/* Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент последовательности Фибоначчи для
вычисления пятнадцатого элемента.
*/
package lesson07_HOME_TASK_02_HERE.HW7_HOME_TASK_02_HERE.task08;

public class Main {
    private static int count;

    public static void main(String[] args) {
        fibonacci(15);
        System.out.println("Четвёртый элемент был расчитан " + count + " раз.");
    }
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        else if (n - 1 == 4|| n - 2 == 4) {
            count++;
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}