package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayNumberOfDay1() {
        int result = MultipleSwitchWeek.numberOfDay("Monday");
        assertThat(result, is(1));

    }

    @Test
    public void whenSundayNumberOfDay7() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        assertThat(result, is(7));
    }

    @Test
    public void whenWrongNumberOfDayNot1() {
        int result = MultipleSwitchWeek.numberOfDay("Mon");
        assertThat(result, is(-1));

    }
}