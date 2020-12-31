package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1nameOfDayMonday() {
        String result = SwitchWeek.nameOfDay(1);
        assertThat(result, is("Понедельник"));
    }

    @Test
    public void when4nameOfDayThursday() {
        String result = SwitchWeek.nameOfDay(4);
        assertThat(result, is("Четверг"));
    }

    @Test
    public void when10nameOfDayError() {
        String result = SwitchWeek.nameOfDay(10);
        assertThat(result, is("Ошибка"));
    }
}