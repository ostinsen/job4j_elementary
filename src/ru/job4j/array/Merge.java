package ru.job4j.array;


import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {

        int[] all = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
           all[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < all.length; j++) {
                if (right[i] <= all[j]){
                    for (int k = all.length - 1; k > j; k--) {
                        all[k] = all[k - 1];
                    }
                    all[j] = right[i];
                    break;
                } else if ((all[j] == 0) && (j >= left.length - 1)){
                    for (int k = all.length - 1; k > j; k--) {
                        all[k] = all[k - 1];
                    }
                    all[j] = right[i];
                    break;
                }
            }
        }


//        int[] all = new int[left.length + right.length];
//        int count = 0;
//        for (int i = 0; i < left.length; i++) {
//            all[i] = left[i];
//            count++;
//        }
//        for (int j = 0; j < right.length; j++) {
//            all[count++] = right[j];
//        }
//        int[] array = new int[all.length];
//        for (int i = 0; i < all.length; i++) {
//            int min = MinDiapason.findMin(all, i, all.length - 1);
//            int index = FindLoop.indexOf(all, min, i, all.length - 1);
//            array = SwitchArray.swap(all, index, i);
//            /* swap(...) */
//        }
        return all;
    }

//    public static void main(String[] args) {
//        int[] arr2 = new int[] {0, 0, 10};
//        int[] arr1 = new int[] {2, 5, 8, 8};
//        int[] arr3 = Merge.merge(arr1, arr2);
//            for (int i : arr3){
//                System.out.println(i);
//            }
//    }
}
