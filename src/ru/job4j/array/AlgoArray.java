package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};

        for (int j = 0; j < array.length - 1; j++) {
          for (int index = 0; index < array.length - 1; index++) {
            int temp = array[index];
                    if (array[index] >= array[index + 1]) {
                        array[index] = array[index + 1];
                        array[index + 1] = temp;
                    }
          }
        }
        for (int in : array) {
            System.out.println(in);
        }
    }
}
