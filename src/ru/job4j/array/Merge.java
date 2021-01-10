package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int rslPoint = 0;
        while (leftPoint + rightPoint != rsl.length) {
            if (leftPoint != left.length && rightPoint != right.length) {
                rsl[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
            } else if (leftPoint != left.length) {
                rsl[rslPoint++] = left[leftPoint++];
            } else {
                rsl[rslPoint++] = right[rightPoint++];
            }
        }
        return rsl;
//        int countL = 0;
//        int countR = 0;
//        int[] all = new int[left.length + right.length];
//
//        for (int i = 0; i < all.length; i++) {
//            if (left.length == 0){
//                all[i] = right[i];
//            } else if (right.length == 0){
//                all[i] = left[i];
//            } else if (left[countL] <= right[countR]){
//                all[i] = left[countL];
//                countL++;
//                if (countL == left.length){
//                    for (int j = i + 1; j < all.length; j++) {
//                        all[j] = right[countR];
//                        countR++;
//                    }
//                    break;
//                }
//            } else {
//                all[i] = right[countR];
//                countR++;
//                if (countR == right.length){
//                    for (int j = i + 1; j < all.length; j++) {
//                        all[j] = left[countL];
//                        countL++;
//                    }
//                    break;
//                }
//            }
//        }
//        return all;
    }
}
