/* Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так,
что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия
(например, 02:20, 11:11 или 15:51).
*/
package lesson07.HW7.task04;

public class Main {
    private static int count;

    public static void main(String[] args) {

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i < 10 && j < 10) {
                    String s = "0" + Integer.toString(i) + ":" + "0" + Integer.toString(j);
                    String[] time = s.split(":");
                    String[] timeH = time[0].split("");
                    String[] timeM = time[1].split("");
                    if (Integer.parseInt(timeH[0]) == Integer.parseInt(timeM[1]) && Integer.parseInt(timeH[1]) ==
                            Integer.parseInt(timeM[0])) {
                        count++;
                    }
                } else if (i < 10) {
                    String s = "0" + Integer.toString(i) + ":" + Integer.toString(j);
                    String[] time = s.split(":");
                    String[] timeH = time[0].split("");
                    String[] timeM = time[1].split("");
                    if (Integer.parseInt(timeH[0]) == Integer.parseInt(timeM[1]) && Integer.parseInt(timeH[1]) ==
                            Integer.parseInt(timeM[0])) {
                        count++;
                    }
                } else if (j < 10) {
                    String s = Integer.toString(i) + ":" + "0" + Integer.toString(j);
                    String[] time = s.split(":");
                    String[] timeH = time[0].split("");
                    String[] timeM = time[1].split("");
                    if (Integer.parseInt(timeH[0]) == Integer.parseInt(timeM[1]) && Integer.parseInt(timeH[1]) ==
                            Integer.parseInt(timeM[0])) {
                        count++;
                    }
                } else {
                    String s = Integer.toString(i) + ":" + Integer.toString(j);
                    String[] time = s.split(":");
                    String[] timeH = time[0].split("");
                    String[] timeM = time[1].split("");
                    if (Integer.parseInt(timeH[0]) == Integer.parseInt(timeM[1]) && Integer.parseInt(timeH[1]) ==
                            Integer.parseInt(timeM[0])) {
                        count++;
                    }
                }
            }
        }
        System.out.println("За сутки симметричное время случается " + count + " раз");
    }
}