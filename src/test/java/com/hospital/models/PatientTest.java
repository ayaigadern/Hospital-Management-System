package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class PatientTest {

    @Test
    public void gettersAndSetters() {
        Patient p = new Patient();
        p.setPatientId(100);
        p.setName("John Doe");
        p.setPhone(1234567890L);
        p.setEmail("john@example.com");

        assertEquals(Integer.valueOf(100), p.getPatientId());
        assertEquals("John Doe", p.getName());
        assertEquals(1234567890L, p.getPhone());
        assertEquals("john@example.com", p.getEmail());
    }

    @Test
    public void associations() {
        Patient p = new Patient();
        BloodGroup bg = new BloodGroup();
        bg.setBloodGroupId(5);
        bg.setBloodGroupName("A+");
        p.setBloodGroup(bg);

        NextOfKin kin = new NextOfKin();
        kin.setFullName("Jane Doe");
        p.setNextOfKin(kin);

        assertNotNull(p.getBloodGroup());
        assertEquals("A+", p.getBloodGroup().getBloodGroupName());
        assertEquals("Jane Doe", p.getNextOfKin().getFullName());
    }

    @Test
    public void fullObjectRoundtrip() {
        Patient p = new Patient();
        p.setPatientId(123);
        p.setName("John Doe");
        p.setEmail("john@example.com");
        p.setAddress("123 Main St");
        p.setPhone(5551234L);
        Date now = new Date();
        p.setDob(now);

        NextOfKin nok = new NextOfKin();
        nok.setFullName("Jane Doe");
        nok.setPhone("999-888-777");
        p.setNextOfKin(nok);

        assertEquals(Integer.valueOf(123), p.getPatientId());
        assertEquals("John Doe", p.getName());
        assertEquals("john@example.com", p.getEmail());
        assertEquals("123 Main St", p.getAddress());
        assertEquals(5551234L, p.getPhone());
        assertEquals(now, p.getDob());
        assertNotNull(p.getNextOfKin());
        assertEquals("Jane Doe", p.getNextOfKin().getFullName());
    }

}
