package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        /*количество десяток*/
        int t10 = (money - price) / 10;
        //System.out.println("t10 " + t10);
        /*количество пятерок*/
        int t5 = ((money - price) % 10) / 5;
       // System.out.println("t5 " + t5);
        /*количество двоек*/
        int t2 = (((money - price) % 10) % 5) / 2;
        //System.out.println("t2 " + t2);
        /*количество количество однерок*/
        int t1 = (money - price) - (t10 * 10 + t5 * 5 + t2 * 2);
        //System.out.println("t1 " + t1);
        /*длина массива */
        int leng = t10 + t5 + t2 + t1;

        int[] arr = new int[leng];
        for (int i = 0; i < leng; i++) {
            if (t10 > 0) {
                arr[i] = 10;
                t10--;
            } else if (t5 > 0) {
                arr[i] = 5;
                t5--;
            } else if (t2 > 0) {
                arr[i] = 2;
                t2--;
            } else if (t1 > 0) {
                arr[i] = 1;
                t1--;
            }
        }
        return arr;
    }
}
