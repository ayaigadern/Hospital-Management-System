package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PatientDrugInvoiceTest {

    @Test
    public void amountAndFields() {
        PatientDrugInvoice p = new PatientDrugInvoice();
        p.setPatientID(42);
        p.setDrugId(3);
        p.setDrugName("Aspirin");
        p.setQuantity(2);
        p.setTotalCost(5.0);

        assertEquals(Integer.valueOf(42), p.getPatientID());
        assertEquals(Integer.valueOf(3), p.getDrugId());
        assertEquals("Aspirin", p.getDrugName());
        assertEquals(2, p.getQuantity());
        assertEquals(5.0, p.getTotalCost());
    }

}
