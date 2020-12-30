package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if ((first <= second) && (second >= third)) {
            result = second;
        } else if ((first <= third) && (second <= third)) {
            result = third;
        }
        return result;
    }
}

