package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class EmployeeStatatisticTest {

    @Test
    public void basicNumberAndType() {
        EmployeeStatatistic s = new EmployeeStatatistic();
        s.setType("Doctor");
        s.setNumber(new BigDecimal(12));

        assertEquals("Doctor", s.getType());
        assertEquals(new BigDecimal(12), s.getNumber());
    }

}
