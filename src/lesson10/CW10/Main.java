package lesson10.CW10;

public class Main {
    public static void main(String[] args) {
        int tmp;

        int[] array = {1, -3, 5, -7, 0, -2, 4, -5};

        for (int count = array.length; count > 0; count--) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > 0 && array[i + 1] < 0) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    count = array.length;
                } else if (array[i] > 0 && array[i + 1] == 0) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    count = array.length;
                } else if (array[i] == 0 && array[i + 1] < 0) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    count = array.length;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}