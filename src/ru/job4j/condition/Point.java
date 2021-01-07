package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point that){
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(2, 10);

        double result = p1.distance(p2);
        System.out.println(result);
    }
}
