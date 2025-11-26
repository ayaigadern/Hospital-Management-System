package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class DiseaseTest {

    @Test
    public void fieldsAndAssociations() {
        Disease d = new Disease();
        d.setDiseaseId(8);
        d.setDisease("Flu");
        d.setNote("Mild");
        d.setDiseaseDate(new Date());

        assertEquals(Integer.valueOf(8), d.getDiseaseId());
        assertEquals("Flu", d.getDisease());
        assertEquals("Mild", d.getNote());
        assertNotNull(d.getDiseaseDate());
    }

}
