package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
        int x1 = 8;
        int y1 = 6;
        int x2 = 4;
        int y2 = 3;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}
