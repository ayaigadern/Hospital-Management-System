package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class DrugTest {

    @Test
    public void basicProperties() {
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
        assertEquals(2.5, d.getCost());
        assertEquals(100, d.getQuantity());
        assertNotNull(d.getStartDate());
    }

}
