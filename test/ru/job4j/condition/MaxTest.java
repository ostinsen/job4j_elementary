package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax6To2then3() {
        int result = Max.max(6, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax4To4then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

}