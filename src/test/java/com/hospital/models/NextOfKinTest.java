package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NextOfKinTest {

    @Test
    public void gettersAndSetters() {
        NextOfKin kin = new NextOfKin();
        kin.setNextOfKinId(10);
        kin.setFullName("Alice Smith");
        kin.setPhone("010-020-030");
        kin.setAddress("Somewhere");
        kin.setRelationship("Sister");

        assertEquals(Integer.valueOf(10), kin.getNextOfKinId());
        assertEquals("Alice Smith", kin.getFullName());
        assertEquals("010-020-030", kin.getPhone());
        assertEquals("Somewhere", kin.getAddress());
        assertEquals("Sister", kin.getRelationship());
    }

}
