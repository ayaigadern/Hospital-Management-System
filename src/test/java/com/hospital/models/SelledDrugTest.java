package com.hospital.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class SelledDrugTest {

    @Test
    public void gettersAndAssociations() {
        SelledDrug s = new SelledDrug();
        s.setSelledDrugID(5);
        s.setQuantity(3);
        s.setUnitPerDay("2 pills");
        Date now = new Date();
        s.setSelledDate(now);
        s.setStartDate(now);
        s.setEndDate(now);

        Drug d = new Drug();
        d.setName("Ibuprofen");
        s.setDrug(d);

        Patient p = new Patient();
        p.setName("Patient X");
        s.setPatient(p);

        Pharmatiest ph = new Pharmatiest();
        ph.setFirstName("Pharm1");
        s.setPharmatiest(ph);

        assertEquals(5, s.getSelledDrugID());
        assertEquals(3, s.getQuantity());
        assertEquals("2 pills", s.getUnitPerDay());
        assertEquals(d, s.getDrug());
        assertEquals(p, s.getPatient());
        assertEquals(ph, s.getPharmatiest());
        assertEquals(now, s.getSelledDate());
    }

}
