package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
       double expected = 2.0;
       Point p1 = new Point(0, 0);
       Point p2 = new Point(0, 2);
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33o366to67o675then310() {
        double expected = 10.0;
        Point p1 = new Point(0, 10);
        Point p2 = new Point(0, 20);
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23o4to88o0then65() {
        double expected = 6.08;
        Point p1 = new Point(1, 4);
        Point p2 = new Point(2, 10);
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }
}