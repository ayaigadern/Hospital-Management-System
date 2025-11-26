package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class NurseTest {

    @Test
    public void nurseIsInstantiable() {
        Nurse n = new Nurse();
        assertNotNull(n);
    }

}
