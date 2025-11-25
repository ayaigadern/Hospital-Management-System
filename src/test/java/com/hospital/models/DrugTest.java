package com.hospital.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class DrugTest {

    @Test
    public void gettersAndSetters() {
        Drug d = new Drug();
        d.setDrugId(77);
        d.setName("Aspirin");
        d.setCost(12.5);
        d.setQuantity(50);
        Date exp = new Date();
        d.setDrug_expired(exp);
        d.setStartDate(new Date());

        Employee emp = new Employee();
        emp.setFirstName("Pharm");
        d.setEmployee(emp);

        assertEquals(Integer.valueOf(77), d.getDrugId());
        assertEquals("Aspirin", d.getName());
        assertEquals(12.5, d.getCost());
        assertEquals(50, d.getQuantity());
        assertEquals(exp, d.getDrug_expired());
        assertEquals(emp, d.getEmployee());
    }

}
