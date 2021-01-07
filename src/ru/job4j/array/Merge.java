package ru.job4j.array;


import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {

        int[] all = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            all[i] = left[i];
            count++;
        }
        for (int j = 0; j < right.length; j++) {
            all[count++] = right[j];
        }
        int[] array = new int[all.length];
        for (int i = 0; i < all.length; i++) {
            int min = MinDiapason.findMin(all, i, all.length - 1);
            int index = FindLoop.indexOf(all, min, i, all.length - 1);
            array = SwitchArray.swap(all, index, i);
            /* swap(...) */
        }
        return array;
    }
}
