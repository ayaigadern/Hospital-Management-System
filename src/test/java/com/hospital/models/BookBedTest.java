package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class BookBedTest {

    @Test
    public void bookBedFields() {
        BookBed b = new BookBed();
        b.setBedId(5);
        Date now = new Date();
        b.setDatePlaced(now);
        b.setDepartement("Cardiology");
        b.setStatus(true);

        assertEquals(Integer.valueOf(5), b.getBedId());
        assertNotNull(b.getDatePlaced());
        assertEquals("Cardiology", b.getDepartement());
        assertEquals(true, b.isStatus());
    }

}
