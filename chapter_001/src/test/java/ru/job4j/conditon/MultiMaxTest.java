package ru.job4j.conditon;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {


    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(5, 2, 3);
        assertThat(result, is(5));

    }
}
