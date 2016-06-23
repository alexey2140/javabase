package lesson10.HW10.task01;

public class Main {
    public static void main(String[] args) {

        String str = "ololomama mila ramu i umailas u rami";
        String found = "ra";
        str = str.substring(str.indexOf(found));
        System.out.println(str);
//        String searcher = "ma";
//        int counter = 0;
//        while (str.indexOf(searcher) >= 0) {
//            str = str.substring(str.indexOf(searcher) + searcher.length());
//            System.out.println(str);
//            counter++;
//        }

    }
}