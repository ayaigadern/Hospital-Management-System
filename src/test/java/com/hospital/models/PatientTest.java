package com.hospital.models;

import static org.junit.jupiter.api.Assertions.*;

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

}
