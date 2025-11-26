package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AccountantTest {

    @Test
    public void instantiation() {
        Accountant a = new Accountant();
        assertNotNull(a);
    }

}
