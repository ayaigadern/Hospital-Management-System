package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class XrayTest {

    @Test
    public void instantiation() {
        Xray x = new Xray();
        assertNotNull(x);
    }

}
