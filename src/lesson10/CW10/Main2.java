package lesson10.CW10;

public class Main2 {
    public static void main(String[] args) {
        String str = "ololomam mila ramu i umailas u rami";
        String searcher = "ma";
        int counter = 0;
        while (str.indexOf(searcher) >= 0) {
            str = str.substring(str.indexOf(searcher) + searcher.length());
            System.out.println(str);
            counter++;
        }
        System.out.println(counter);
    }
}