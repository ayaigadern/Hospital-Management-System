package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShiftTimeTest {

    @Test
    public void fromToTimes() {
        ShiftTime s = new ShiftTime();
        s.setShiftTimeID(4);
        s.setFromTime("08:00");
        s.setToTime("16:00");

        assertEquals(4, s.getShiftTimeID());
        assertEquals("08:00", s.getFromTime());
        assertEquals("16:00", s.getToTime());
    }

}
