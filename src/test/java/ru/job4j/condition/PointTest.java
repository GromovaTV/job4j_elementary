package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when10to20then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double expected = 1;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when02to04then1() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 4);
        double expected = 2;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

}