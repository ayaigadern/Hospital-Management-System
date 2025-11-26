package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class DrugTest {

    @Test
    public void basicFields_withNullExpiry() {
        Drug d = new Drug();
        d.setDrugId(9);
        d.setName("Paracetamol");
        d.setCost(2.5);
        d.setQuantity(100);
        Date now = new Date();
        d.setStartDate(now);
        d.setDrug_expired(null);

        assertEquals(Integer.valueOf(9), d.getDrugId());
        assertEquals("Paracetamol", d.getName());
        assertEquals(2.5, d.getCost(), 0.0001);
        assertEquals(100, d.getQuantity());
        assertEquals(now, d.getStartDate());
        assertNull(d.getDrug_expired());
    }

    @Test
    public void basicFields_withExpiry() {
        Drug d = new Drug();
        d.setDrugId(9);
        d.setName("Paracetamol");
        d.setCost(2.5);
        d.setQuantity(100);
        Date now = new Date();
        d.setStartDate(now);
        d.setDrug_expired(now);

        assertEquals(Integer.valueOf(9), d.getDrugId());
        assertEquals("Paracetamol", d.getName());
        assertEquals(2.5, d.getCost(), 0.0001);
        assertEquals(100, d.getQuantity());
        assertNotNull(d.getDrug_expired());
    }

}
