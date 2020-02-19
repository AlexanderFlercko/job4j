package ru.job4j.conditon;

import org.junit.Test;
import ru.job4j.condition.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(5, 7);
        assertThat(result, is(7));
    }
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax1To2Then() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
}
