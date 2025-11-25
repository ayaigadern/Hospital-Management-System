package com.hospital.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EnumsTest {

    @Test
    public void entityValues() {
        Entity[] vals = Entity.values();
        assertTrue(vals.length > 0);
        assertEquals(Entity.Admin, Entity.valueOf("Admin"));
    }

    @Test
    public void actionTypeValues() {
        // basic sanity checks for enum names
        assertEquals("AddEmployee", ActionType.AddEmployee.name());
        // ensure a few values exist
        assertNotNull(ActionType.valueOf("DeleteDrug"));
        assertNotNull(ActionType.valueOf("InvoiceDrug"));
    }

}
