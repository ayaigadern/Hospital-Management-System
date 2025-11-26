package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BloodGroupTest {

    @Test
    public void gettersSetters() {
        BloodGroup b = new BloodGroup();
        b.setBloodGroupId(7);
        b.setBloodGroupName("O-");

        assertEquals(Integer.valueOf(7), b.getBloodGroupId());
        assertEquals("O-", b.getBloodGroupName());
    }

}
