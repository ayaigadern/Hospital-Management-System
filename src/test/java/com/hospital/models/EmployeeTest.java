package com.hospital.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void basicGettersAndSetters() {
        Employee e = new Employee();
        e.setEmployeeId(123);
        e.setFirstName("Alice");
        e.setFamilyName("Smith");
        e.setUsername("asmith");
        e.setPassword("secret");
        e.setEmail("alice@example.com");
        e.setPhone("555-1212");
        e.setDob(new Date());

        Category cat = new Category("Cardiology");
        e.setCategory(cat);

        WorkExperince w = new WorkExperince();
        w.setNameOfOrganization("Hospital A");
        w.setPosition("Resident");

        Qualification q = new Qualification();
        q.setInstituteName("Med University");
        q.setDegree("MD");

        List<WorkExperince> works = Arrays.asList(w);
        List<Qualification> quals = Arrays.asList(q);

        e.setWorkExperinces(works);
        e.setQualifications(quals);

        assertEquals(Integer.valueOf(123), e.getEmployeeId());
        assertEquals("Alice", e.getFirstName());
        assertEquals("Smith", e.getFamilyName());
        assertEquals("asmith", e.getUsername());
        assertEquals("secret", e.getPassword());
        assertEquals("alice@example.com", e.getEmail());
        assertEquals(cat, e.getCategory());
        assertEquals(works, e.getWorkExperinces());
        assertEquals(quals, e.getQualifications());
    }

}
