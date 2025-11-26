package com.hospital.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void basicPropertiesAndCollections() {
        Employee e = new Employee();
        e.setEmployeeId(55);
        e.setFirstName("Bob");
        e.setFamilyName("Builder");
        e.setEmail("bob@build.com");
        e.setPhone("777-666");
        Date d = new Date();
        e.setDob(d);

        // lists are initialized in constructor
        assertNotNull(e.getWorkExperinces());
        assertNotNull(e.getQualifications());

        // set and get simple fields
        assertEquals(Integer.valueOf(55), e.getEmployeeId());
        assertEquals("Bob", e.getFirstName());
        assertEquals("Builder", e.getFamilyName());
        assertEquals("bob@build.com", e.getEmail());
        assertEquals("777-666", e.getPhone());
        assertEquals(d, e.getDob());

        // set a couple of items in lists
        e.setWorkExperinces(new ArrayList<WorkExperince>());
        e.setQualifications(new ArrayList<Qualification>());

        assertNotNull(e.getWorkExperinces());
        assertNotNull(e.getQualifications());
    }

}
