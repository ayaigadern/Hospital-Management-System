package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class LabTest {

    @Test
    public void instantiation() {
        Lab l = new Lab();
        assertNotNull(l);
    }

}
