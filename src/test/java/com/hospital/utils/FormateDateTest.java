package com.hospital.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class FormateDateTest {

    @Test
    public void parseAndFormat_fullMonth() {
        Date date = FormateDate.getFormatedDate("08/16/2016");
        assertNotNull(date);
        String formatted = FormateDate.getStringDate(date);
        assertEquals("08/16/2016", formatted);
    }

    @Test
    public void parseAndFormat_noLeadingZero() {
        Date date = FormateDate.getFormatedDate("8/6/2016");
        assertNotNull(date);
        String formatted = FormateDate.getStringDate(date);
        assertEquals("08/06/2016", formatted);
    }

}
