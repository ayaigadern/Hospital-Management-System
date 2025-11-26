package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class DoctorTest {

    @Test
    public void doctorIsInstantiable() {
        Doctor d = new Doctor();
        assertNotNull(d);
    }

}
