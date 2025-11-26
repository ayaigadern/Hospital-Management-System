package com.hospital.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class FormateDateTest {

    @Test
    public void parsesAndFormatsValidDate() {
        Date d = FormateDate.getFormatedDate("01/17/2017");
        assertNotNull(d);
        String s = FormateDate.getStringDate(d);
        assertEquals("01/17/2017", s);
    }

    @Test
    public void returnsNullForInvalid() {
        Date d = FormateDate.getFormatedDate("not-a-date");
        assertNull(d);
    }

    @Test
    public void parseAndFormat_noLeadingZero() {
        Date date = FormateDate.getFormatedDate("8/6/2016");
        assertNotNull(date);
        String formatted = FormateDate.getStringDate(date);
        assertEquals("08/06/2016", formatted);
    }

}
