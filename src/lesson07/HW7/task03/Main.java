/* В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо
заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик
у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами
003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
*/
package lesson07.HW7.task03;

public class Main {
    static int count;

    public static void main(String[] args) {
        int i;
        System.out.println("Секундочку");
        for (i = 1000; i < 1000000; i++) {
            String s = Integer.toString(i);
            String[] s2 = s.split("");
            if (s2.length == 4) {
                int a = Integer.parseInt(s2[0]);
                int b = Integer.parseInt(s2[s2.length - 1]) + Integer.parseInt(s2[s2.length - 2]) + Integer.parseInt(s2[s2.length - 3]);
                if (a == b) {
                    count++;
                }
            } else if (s2.length == 5) {
                int a = Integer.parseInt(s2[0]) + Integer.parseInt(s2[1]);
                int b = Integer.parseInt(s2[s2.length - 1]) + Integer.parseInt(s2[s2.length - 2]) + Integer.parseInt(s2[s2.length - 3]);
                if (a == b) {
                    count++;
                }
            } else if (s2.length == 6) {
                int a = Integer.parseInt(s2[0]) + Integer.parseInt(s2[1]) + Integer.parseInt(s2[2]);
                int b = Integer.parseInt(s2[s2.length - 1]) + Integer.parseInt(s2[s2.length - 2]) + Integer.parseInt(s2[s2.length - 3]);
                if (a == b) {
                    count++;
                }
            }

        }
        System.out.println("Количество счасливых билетов: " + count);
    }
}