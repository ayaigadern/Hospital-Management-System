package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class SelledDrugTest {

    @Test
    public void basicProperties() {
        SelledDrug s = new SelledDrug();
        s.setSelledDrugID(1);
        s.setQuantity(5);
        s.setUnitPerDay("2");
        Date now = new Date();
        s.setSelledDate(now);
        s.setStartDate(now);

        assertEquals(1, s.getSelledDrugID());
        assertEquals(5, s.getQuantity());
        assertEquals("2", s.getUnitPerDay());
        assertNotNull(s.getSelledDate());
    }

}
