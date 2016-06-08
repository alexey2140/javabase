package CW4;

import java.util.*;

public class Main {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int y = scanner.nextInt();
//        System.out.println(y);
//
//        float v = 0.2f + 0.1f;
//        System.out.println(v);
//
//        double v2 = 5;
//        boolean b = true;
//        char c = 's';
//        System.out.println("y = " + y);
//        System.out.println(c);
//        int i = 2;
//        i = i++;
//        System.out.println(i);
//
//        boolean b = 3 != 3;
//        System.out.println(b);
//        if (b) {
//            System.out.println("test true");
//        } else {
//            System.out.println("omg");
//        }

//        Cat someCat0 = new Cat("cat0", 3, false);
//        Cat someCat1 = new Cat("cat1", 7, true);
//        Cat someCat2 = new Cat("cat2", 7, true);
//        Cat someCat3 = new Cat("cat3", 7, true);
//        Cat someCat4 = new Cat("cat4", 7, true);
//        Cat someCat5 = new Cat("cat5", 7, true);
//        Cat someCat6 = new Cat("cat6", 7, true);
//        Cat someCat7 = new Cat("cat7", 7, true);
//        Cat someCat8 = new Cat("cat8", 7, true);
//        Cat someCat9 = new Cat("cat9", 7, true);
//
//        someCat0.addChild(someCat9);
//        someCat0.addChild(someCat8);
//        someCat0.addChild(someCat7);
//        someCat7.addChild(someCat2);
//        someCat7.addChild(someCat3);
//        someCat3.addChild(someCat4);
//        someCat3.addChild(someCat5);
//        someCat3.addChild(someCat6);
//
//        someCat0.printParentTree();
        //Cat someCat2 = someCat0;
/*      someCat0.setName("Timoha");
        someCat1.setOld(-5);
        System.out.println(someCat0.getName());



        Cat[] cats = new Cat[2];
        cats[0] = someCat0;
        cats[1] = someCat1;
        System.out.println(Arrays.toString(cats));
        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            System.out.println("i = " + i + ", cat.name = " + cat.getName());
        }
        System.out.println("new for =^_^= ");
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }*/
//
//    int[] numbers = {0,2,3,3,5,7,9,9};
//        int a = 4;
//        int[] numNew = new int[numbers.length + 1];
//        for (int i = 0; int j = 0;   i < numNew.length - 1; i++; j++ ) {
//            if (a >= numbers[i] && a <= numbers[i + 1]); {
//                numNew[j] = numbers[i];
//            }
//        }
//        int[] numbers = {9,2,3,3,5,7,9,0};
//
//        int[] temp = new int [numbers.length];
//        int l = numbers.length ;
//        int n_l = 0;
//        boolean isHave = false;
//
//
//        for (int i = 0; i < l; i++) {
//            for (int j = 0; j < n_l; j++) {
//                if (numbers[i] == temp[j]) {
//                    isHave = true;
//                }
//            }
//            if (!isHave){
//                temp[n_l] = numbers[i];
//                n_l++;
//            }
//            isHave = false;
//        }
//        System.out.println(n_l);

//        int[] mas = {2,4,9,4,16,25};
//        int a = 2;
//
//        for(int i = 0; i < mas.length; i++) {
//            if (mas[i] == a) {
//                System.out.println(i);
//            }
//        }
        int[] mas = {0,1,0,1,1,1,0};

        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas.length; j++) {
                if(mas[i] > mas[j]) {
                    mas[j] = 1;
                    mas[i] = 0;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
    }
}