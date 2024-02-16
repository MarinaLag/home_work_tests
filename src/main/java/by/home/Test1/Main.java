package by.home.Test1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 5 + a;

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
// Ответ: a < b

        System.out.println("-------------------------------");
        String a1 = "my test";
        String b1 = "this is";
        String c1;

        switch (a1) {
            case "MY TEST":
                c1 = a1 + b1;
                break;
            case "My Test":
                c1 = b1 + a1;
                break;
            case "my_test":
                c1 = a1 + a1;
                break;
            default:
                c1 = a1 + a1;
        }
        System.out.println(c1);
// Ответ:  my testmy test

        System.out.println("-------------------------------");
        int[] m = new int[]{4, 5, 6, 7, 8};
        int[] n = new int[m.length];

        for (int i = 0; i < m.length; ++i) {
            n[i] = m[i] * 2;
        }
        System.out.println(Arrays.toString(n));
// Ответ: [8, 10, 12, 14, 16]

        System.out.println("-------------------------------");
        int[] f = new int[]{1, 2, 3};
        int[] g = new int[f.length];
        //   g[4] = 4;

        System.out.println("нет такого индекса");
//  ArrayIndexOutOfBounds

        System.out.println("-------------------------------");
        String[] text = new String[]{
                "I ",
                "Love ",
                "Programming ",
                "Tests"
        };
//       int i = 1;
//        while (i<text.length){
//            System.out.println(i);
//        }
//Ответ: Бесконечный цикл, т.к. 1 всегда будемт меньше нашего массива
// Исправлено !!!
        int i = 0;
        while (i < text.length) {
            System.out.println(text[i]);
            i++;
        }
// Ответ: I Love Programming Tests

        System.out.println("-------------------------------");
        String hello = "hello";
        String helloBack = "hell";
        helloBack += "o";

        System.out.println(hello == helloBack);
        System.out.println(helloBack);
// Ответ:
//false
//hello

        System.out.println("-------------------------------");
        int counter = 0;
        counter = counter + 1;       // 0+1=1
        counter -= 1;                // 1-1=0
        counter++;                   // 0+1=1
        counter = counter + 2 * counter; // 1+2*1=3
        counter -= counter;           //3-3=0
        counter = counter +/*500*/+1;   // 0+1=1  /*500*/ - комментарии
        counter++;                      // 1+1=2
        System.out.printf("Counter = %s", counter);
//Ответ: 2
        System.out.println();
        System.out.println("-------------------------------");
        double d = 1.1;
        float l = 2.2f; // F

// Ошибка: l = d * 2;
        l = (float) d * 2;
        System.out.printf("%.1f", l);


    }
}
